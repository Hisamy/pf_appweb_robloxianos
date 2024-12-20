/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.mapeomovieset.facade;

import org.itson.mapeomovieset.excepciones.PersistenciaException;
import org.itson.moviesetdtos.UsuarioDTO;

/**
 *
 * @author hisam
 */
public interface ICreateAccountFacade {
    void sendCreateAccountForm(UsuarioDTO usuarioForm) throws PersistenciaException;
}
