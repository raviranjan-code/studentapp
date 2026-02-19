package com.ravi.studentapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import com.ravi.studentapp.entity.Student;
import com.ravi.studentapp.repository.StudentRepository;

@Controller
@RequestMapping("/student")
public class StudentController {

    private final StudentRepository studentRepository;

    @Autowired
    private Environment environment;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping
    public String showForm(Model model) {
        Student student = new Student();
        student.setEducation(new com.ravi.studentapp.entity.EducationAcademicDetails());
        model.addAttribute("student", student);
        return "student-form";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student) {

        if(student.getEducation() != null){
            student.getEducation().setStudent(student);
        }

        studentRepository.save(student);
        return "redirect:/";
    }

    @GetMapping("/health")
    @ResponseBody
    public String health() {

        String port = environment.getProperty("local.server.port");

        if (port == null) {
            port = environment.getProperty("server.port");
        }

        return "Running on port: " + port;
    }
}

