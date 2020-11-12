package com.ahead.school.action;

import com.ahead.school.servlet.GradeServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
