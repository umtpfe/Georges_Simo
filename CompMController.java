package com.formafast.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.formafast.model.CompM;
import com.formafast.service.CompMService;
import com.formafast.service.CompMServiceImpl;


@Controller
public class CompMController {

	private static final Logger logger = Logger
			.getLogger(CompMController.class);

	public CompMController() {
		System.out.println("CompMController()");
	}

	@Autowired
	private CompMService compMService;
	@RequestMapping(value = "/")
	public ModelAndView listEmployee(ModelAndView model) throws IOException {
		List<CompM> listCompM = compMService.getAllCompMs();
		model.addObject("listCompM ", listCompM );
		model.setViewName("home");
		return model;
	}

	@RequestMapping(value = "/newcompM", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		CompM compM = new CompM();
		model.addObject("compM", compM);
		model.setViewName("CompMForm");
		return model;
	}

	@RequestMapping(value = "/saveCompM", method = RequestMethod.POST)
	public ModelAndView saveCompM(@ModelAttribute CompM compM) {
		if (compM.getId() == 0) { // if compM id is 0 then creating the
			// compM other updating the compM
			compMService.addCompM(compM);
		} else {
			compMService.updateCompM(compM);
		}
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/deleteCompM", method = RequestMethod.GET)
	public ModelAndView deleteCompM(HttpServletRequest request) {
		int compMId = Integer.parseInt(request.getParameter("id"));
		compMService.deleteCompM(compMId);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editCompM", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int compMId = Integer.parseInt(request.getParameter("id"));
		CompM compM = compMService.getCompM(compMId);
		ModelAndView model = new ModelAndView("CompMForm");
		model.addObject("compM", compM);

		return model;
	}

}