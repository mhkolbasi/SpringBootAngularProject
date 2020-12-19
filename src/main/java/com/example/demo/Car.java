package com.example.demo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Car", schema = "world", catalog = "")
public class Car {

    private Long id;
    private String name;

    public Car(){

    }

    @Basic
    @Column(name = "Id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }



}
