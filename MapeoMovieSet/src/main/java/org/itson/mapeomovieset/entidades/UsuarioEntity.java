package org.itson.mapeomovieset.entidades;

import com.mongodb.gridfs.GridFS;
import org.bson.types.ObjectId;

import java.util.Date;

public class UsuarioEntity{

    private ObjectId id;
    private String nombre;
    private String segundoNombre;
    private String apellidoMaterno;
    private String apellidoPaterno;
    private String correo;
    private String contrasenia;
    private String telefono;
    private GridFS avatar;
    private String ciudad;
    private Date fechaNacimiento;
    private String genero;

    public UsuarioEntity() {}

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public GridFS getAvatar() {
        return avatar;
    }

    public void setAvatar(GridFS avatar) {
        this.avatar = avatar;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuario{"
                + "" 
                + "id=" + id 
                + ", nombre=" + nombre 
                + ", segundoNombre=" + segundoNombre 
                + ", apellidoMaterno=" + apellidoMaterno 
                + ", apellidoPaterno=" + apellidoPaterno 
                + ", correo=" + correo 
                + ", contrasenia=" + contrasenia 
                + ", telefono=" + telefono 
                + ", avatar=" + avatar 
                + ", ciudad=" + ciudad 
                + ", fechaNacimiento=" + fechaNacimiento 
                + ", genero=" + genero 
                + '}';
    }

    
}
