package com.ivoronline.springboot.entity_annotation_table.entities;

import javax.persistence.*;

@Entity
@Table(name = "Person")
public class PersonEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;
  public String  name;
  public Integer age;

}





