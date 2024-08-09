package cl.praxis.proyectoHospitalPost.model.dto;

public class Paciente {
    private int pacienteId;
    private String nombre;
    private String apellido;
    private String Anomalia;
    private String sintomas;

    public Paciente() {
    }

    public Paciente(int pacienteId, String nombre, String apellido, String anomalia, String sintomas) {
        this.pacienteId = pacienteId;
        this.nombre = nombre;
        this.apellido = apellido;
        Anomalia = anomalia;
        this.sintomas = sintomas;
    }

    public int getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(int pacienteId) {
        this.pacienteId = pacienteId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getAnomalia() {
        return Anomalia;
    }

    public void setAnomalia(String anomalia) {
        Anomalia = anomalia;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }
}
