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

import com.formafast.model.Company;
import com.formafast.service.CompanyService;

@Controller
public class CompanyController {

	private static final Logger logger = Logger
			.getLogger(CompanyController.class);

	public CompanyController() {
		System.out.println("CompanyController()");
	}

	@Autowired
	private CompanyService companyService;
	@RequestMapping("/")  
    public String showform(Model m){  
    	m.addAttribute("company", new Company());
    	return "CompanyForm"; 
    } 
	@RequestMapping(value = "/listCompany")
	public ModelAndView listCompany(ModelAndView model) throws IOException {
		List<Company> listCompany = companyService.getAllCompanys();
		model.addObject("listCompany", listCompany);
		model.setViewName("home");
		return model;
	}

	@RequestMapping(value = "/newCompany", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Company company = new Company();
		model.addObject("company", company);
		model.setViewName("CompanyForm");
		return model;
	}

	@RequestMapping(value = "/saveCompany", method = RequestMethod.POST)
	public ModelAndView saveCompany(@ModelAttribute Company company) {
		if (company.getId() == 0) { // if company id is 0 then creating the
			// company other updating the company
			companyService.addCompany(company);
		} else {
			companyService.updateCompany(company);
		}
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/deleteCompany", method = RequestMethod.GET)
	public ModelAndView deleteCompany(HttpServletRequest request) {
		int companyId = Integer.parseInt(request.getParameter("id"));
		companyService.deleteCompany(companyId);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editCompany", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int companyId = Integer.parseInt(request.getParameter("id"));
		Company company = companyService.getCompany(companyId);
		ModelAndView model = new ModelAndView("CompanyForm");
		model.addObject("company", company);

		return model;
	}

}