package com.juanbermudez.demo.interfaceService;
import com.juanbermudez.demo.modelo.TipoPersona;
import java.util.List;
import java.util.Optional;
public interface ItPersonaService {
    public List<TipoPersona>listar();
    public Optional<TipoPersona>listarId(int id);
    public int save(TipoPersona p);
    public void delete(int id);
}