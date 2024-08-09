package cl.praxis.proyectoHospitalPost.model.service;

import cl.praxis.proyectoHospitalPost.model.dto.Paciente;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PacienteService {

    List<Paciente> findAll();
    Paciente findOne(int id);
    boolean create(Paciente p);
    boolean update(Paciente p);
    Boolean delete(int id);
}
