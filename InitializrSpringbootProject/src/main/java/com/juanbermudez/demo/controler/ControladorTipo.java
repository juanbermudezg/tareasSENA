package com.juanbermudez.demo.controler;
import com.juanbermudez.demo.interfaceService.ItPersonaService;
import com.juanbermudez.demo.modelo.TipoPersona;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping
public class ControladorTipo {
    @Autowired
    private ItPersonaService service;
    @GetMapping("/listarTipo")
    public String listar(Model model){
        List<TipoPersona> personas = service.listar();
        model.addAttribute("personas", personas);
        return "indexTipo";
    }
    @GetMapping("/newTipo")
    public String agregar(Model model){
        model.addAttribute("persona", new TipoPersona());
        return "formTipo";
    }
    @PostMapping("/saveTipo")
    public String save(@Validated TipoPersona p, Model model){
        service.save(p);
        return "redirect:/listarTipo";
    }
    @GetMapping("/editarTipo/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<TipoPersona> persona = service.listarId(id);
        model.addAttribute("persona", persona);
        return "formTipo";
    }
    @GetMapping("/eliminarTipo/{id}")
    public String delete(Model model, @PathVariable int id){
        service.delete(id);
        return "redirect:/listarTipo";
    }
}