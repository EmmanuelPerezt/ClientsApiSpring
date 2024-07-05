package com.apiRest.clientsApi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.apiRest.clientsApi.model.clientesModel;

public interface ClientesRepository extends MongoRepository <clientesModel,String>{
}
