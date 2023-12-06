package com.example.tp6.repositories;

import com.example.tp6.etienties.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long > {

}
