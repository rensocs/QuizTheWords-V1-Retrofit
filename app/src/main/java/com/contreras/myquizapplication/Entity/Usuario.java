package com.contreras.myquizapplication.Entity;

public class Usuario {

    int codigo_usuario;
    String nombres;
    String apellidos;
    String correo;
    String password;
    String imagen;
    String sexo;

    public int getCodigoUsuario() {
        return codigo_usuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigo_usuario = codigo_usuario;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSexo() { return sexo; }

    public void setSexo(String sexo) { this.sexo = sexo; }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
