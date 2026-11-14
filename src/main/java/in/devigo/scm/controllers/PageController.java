package in.devigo.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home mapping handler");
        model.addAttribute("name", "Pawan");
        return "home";
    }

    @RequestMapping("/about")
    public String aboutPage(){
        System.out.println("About page loading.");
        return "about";
    }

    @RequestMapping("/services")
    public String servicePage(){
        System.out.println("Services page loading.");
        return "services";
    }
}
