package com.ahead.school.action;

import com.ahead.school.entity.Grade;
import com.ahead.school.servlet.GradeServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/grade")
public class GradeAction {
    @Autowired
    private GradeServlet gradeServlet;

    @GetMapping("list")
    public String GradeList(Model model) {
        model.addAttribute("list",gradeServlet.gradeList());
        return "Gradelist";
    }
    @PostMapping("/save")
    public String saveGrade(Grade grade) {
        gradeServlet.insertOrUpdate(grade);
        return "redirect:/grade/list";
    }

    @PostMapping("/byId/{id}")
    @ResponseBody
    public Grade getGradeById(@PathVariable("id") Integer id) {
        return gradeServlet.getGradeById(id);
    }

    @GetMapping("/del/{id}")
    public String delGrade(@PathVariable("id") Integer id) {
        gradeServlet.delById(id);
        return "redirect:/grade/list";
    }
}
