package com.sinfloo.demo.service;

import com.sinfloo.demo.interfaceService.IpersonaService;
import com.sinfloo.demo.interfaces.IPersona;
import com.sinfloo.demo.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements IpersonaService {

    @Autowired
    private IPersona data;

    @Override
    public List<Persona> listar() {
        return (List<Persona>) data.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) {
        return Optional.empty();
    }

    @Override
    public int save(Persona p) {
        return 0;
    }

    @Override
    public void delete(int id) {

    }
}
