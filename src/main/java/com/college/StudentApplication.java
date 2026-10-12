package com.college;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@SpringBootApplication
@RestController
public class StudentApplication{
    List<String> students=new ArrayList<>();
    public static void main(String [] args){
        SpringApplication.run(StudentApplication.class,args);
    }
    @GetMapping("/")
    String home(){
        return "Students Management, Welcome!!";
    }
    @GetMapping("/add")
    String add(@RequestParam String name){
        students.add(name);
        return "Added: " + name;
    }
    @GetMapping("/students")
    List<String> view(){
        return students;
        
    }
}