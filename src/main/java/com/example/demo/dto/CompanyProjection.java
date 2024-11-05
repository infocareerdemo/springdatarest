package com.example.demo.dto;

import org.springframework.data.rest.core.config.Projection;

import com.example.demo.entity.Company;

@Projection(name = "noLinks", types = { Company.class })
public interface CompanyProjection {
    String getCompanyName();

}
