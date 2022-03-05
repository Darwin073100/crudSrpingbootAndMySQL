package com.sinfloo.demo.interfaces;

import com.sinfloo.demo.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersona extends JpaRepository<Persona,Integer> {
}
