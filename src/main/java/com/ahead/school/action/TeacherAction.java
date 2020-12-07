package com.ahead.school.action;/*
 *文件名: TeacherAction
 *创建者: solfeng
 *创建时间:2020/11/12 14:24
 */


import com.ahead.school.entity.Teacher;
import com.ahead.school.servlet.TeacherQueryServiceImpl;
import com.ahead.school.servlet.TeacherServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/teacher")
public class TeacherAction {
    @Autowired
    private TeacherServlet teacherServlet;
    @Autowired
    private TeacherQueryServiceImpl teacherQueryServiceIml;


    @GetMapping("/list")
    public String Teacherslist(Model model) {
        model.addAttribute("Teacherslist", teacherServlet.teachersList());
        return "Teacherslist";
    }

    @PostMapping("/byId/{id}")
    @ResponseBody
    public Teacher getTeachersById(@PathVariable("id") Long id) {
        return teacherServlet.getteachersById(id);
    }

    @PostMapping("/save")
    public String saveTeachers(Teacher teacher) {
        teacherServlet.insertOrUpdate(teacher);
        return "成功";
    }

    @GetMapping("/del/{id}")
    public String delTeachers(@PathVariable("id") Long id) {
        teacherServlet.delById(id);
        return "redirect:/./del";
    }
    @PostMapping("/findTeacherQuery/{page}/{size}")
    @ResponseBody
    public Page<Teacher> findBookQuery( @PathVariable("page") Integer page,
                                @PathVariable("size") Integer size, Teacher teacher){

        Page<Teacher> data = teacherQueryServiceIml.findTeacherCriteria(page, size,teacher);
//        modelMap.addAttribute("data", data);
        return data;
    }

}
