package com.ahead.school.action;

import com.ahead.school.dao.ClassDao;
import com.ahead.school.dao.GradeDao;
import com.ahead.school.entity.ClassEntity;
import com.ahead.school.entity.Grade;
import com.ahead.school.servlet.ClassServlet;
import com.ahead.school.servlet.GradeServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/classEntity")
public class ClassAction {
    @Autowired
    private ClassServlet classServlet;
    private GradeServlet gradeServlet;

    @GetMapping("list")
    public String classEntityList(Model model) {
        model.addAttribute("classEntityList",classServlet.classEntityList());
//        model.addAttribute("gradeList", gradeServlet.gradeList());
        return "classEntitylist";
    }
//    public String gradeList(Model model) {
//        model.addAttribute("gradeList", gradeServlet.gradeList());
//        return "classEntitylist";
//    }

    @PostMapping("/save")
    public String saveClassEntity(ClassEntity classEntity) {
        classServlet.insertOrUpdate(classEntity);
//        gradeServlet.insertOrUpdate(Grade);
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
