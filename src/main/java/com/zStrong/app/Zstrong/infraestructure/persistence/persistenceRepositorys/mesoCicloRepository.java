package com.zStrong.app.Zstrong.infraestructure.persistence.persistenceRepositorys;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.zStrong.app.Zstrong.infraestructure.persistence.collections.MesoCicloC;

public interface mesoCicloRepository extends MongoRepository<MesoCicloC, String>{

    List<MesoCicloC> findAllByUserID(String id);
    
}
