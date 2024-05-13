package com.juanbermudez.demo.interfaces;
import com.juanbermudez.demo.modelo.TipoPersona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ITPersona extends CrudRepository<TipoPersona, Integer>{
}