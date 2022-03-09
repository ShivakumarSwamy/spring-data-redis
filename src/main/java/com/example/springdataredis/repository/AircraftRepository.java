package com.example.springdataredis.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springdataredis.domain.Aircraft;

public interface AircraftRepository extends CrudRepository<Aircraft, Long> {
}
