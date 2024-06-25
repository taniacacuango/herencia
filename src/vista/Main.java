/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Administrativo;
import modelo.Docente;
import modelo.Estudiante;
import modelo.Persona;

/**
 *
 *
 */
public class Main {

    public static void main(String[] args) {
      //instanciar Objetos docente
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
         //instanciar Objetos administrativo
        Administrativo a = new Administrativo(2, "Tania", "Cacuango", "0987654321", 987654321, "Avenida Central 456", "tania.cacuango@ist17.com","Femenino","1985-05-15", 1, "estudiante", "software");
        System.out.println(a.imprimir());
         //instanciar Objetos estudiane 
          Persona p = new Estudiante();
        p.setNombre("pepito");
        p.setApellido("diaz");
        p.setCedula("12334555");
       //dowcasting cambiar el tipo de dato a un objeto 
       Estudiante e=(Estudiante)p;
       e.setHorario("matutina");
       e.setHorario("aaiddfjfked");
       e.setIdEstudiante(3);
       e.setNumeroMatricula(23);
   System.out.println(e.imprimir());
    }

}
