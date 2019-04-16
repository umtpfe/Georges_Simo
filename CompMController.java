package com.formafast.controllers;   
  
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;

import com.formafast.beans.CompM;
import com.formafast.dao.CompMDao;
  
@Controller  
public class CompMController {  
    @Autowired  
    CompMDao dao; //will inject dao from xml file  
      
    /*It displays a form to input data, here "command" is a reserved request attribute 
     *which is used to display object data into form 
     */  
    @RequestMapping("/compmform")  
    public String showform(Model m){  
    	m.addAttribute("command", new CompM());
    	return "compmform"; 
    }  
    /*It saves object into database. The @ModelAttribute puts request data 
     *  into model object. You need to mention RequestMethod.POST method  
     *  because default request is GET*/  
    @RequestMapping(value="/save",method = RequestMethod.POST)  
    public String save(@ModelAttribute("compm") CompM compm){  
        dao.save(compm);  
        return "redirect:/viewcompm";//will redirect to viewcompm request mapping  
    }  
    /* It provides list of employees in model object */  
    @RequestMapping("/viewcompm")  
    public String viewcompm(Model m){  
        List<CompM> list=dao.getCompanyMailer();  
        m.addAttribute("list",list);
        return "viewcompm";  
    }  
    /* It displays object data into form for the given id.  
     * The @PathVariable puts URL data into variable.*/  
    @RequestMapping(value="/editcompM/{id}")  
    public String edit(@PathVariable int id, Model m){  
        CompM compM=dao.getCompMById(id);   
        m.addAttribute("command",compM);
        return "compmeditform";  
    }  
    /* It updates model object. */  
    @RequestMapping(value="/editsave",method = RequestMethod.POST)  
    public String editsave(@ModelAttribute("compM") CompM compM){  
        dao.update(compM);  
        return "redirect:/viewcompm";  
    }  
    /* It deletes record for the given id in URL and redirects to /viewcompM */  
    @RequestMapping(value="/deletecompM/{id}",method = RequestMethod.GET)  
    public String delete(@PathVariable int id){  
        dao.delete(id);  
        return "redirect:/viewcompm";  
    }   
}  