package com.juanbermudez.demo.service;

import com.juanbermudez.demo.interfaceService.IpersonaService;
import com.juanbermudez.demo.interfaces.IPersona;
import com.juanbermudez.demo.modelo.Persona;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PersonaService implements IpersonaService{
    
    @Autowired
    private IPersona data;
    @Override
    public List<Persona> listar() {
        return (List<Persona>)data.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) {
        return null;
    }

    @Override
    public int save(Persona p) {
        return 0;
    }

    @Override
    public void delete(int id) {
        
    }
    
}
