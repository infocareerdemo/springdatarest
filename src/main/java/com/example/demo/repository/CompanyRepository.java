package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.dto.CompanyProjection;
import com.example.demo.entity.Company;

@RepositoryRestResource(excerptProjection = CompanyProjection.class)
public interface CompanyRepository extends CrudRepository<Company, Long>{

}
