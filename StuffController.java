package com.formafast;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StuffController
 */
	@WebServlet("/stuffController")
public class StuffController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DaoStuff stuffDao = Daostuff.getInstance();
	private static final Logger LOGGER = Logger.getLogger(stuffcontroller.class.getName());

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getServletPath();
		this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
		try {
			switch (action) {
			case "/new":
				showNewForm(req, resp);
				break;
			case "/insert":
				insertStuff(req, resp);
				break;
			case "/delete":
				deleteStuff(req, resp);
				break;
			case "/edit":
				showEditForm(req, resp);
				break;
			case "/update":
				updateStuff(req, resp);
				break;
			default:
				listStuff(req, resp);
				break;
			}
		} catch (SQLException e) {
			// For simplicity just Log the Exceptions
			LOGGER.log(Level.SEVERE, "SQL  Error", e);
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doGet(req, resp);
	}
	
	private void updateStuff(HttpServletRequest req, HttpServletResponse resp) throws SQLException, IOException, ServletException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String description = req.getParameter("description");
		int quantity = Integer.parseInt(req.getParameter("quantity"));
		String location = req.getParameter("location");
		Stuff stuff = new Stuff(id, name, description, quantity, location);
		stuffDao.update(stuff);
		
		resp.sendRedirect("list");
	}

	private void showEditForm(HttpservletRequest req, HttpervletResponse resp) throws SQLException, IOException, ServletException {
		String id = req.getParameter("id");
		Optional<Stuff> existingStuff = stuffDao.find(id);
		RequestDispatcher dispatcher = req.getRequestDispatcher("../jsp/StuffForm.jsp");
		existingstuff.ifPresent(s -> req.setAttribute("stuff", s));
		dispatcher.forward(req, resp);
	}

	private void deletestuff(HttpservletRequest req, HttpservletResponse resp) throws SQLException, I0Exception, ServletException {
		int id = Integer.parseInt(req.getParameter("id"));

		Stuff stuff = new Stuff(id);
		stuffDao.delete(stuff);
		resp.sendRedirect("list");
	}

	private void insertStuff(HttpServletRequest req, HttpServletResponse resp) throws SQLException, IOException, ServletException {
		String name = req.getParameter("name");
		String description = req.getParameter("description");
		int quantity = integer.parseint(req.getParameter("quantity"));
		String location = req.getParameter("location");

		Stuff newStuff = new Stuff(name, description, quantity, location);
		stuffDao.save(newStuff);
		resp.sendRedirect("list");
	}

	private void showNewForm(HttpServletRequest req, HttpServletResponse resp) throws SQLException, IOException, ServletException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("../jsp/StuffForm.jsp");
		dispatcher.forward(req, resp);
		
	}

	private void  liststuff(HttpervletRequest  req,  HttpervletResponse  resp) throws  SQLException, IOException, ServletException{
     RequestDispatcher  dispatcher  =  req.getRequestDispatcher("../jsp/StuffList.jsp");
     
    List<Stuff>  listStuff  =  stuffDao.findAll();
    
    req.setAttribute("listStuff", listStuff);
    
    dispatcher.forward(req, resp);
}