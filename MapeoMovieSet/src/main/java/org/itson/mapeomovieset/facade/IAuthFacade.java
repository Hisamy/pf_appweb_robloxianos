package org.itson.mapeomovieset.facade;

import org.itson.mapeomovieset.entidades.Usuario;

import java.util.Date;

/**
 * Interfaz que define las operaciones de autenticación y registro de usuarios.
 */
public interface IAuthFacade {

    /**
     * Registra un nuevo usuario en el sistema.
     *
     * @param nombre Nombre del usuario
     * @param correo Correo electrónico del usuario
     * @param contrasenia Contraseña del usuario
     * @return Usuario registrado
     */
    Usuario registrarUsuario(String nombre, String correo, String contrasenia, String telefono, String avatar, String ciudad, Date fechaNacimiento, String genero);

    /**
     * Realiza el inicio de sesión de un usuario.
     *
     * @param correo Correo electrónico del usuario
     * @param contrasenia Contraseña del usuario
     * @return Usuario autenticado

     */
    Usuario iniciarSesion(String correo, String contrasenia) ;

    /**
     * Verifica si un correo electrónico ya está registrado.
     *
     * @param correo Correo electrónico a verificar
     * @return true si el correo ya está registrado, false en caso contrario
     */
    boolean existeCorreo(String correo);

    /**
     * Valida que los datos de registro sean correctos.
     *
     * @param nombre Nombre del usuario
     * @param correo Correo electrónico del usuario
     * @param contrasenia Contraseña del usuario
     */
    void validarDatosRegistro(String nombre, String correo, String contrasenia) ;

}
