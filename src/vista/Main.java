/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Docente;
import modelo.Persona;

/**
 *
 *
 */
public class Main {

    public static void main(String[] args) {
        Persona p = new Persona();
        Docente d = new Docente();
        d.setIdPersona(2);
        d.setNombre("Tania");
        d.setApellido("Cacuango");
        d.setCedula("0987654321");
        d.setTelefono(987654321);
        d.setDireccion("Avenida Central 456");
        d.setCorreoElectrinico("tania.cacuango@ist17.com");
        d.setSexo("Femenino");
        d.setFecha_de_nacimiento("1985-05-15");
        d.setEspecializacion("Física");
        d.setTitulo("Doctor en Física");
        d.setTipo("Medio Tiempo");
        d.setRangosalarial(70000);
        System.out.println(d.imprimir());

    }

}
