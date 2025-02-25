package com.example.tp_1.repositories;

import com.example.tp_1.entities.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface EnseignantRep extends JpaRepository<Enseignant, Long> {

}
