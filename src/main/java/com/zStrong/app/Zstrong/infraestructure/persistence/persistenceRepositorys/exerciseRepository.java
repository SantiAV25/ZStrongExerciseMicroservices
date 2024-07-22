package com.zStrong.app.Zstrong.infraestructure.persistence.persistenceRepositorys;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.zStrong.app.Zstrong.infraestructure.persistence.collections.ExerciseC;


public interface exerciseRepository  extends MongoRepository<ExerciseC, String>{
    
}
