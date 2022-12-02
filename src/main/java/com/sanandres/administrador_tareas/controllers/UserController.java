package com.sanandres.administrador_tareas.controllers;


import com.sanandres.administrador_tareas.entities.Usuario;
//import org.springframework.web.bind.annotation.PathVariable;
import com.sanandres.administrador_tareas.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    //Inyeccion de dependencias
    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(value = "/usuarios")
    public List<Usuario> buscaUsuario() {
        return usuarioService.buscarUsuario();

    }

    //Crear usuarios
    @RequestMapping(value = "/usuario1")
    public Usuario crearUsuario() {
        Usuario usuario = new Usuario();
        usuario.setName("Fabian Andres");
        usuario.setEmail("correo@dominio.com");
        usuario.setProfile("Fabiancho");
        usuario.setTasks("Trapear");
        return usuario;
    }

    //Editar usuario
    @RequestMapping(value = "/usuario2")
    public Usuario modificarUsuario() {
        Usuario usuario = new Usuario();
        usuario.setName("Fabian Andres");
        usuario.setEmail("correo@dominio.com");
        usuario.setProfile("Fabiancho");
        usuario.setTasks("Trapear");
        return usuario;
    }

    //Eliminar usuario
    @RequestMapping(value = "/usuario3")
    public Usuario eliminarUsuario() {
        Usuario usuario = new Usuario();
        usuario.setName("Fabian Andres");
        usuario.setEmail("correo@dominio.com");
        usuario.setProfile("Fabiancho");
        usuario.setTasks("Trapear");
        return usuario;
    }

    //Consultar usuario
    @RequestMapping(value = "/usuario4")
    public Usuario getUsuario() {
        Usuario usuario = new Usuario();
        usuario.setName("Fabian Andres");
        usuario.setEmail("correo@dominio.com");
        usuario.setProfile("Fabiancho");
        usuario.setTasks("Trapear");
        return usuario;
    }

    //Consultar usuario especifico x id dinamico
    @RequestMapping(value = "/usuarios")
    public List<Usuario> buscarUsuario() {

        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(11L);
        usuario.setName("Fabian Andres");
        usuario.setEmail("correo@dominio.com");
        usuario.setProfile("Fabiancho");
        usuario.setTasks("Trapear");
        usuario.created_at("05-06-1988");

        Usuario usuario2 = new Usuario();
        usuario2.setId(22L);
        usuario2.setName("Claudia Elena");
        usuario2.setEmail("sucorreo@sudominio.com");
        usuario2.setProfile("Clau");
        usuario2.setTasks("Barrer");
        usuario2.created_at("1992/05/15");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        return usuarios;

    }
}
