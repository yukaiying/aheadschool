package com.ahead.school.action;


import com.ahead.school.entity.id;
import com.ahead.school.servlet.idServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/id")
public class StudentAction {

    @Autowired
    private idServlet IdServlet;
    @GetMapping("/list")
    public String IdList(Model model){
        model.addAttribute("IdList", IdServlet.IdList());
        return "back/Idlist";
    }

    @PostMapping("/byId/{id}")
    @ResponseBody
    public id getidById(@PathVariable("id") Long id){
        return IdServlet.getidById(id);
    }


    @PostMapping("/save")
    public String saveid(id Id){
        IdServlet.insertOrUpdate(Id);
        return "redirect:/Id/list";
    }


    @GetMapping("/del/{id}")
    public String delid(@PathVariable("id") Long id){
        IdServlet.delById(id);
        return "redirect:/Id/list";
    }
}
