package com.ahead.school.action;

import com.ahead.school.entity.StudentCourse;
import com.ahead.school.servlet.StudentCourseServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/studentCourse")
public class StudentCourseAction {
    @Autowired
    private StudentCourseServlet studentCourseServlet;
    
    @GetMapping("list")
    public String studentCourseList(Model model) {
        model.addAttribute("studentCourseList",studentCourseServlet.studentCourseList());
        return "studentCourselist";
    }

    @PostMapping("/save")
    public String saveStudentCourse(StudentCourse studentCourse) {
        studentCourseServlet.insertOrUpdate(studentCourse);
//        gradeServlet.insertOrUpdate(Grade);
        return "redirect:/studentCourse/list";
    }
    @PostMapping("/byId/{id}")
    @ResponseBody
    public StudentCourse getStudentCourseById(@PathVariable("id") Integer id) {
        return studentCourseServlet.getStudentCourseById(id);
    }

    @GetMapping("/del/{id}")
    public String delStudentCourse(@PathVariable("id") Integer id) {
        studentCourseServlet.delById(id);
        return "redirect:/studentCourse/list";
    }
}
