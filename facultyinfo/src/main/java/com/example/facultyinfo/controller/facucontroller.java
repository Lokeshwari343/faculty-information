package com.example.facultyinfo.controller;

import com.example.facultyinfo.model.facumodel;
import com.example.facultyinfo.service.facuservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sriindu")
public class facucontroller {
    @Autowired
    private facuservice service;
    @PostMapping("/addfaculty")
    public facumodel addfaculty(@RequestBody facumodel faculty){return service.createfaculty(faculty);}
    @PostMapping("/addfaculties")
    public List<facumodel>addfaculties(@RequestBody List<facumodel>facumodel){
        return service.createfaculty(facumodel);
    }
    @GetMapping("/faculties")
    public List<facumodel> getfaculties(){
        return service.getfaculty();

    }
    @GetMapping("/faculty/{id}")
    public facumodel getfaculties(@PathVariable int id){
        return service.getfaculty(id);

    }
    @DeleteMapping("/faculty/{id}")
    public String deletefaculty(@PathVariable int id){
        return service.deletefaculty(id);
    }
    @PutMapping("/student/{id}")
    public facumodel updatestudent(@PathVariable int id,@RequestBody facumodel facumodel){
        return service.updatefaculty(id, facumodel);
    }
}

