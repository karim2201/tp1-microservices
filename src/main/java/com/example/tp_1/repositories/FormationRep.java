package com.example.tp_1.repositories;

import com.example.tp_1.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FormationRep extends JpaRepository<Formation, Long> {
}
