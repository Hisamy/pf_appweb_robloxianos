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
import org.itson.mapeomovieset.entidades.PeliculaPost;
import org.itson.mapeomovieset.excepciones.FindException;

/**
 *
 * @author castr
 */
public class PeliculaPostDAO implements IPeliculaPostDAO {

    private IConexion conexion;
    private MongoCollection<PeliculaPost> peliculas;

    public PeliculaPostDAO() {
        this.conexion = Conexion.getInstance();
        MongoDatabase baseDeDatos = conexion.conectar();
        this.peliculas = baseDeDatos.getCollection("Peliculas", PeliculaPost.class);
    }

    @Override
    public boolean agregarPelicula(PeliculaPost pelicula) throws FindException {
        try {
            InsertOneResult result = peliculas.insertOne(pelicula);
            return result.wasAcknowledged();
        } catch (MongoException ex) {
            throw new FindException("Error al crear la pelicula");
        }
    }

}
