package com.ahead.school.action;/*
 *文件名: TeacherAction
 *创建者: solfeng
 *创建时间:2020/11/12 14:24
 */


import com.ahead.school.entity.Teacher;
import com.ahead.school.servlet.TeacherServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/teacher")
public class TeacherAction {
    @Autowired
    private TeacherServlet teacherServlet;
    @GetMapping("/list")
    public String Teacherslist(Model model) {
        model.addAttribute("Teacherslist",teacherServlet.teachersList());
        return "Teacherslist";
    }
    @PostMapping("/byId/{id}")
    @ResponseBody
    public Teacher getTeachersById(@PathVariable("id") Long id) {
        return teacherServlet.getteachersById(id);
    }

    @PostMapping("/save")
    @ResponseBody
    public String saveTeachers(Teacher teacher) {
        teacherServlet.insertOrUpdate(teacher);
        return "成功";
    }

    @GetMapping("/del/{id}")
    public String delTeachers(@PathVariable("id") Long id) {
        teacherServlet.delById(id);
        return "redirect:/./del";
    }
}
