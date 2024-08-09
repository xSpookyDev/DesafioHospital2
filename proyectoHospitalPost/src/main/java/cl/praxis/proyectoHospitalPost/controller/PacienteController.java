package cl.praxis.proyectoHospitalPost.controller;

import cl.praxis.proyectoHospitalPost.ProyectoHospitalPostApplication;
import cl.praxis.proyectoHospitalPost.model.dto.Paciente;
import cl.praxis.proyectoHospitalPost.model.service.PacienteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class PacienteController {

    private static final Logger logger= LoggerFactory.getLogger(ProyectoHospitalPostApplication.class);

    private PacienteService service;

    public PacienteController(PacienteService service) {

        this.service = service;
    }

    @GetMapping()
    public String findAll(Model model) {
        logger.info("Mostrando lista de pantalla");
        model.addAttribute("paciente", service.findAll());
        return "pacienteList";

    }

    @GetMapping("/{id}")
    public String findOne(@PathVariable("id") int id, Model model) {
        model.addAttribute("paciente", service.findOne(id));
        return "pacienteEdit";
    }

    @GetMapping("/new")
    public String createForm(Model model) {
        model.addAttribute("paciente", new Paciente());

        return "pacienteCreate";
    }

    @PostMapping
    public String update(@ModelAttribute Paciente p) {
        boolean result = service.update(p);
        if (result) {
            logger.info("Paciente Actualizado");
        } else {
            logger.warn("Paciente no actualizado");
        }
        return "redirect:/";
    }

    @PostMapping("/new")
    public String save(@ModelAttribute Paciente p) {
        boolean result = service.create(p);
        if (result) {
            logger.info("Paciente creado");
        } else {
            logger.warn("Paciente no creado");
        }
        return "redirect:/";
    }
    @GetMapping("/del/{id}")
    public String delete(@PathVariable("id") int id){

        boolean result= service.delete(id);
        if (result){
            System.out.println("Borrado OK");
            logger.warn("Paciente eliminado!!");
        }else {
            System.out.println("error al borrar");
        }

        return "redirect:/";
    }
}
