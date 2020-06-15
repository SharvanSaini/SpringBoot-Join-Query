package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dom.StudentDetail;
import com.demo.model.StudentEntity;
import com.demo.services.QueryService;



@RestController
@RequestMapping("/api")
public class QueryController {

    @Autowired
    QueryService queryservice;

    @GetMapping("/joinQuery")
    public List<StudentDetail> getQuery()
    {
    	System.out.println("join Query called .........");
        return queryservice.JPQLQuery();
    }
    
    
//    http://localhost:8081/api/studentData
    @GetMapping("/studentData")
    public List<StudentEntity> getstudentData()
    {
    	System.out.println("student Entity called .......");
        return queryservice.studentAllData();
    }
}