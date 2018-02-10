package com.example.fjponce.listview;

/**
 * Created by fjponce on 10/02/18.
 */

public class Empleado {

    String rol;
    String imagen;
    String nombre;
    String empresa;
    String dni;
    int telf;

    public Empleado(String rol, String imagen, String nombre, String empresa, String dni, int telf) {
        this.rol = rol;
        this.imagen = imagen;
        this.nombre = nombre;
        this.empresa = empresa;
        this.dni = dni;
        this.telf = telf;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getTelf() {
        return telf;
    }

    public void setTelf(int telf) {
        this.telf = telf;
    }
}
