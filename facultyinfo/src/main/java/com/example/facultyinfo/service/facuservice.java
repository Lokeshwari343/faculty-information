package com.example.facultyinfo.service;

import com.example.facultyinfo.model.facumodel;
import com.example.facultyinfo.repository.facurepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class facuservice {
    @Autowired
    private facurepo repo;
    public facumodel createfaculty(facumodel faculty){

        return repo.save(faculty);
    }

    public List<facumodel> getfaculty() {

        return repo.findAll();
    }

    public facumodel getfaculty(int id) {
        return repo.findById(id).orElse(null);
    }

    public List<facumodel> createfaculty(List<facumodel> faculties) {
        return repo.saveAll(faculties);
    }

    public String deletefaculty(int id) {
        return null;
    }

    public facumodel updatefaculty(int id, facumodel student) {
        facumodel faculty = null;
        return faculty;
    }

}



