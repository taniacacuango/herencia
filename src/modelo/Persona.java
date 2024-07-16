/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * 
 */
public class Persona {


    //1.ATRIBUTOS
    private int idPersona;
    private String nombres;
    private String apellidos;
    private String cedula;
    private String direccion;
    private String correoElectronico;
    private String sexo;
    private String fechaNacimiento;
    private int telefono;
    private String usuario;
    private String clave;
    
    //2.MÉTODOS CONSTRUCTORES 

    public Persona() {
    }

    public Persona(int idPersona, String nombres, String apellidos, String cedula, String direccion, String correoElectronico, String sexo, String fechaNacimiento, int telefono, String usuario, String clave) {
        this.idPersona = idPersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.usuario = usuario;
        this.clave = clave;
    }

      

    //3. ENCAPSULAMIENTO
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

   

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    

    //4. MÉTODOS DE REGLA DE NEGOCIO
    public String imprimir() {
        return "-------DATOS PERSONALES-----------\n"
                + "Id:" + getIdPersona() + "\n"
                + "Nombre:" + getNombres() + "\n"
                + "Apellidos:" + getApellidos() + "\n"
                + "Cédula:" + getCedula() + "\n"
                + "Dirección:" + getDireccion() + "\n"
                + "Usuario:" + getUsuario()+ "\n"
                + "Clave:" + "***************"+ "\n"
                + "Correo Electrónico:" + getCorreoElectronico()+ "\n"
                +"Fecha Nacimiento:"+getFechaNacimiento()+ "\n"
                +"Sexo:"+getSexo()+ "\n"
                +"Teléfono:"+getTelefono();

    }
}
