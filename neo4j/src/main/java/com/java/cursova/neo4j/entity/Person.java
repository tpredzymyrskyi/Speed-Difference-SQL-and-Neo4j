package com.java.cursova.neo4j.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
@Data
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String email;

    private Long age;
}
