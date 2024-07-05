package com.apiRest.clientsApi.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





import com.apiRest.clientsApi.model.clientesModel;
import com.apiRest.clientsApi.repository.ClientesRepository;

@RestController
@RequestMapping("/clientes")
public class ClientesController {
    @Autowired
    private ClientesRepository clientesRepository;

    @GetMapping("/")
    public List<clientesModel> getAllClientes(){
        return clientesRepository.findAll();
    }

    @PostMapping("/")
    public clientesModel addCliente(@RequestBody clientesModel cliente){

        return clientesRepository.save(cliente);
    }
    @GetMapping("/{id}")
    public clientesModel getClientsByID(@PathVariable String id){
        return clientesRepository.findById(id).orElse(null);
    }
    @DeleteMapping("/{id}")
    public void deleteClients(@PathVariable String id){

        clientesRepository.deleteById(id);
    }
    @PutMapping( "/{id}")
    public clientesModel updateCliente(@PathVariable String id, @RequestBody clientesModel updatedCliente) {
        updatedCliente.setId(id);
        return clientesRepository.save(updatedCliente);
        }
}


