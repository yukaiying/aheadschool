package com.ahead.school.action;

import com.ahead.school.entity.ClassEntity;
import com.ahead.school.servlet.ClassServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/classEntity")
public class ClassAction {
    @Autowired
    private ClassServlet classServlet;

    @GetMapping("list")
    public String classEntityList(Model model) {
        model.addAttribute("classEntityList",classServlet.classEntityList());
        return "classEntitylist";
    }

    @PostMapping("/save")
    public String saveClassEntity(ClassEntity classEntity) {
        classServlet.insertOrUpdate(classEntity);
        return "redirect:/classEntity/list";
    }
    
    @PostMapping("/byId/{id}")
    @ResponseBody
    public ClassEntity getClassEntityById(@PathVariable("id") Integer id) {
        return classServlet.getClassEntityById(id);
    }
    
    @GetMapping("/del/{id}")
    public String delClassEntity(@PathVariable("id") Integer id) {
        classServlet.delById(id);
        return "redirect:/classEntity/list";
    }
}
