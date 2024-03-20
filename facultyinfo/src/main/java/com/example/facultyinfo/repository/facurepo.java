package com.example.facultyinfo.repository;

import com.example.facultyinfo.model.facumodel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface facurepo extends JpaRepository<facumodel,Integer> {
}