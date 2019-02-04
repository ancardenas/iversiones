/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.de.inversiones;

/**
 *
 * @author ancardenas
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private int tel;
    private int edad;
    private String email;
    private Asset[] activos;

    public Cliente(String nombre, String apellido, int tel, int edad, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tel = tel;
        this.edad = edad;
        this.email = email;
        this.activos=new Asset[10];
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

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Asset getActivos(int a) {
        return this.activos[a];
    }

    public void setActivos(int a,Asset activo) {
        this.activos[a] = activo;
    }
    
    
}
