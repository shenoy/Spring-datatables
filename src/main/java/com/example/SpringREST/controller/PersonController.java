package com.example.SpringREST.controller;

import com.example.SpringREST.model.Person;
import com.example.SpringREST.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Hashtable;
import java.util.List;


@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    PersonService ps;

    @RequestMapping("/all")
    public List< Person> getAll(){
        return ps.getAll();
    }

//    @RequestMapping("/{id}")
//    public Person getPerson(@PathVariable("id") String id){
//        return ps.getPerson(id);
//    }
}
