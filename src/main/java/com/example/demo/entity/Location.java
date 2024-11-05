package com.example.demo.entity;

import com.example.demo.dto.LocationSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "location")
//@JsonSerialize(using = LocationSerializer.class)
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long locationId;
    private String locationName;
    @ManyToOne
    private Company company; 

}
