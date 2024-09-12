package com.yukino.springboot.restdemo.dao;

import com.yukino.springboot.restdemo.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// JpaRepository<Worker, Integer> is a generic type. Worker is the entity type that the repository will work with, and Integer is the type of the entity's ID field.

//@RepositoryRestResource(path = "members")
// This annotation is used to customize the REST endpoint. By default, the endpoint is the pluralized version of the entity name (e.g., workers). With this annotation, you can change the endpoint to something else (e.g., members).
public interface WorkerRepository extends JpaRepository<Worker, Integer> {
}
