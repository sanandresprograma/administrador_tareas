package com.sanandres.administrador_tareas.services.Imple;
import com.sanandres.administrador_tareas.entities.Usuario;
import com.sanandres.administrador_tareas.services.UsuarioService;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional

public class UsuarioServiceImple implements UsuarioService{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Usuario> buscarUsuario() {
        String query = "FROM Usuario";
        return entityManager.createQuery(query).getResultList();
    }
}
