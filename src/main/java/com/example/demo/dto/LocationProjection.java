package com.example.demo.dto;

import org.springframework.data.rest.core.config.Projection;

import com.example.demo.entity.Location;

@Projection(name = "noLinks", types = { Location.class })
public interface LocationProjection {
    Long getLocationId();
    String getLocationName();
}
