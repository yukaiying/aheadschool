package com.ahead.school.action;

import com.ahead.school.entity.Course;
//import com.ahead.school.entity.Student;
import com.ahead.school.servlet.CourseServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/course")
public class CourseAction {
    @Autowired
    private CourseServlet courseServlet;
    @GetMapping("/list")
    public String CourseList(Model model){
        model.addAttribute("IdList", courseServlet.courseList());
        return "back/Idlist";
    }

    @PostMapping("/byId/{id}")
    @ResponseBody
    public Course getCourseById(@PathVariable("id") Long id){
        return courseServlet.getCourseById(id);
    }


    @PostMapping("/save")
    public String saveid(Course course){
        courseServlet.insertOrUpdate(course);
        return "redirect:/Id/list";
    }


    @GetMapping("/del/{id}")
    public String delid(@PathVariable("id") Long id){
        courseServlet.delByStudentId(id);
        return "redirect:/Id/list";
    }

}
