package com.juanbermudez.demo.service;
import com.juanbermudez.demo.interfaceService.ItPersonaService;
import com.juanbermudez.demo.interfaces.ITPersona;
import com.juanbermudez.demo.modelo.TipoPersona;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TipoPersonaService implements ItPersonaService{
    @Autowired
    private ITPersona data;
    @Override
    public List<TipoPersona> listar() {
        return (List<TipoPersona>)data.findAll();
    }
    @Override
    public Optional<TipoPersona> listarId(int id) {
        return data.findById(id);
    }
    @Override
    public int save(TipoPersona p) {
        int res=0;
        TipoPersona persona=data.save(p);
        if (!persona.equals(null)){
            res=1;
        }
        return res;
    }
    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
}