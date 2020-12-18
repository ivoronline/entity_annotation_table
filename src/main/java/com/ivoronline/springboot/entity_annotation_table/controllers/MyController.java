package com.ivoronline.springboot.entity_annotation_table.controllers;

import com.ivoronline.springboot.entity_annotation_table.entities.PersonEntity;
import com.ivoronline.springboot.entity_annotation_table.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

  @Autowired
  PersonRepository personRepository;

  @ResponseBody
  @RequestMapping("/addPerson")
  public String addPerson() {

    //CREATE ENTITY OBJECT
    PersonEntity personEntity      = new PersonEntity();
                 personEntity.name = "John";
                 personEntity.age  = 20;

    //STORE ENTITY OBJECT INTO DB
    personRepository.save(personEntity);

    //RETURN SOMETHING TO BROWSER
    return personEntity.name + " was stored into DB";

  }

}
