
package org.itson.mapeomovieset.daos;

import org.itson.mapeomovieset.entidades.PostEntity;
import org.itson.mapeomovieset.excepciones.FindException;

/**
 *
 * @author hisam
 */
public interface IPostDAO {
    boolean agregarComentario(PostEntity post) throws FindException;
}
