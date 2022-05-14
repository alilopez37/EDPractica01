package ali.practica01.main.models;

import java.time.LocalDate;

public class Estudiante {
    private int matricula;
    private String nombre;
    private String lugarOrigen;
    private LocalDate fechaNacimiento;
    private char sexo;

    public Estudiante(int matricula,
                      String nombre,
                      String lugarOrigen,
                      LocalDate fechaNacimiento,
                      char sexo){
        this.matricula = matricula;
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }

    public byte getEdad(){
        int edad;
        edad = LocalDate.now().getYear() - fechaNacimiento.getYear();
        return (byte)edad;
    }

    @Override
    public String toString(){
        return nombre + ":" + matricula + ":" + fechaNacimiento;
    }
}
