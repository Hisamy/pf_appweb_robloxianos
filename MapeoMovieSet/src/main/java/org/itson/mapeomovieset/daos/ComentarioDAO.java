/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mapeomovieset.daos;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.InsertOneResult;
import org.itson.mapeomovieset.conexion.Conexion;
import org.itson.mapeomovieset.conexion.IConexion;
import org.itson.mapeomovieset.entidades.Comentario;
import org.itson.mapeomovieset.excepciones.FindException;

/**
 *
 * @author castr
 */
public class ComentarioDAO implements IComentarioDAO {

    private IConexion conexion;
    private MongoCollection<Comentario> comentarios;

    public ComentarioDAO() {
        this.conexion = Conexion.getInstance();
        MongoDatabase baseDeDatos = conexion.conectar();
        this.comentarios = baseDeDatos.getCollection("Comentarios", Comentario.class);
    }

    @Override
    public boolean agregarComentario(Comentario comentario) throws FindException {
        try {
            InsertOneResult result = comentarios.insertOne(comentario);
            return result.wasAcknowledged();
        } catch (MongoException ex) {
            throw new FindException("Error al crear el comentario");
        }
    }
}