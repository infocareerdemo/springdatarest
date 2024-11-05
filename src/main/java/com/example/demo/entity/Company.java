package com.example.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "company")
@JsonIgnoreProperties(value = { "_links" })
public class Company {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long companyId;
	private String companyName;

	  @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
	    private List<Location> locations;
}
