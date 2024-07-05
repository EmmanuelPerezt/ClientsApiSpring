package com.apiRest.clientsApi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clientes")
public class clientesModel {
    @Id
    private String id;
    private String nombre;
    private int edad;


    //constructores



    public clientesModel(){
    }

    public clientesModel(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }








    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
