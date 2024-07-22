package com.zStrong.app.Zstrong.infraestructure.persistence.persistenceRepositorys;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.zStrong.app.Zstrong.infraestructure.persistence.collections.RoutineC;

public interface routineRepository extends MongoRepository<RoutineC, String>{

    List<RoutineC> findByDefaultRoutineTrue();
    List<RoutineC> findAllByUserId(String userId);
    
}
