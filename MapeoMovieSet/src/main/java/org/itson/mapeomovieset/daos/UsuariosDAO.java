package org.itson.mapeomovieset.daos;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.InsertOneResult;
import org.bson.types.ObjectId;
import org.itson.mapeomovieset.conexion.Conexion;
import org.itson.mapeomovieset.conexion.IConexion;
import org.itson.mapeomovieset.entidades.UsuarioEntity;
import org.itson.mapeomovieset.excepciones.FindException;

public class UsuariosDAO implements IUsuariosDAO {

    private IConexion conexion;
    private MongoCollection<UsuarioEntity> usuarios;

    public UsuariosDAO() {
        this.conexion = Conexion.getInstance();
        MongoDatabase baseDeDatos = conexion.conectar();
        this.usuarios = baseDeDatos.getCollection("Usuarios", UsuarioEntity.class);
    }

    @Override
    public boolean agregarUsuario(UsuarioEntity usuario) throws FindException {
        try {
            InsertOneResult result = usuarios.insertOne(usuario);
            return result.wasAcknowledged();
        } catch (MongoException ex) {
            throw new FindException("Error al crear usuario");
        }
    }

    @Override
    public UsuarioEntity buscarUsuarioPorCorreo(String correo) throws FindException {
        try{
            return usuarios.find(Filters.eq("correo", correo)).first();
        } catch (MongoException ex) {
            throw new FindException("Error al encontrar correo");
        }
    }

}