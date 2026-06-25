package com.naitik.studentapi.controller;
import com.naitik.studentapi.model.Student;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;   // Resource identify karta hai.....
import org.springframework.web.bind.annotation.RequestParam;// Filter / Search ke liye......
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.swing.text.Style;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

@RestController
public class StudentController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Naitik Tayal,Backend Started";
    }

    @GetMapping("/student")
    public Map<String, Object> getStudent() {

        Map<String, Object> student = new HashMap<>();

        student.put("id", 1);
        student.put("name", "Naitik");
        student.put("Collage", "ABESIT");

        return student;

    }

    @GetMapping("/student-object")
    public Student getStudentObject() {

        Student student = new Student(1, "Naitik Tayal", "ABESIT");
        return student;

    }

    @GetMapping("/students")
    public List<Student> getStudents() {

        List<Student> students =
                new ArrayList<>();

        students.add(
                new Student(
                        1,
                        "Naitik",
                        "ABESIT"
                )
        );

        students.add(
                new Student(
                        2,
                        "Rahul",
                        "AKGEC"
                )
        );

        students.add(
                new Student(
                        3,
                        "Aman",
                        "KIET"
                )
        );
        students.add(new Student(4, "Rohit", "GLA"));
        students.add(new Student(5, "Mohit", "Galgotias"));

        return students;
    }

    @GetMapping("/collage")
    public String collage() {

        return "ABESIT";

    }

    @GetMapping("/student/{id}")
    public String getStudentById(@PathVariable int id) {
        return "Student Id IS :" + id;

    }

    @GetMapping("/student/{id}/{name}")
    public String getStudentData(
            @PathVariable int id,
            @PathVariable String name) {
        return "ID = " + id + " Nmae = " + name;
    }

    @GetMapping("/search")
    public String searchStudent(
            @RequestParam String name) {

        return "Searching Student : " + name;
    }

    @GetMapping("/add")
    public int add(
            @RequestParam int num1,
            @RequestParam int num2) {
        return num1 + num2;
    }

    @GetMapping("/multily")
    public int multiply(
            @RequestParam int num3,
            @RequestParam int num4) {
        return num3 * num4;
    }

    @PostMapping("/student")
    public Student createStudent(
            @RequestBody Student student) {

        return student;
    }

    @GetMapping("/collage/{name}")
    public String college (@PathVariable String name) {

        return " Welcome " + name;
    }

    @GetMapping("/square/{num}")
    public int square(@PathVariable int num){

        return num*num;
    }

    @GetMapping("/sum/{a}/{b}")
    public int sum(@PathVariable int a ,
                   @PathVariable int b) {

        return a+b;
    }

    @GetMapping("/helloo")
    public String helloo(
            @RequestParam(required = false)
            String name ){
        return "Hello " + name;
    }

}