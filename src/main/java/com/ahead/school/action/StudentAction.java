package com.ahead.school.action;


import com.ahead.school.entity.Student;
import com.ahead.school.servlet.StudentServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
public class StudentAction {

    @Autowired
    private StudentServlet studentServlet;
    @GetMapping("/list")
    public String StudentList(Model model){
        model.addAttribute("IdList", studentServlet.studentList());
        return "back/Idlist";
    }

    @PostMapping("/byId/{id}")
    @ResponseBody
    public Student getStudentById(@PathVariable("id") Long id){
        return studentServlet.getStudentById(id);
    }


    @PostMapping("/save")
    public String saveid(Student student){
        studentServlet.insertOrUpdate(student);
        return "redirect:/Id/list";
    }


    @GetMapping("/del/{id}")
    public String delid(@PathVariable("id") Long id){
        studentServlet.delByStudentId(id);
        return "redirect:/Id/list";
    }
}
