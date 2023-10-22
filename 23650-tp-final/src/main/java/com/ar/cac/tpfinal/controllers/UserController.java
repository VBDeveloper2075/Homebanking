package com.ar.cac.tpfinal.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    //POR CADA METODO HTTP  QUE USTEDES QUIERAN
    //VAN A TENER UN METODO EN SU CONTROLADOR

    //METODOS HTTP PERMITIDOS: GET(2,para uno y para todos), POST, PUT,PATCH,DELETE

    //obtener una lista de usuarios registrados

    @GetMapping(value = "/users")
    public List<String> getUsers(){
        return List.of ("Cristian","Maria","Julieta","Marcos");
    }

    //Obtener la info de un solo usuario - lo pido por ID
    public String getUserById(){
        return "";
    }

    //Crear/Registrar un usuario
    public void createUser(){

    }

    //Modificar TOTALMENTE un usuario (put)
    public String updateFullUser(){
        return "";

    }


    //Modificar PARCIALMENTE un usuario (patch)
    public String updateParcialUser(){
        return "";
    }

    //Eliminar un usuario
    public void deleteUser(){
    }

}


