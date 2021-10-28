package com.virtualcodemonkeys.project2.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.virtualcodemonkeys.project2.models.SuperCustomer;
import com.virtualcodemonkeys.project2.repos.SuperCustomerRepo;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class Query implements GraphQLQueryResolver {

    private SuperCustomerRepo superCustomerRepo;

    public Query(SuperCustomerRepo repo){ this.superCustomerRepo = repo; }

    public List<SuperCustomer> characters(){ return superCustomerRepo.getCharacters(); }

    public SuperCustomer characterById(String id){
        return superCustomerRepo.getCharacterById(id);
    }

}
