package ali.practica01.main;

import ali.practica01.main.models.Estudiante;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Estudiante iram = new Estudiante(221214,
                "Iram",
                "Tuxtla Gutiérrez",
                LocalDate.of(2003,8,8),
                'M');

        System.out.println(iram.getEdad());
    }
}
