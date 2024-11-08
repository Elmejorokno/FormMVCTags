package com.app.controllers;

import com.app.models.Student;
import com.app.utils.MajorsUtil;
import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());

        model.addAttribute("majors", MajorsUtil.getMajors());

        return "register-student";
    }

    @PostMapping("/register")
    public String processForm(@Valid @ModelAttribute Student student, BindingResult result, Model model) {
        if(result.hasErrors()) {
            model.addAttribute("majors", MajorsUtil.getMajors());
            return "register-student";
        }
        return "welcome-student";
    }

    @InitBinder
    public void initStringBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }
}
