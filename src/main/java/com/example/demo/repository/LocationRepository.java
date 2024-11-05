package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.dto.LocationProjection;
import com.example.demo.entity.Location;

@RepositoryRestResource
public interface LocationRepository extends CrudRepository<Location, Long> {

}
