package com.ivoronline.springboot.entity_annotation_table.repositories;

import com.ivoronline.springboot.entity_annotation_table.entities.PersonEntity;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<PersonEntity, Integer> { }
