/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_karimguifarro;

import java.util.*;

/**
 *
 * @author Karim Ozael
 */
public class usuario{
    private String user;
    private String contra;
     private Date  fecha_nacimiento;
     private String num_tel;
     private String correo;
     private String nombre_comp;
     private String genero_fav;
     private ArrayList <libros> libros;
     private ArrayList <usuario> amigos;

    public usuario() {
    }

    public usuario(String user, String contra, Date fecha_nacimiento, String num_tel, String correo, String nombre_comp, String genero_fav, ArrayList<libros> libros, ArrayList<usuario> amigos) {
        this.user = user;
        this.contra = contra;
        this.fecha_nacimiento = fecha_nacimiento;
        this.num_tel = num_tel;
        this.correo = correo;
        this.nombre_comp = nombre_comp;
        this.genero_fav = genero_fav;
        this.libros = libros;
        this.amigos = amigos;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNum_tel() {
        return num_tel;
    }

    public void setNum_tel(String num_tel) {
        this.num_tel = num_tel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre_comp() {
        return nombre_comp;
    }

    public void setNombre_comp(String nombre_comp) {
        this.nombre_comp = nombre_comp;
    }

    public String getGenero_fav() {
        return genero_fav;
    }

    public void setGenero_fav(String genero_fav) {
        this.genero_fav = genero_fav;
    }

    public ArrayList<libros> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<libros> libros) {
        this.libros = libros;
    }

    public ArrayList<usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<usuario> amigos) {
        this.amigos = amigos;
    }

    @Override
    public String toString() {
        return "usuario{" + "user=" + user + ", contra=" + contra + ", fecha_nacimiento=" + fecha_nacimiento + ", num_tel=" + num_tel + ", correo=" + correo + ", nombre_comp=" + nombre_comp + ", genero_fav=" + genero_fav + ", libros=" + libros + ", amigos=" + amigos + '}';
    }
    
}
