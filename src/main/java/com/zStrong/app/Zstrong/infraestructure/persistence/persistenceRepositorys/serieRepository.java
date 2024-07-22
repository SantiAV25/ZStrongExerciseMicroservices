package com.zStrong.app.Zstrong.infraestructure.persistence.persistenceRepositorys;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.zStrong.app.Zstrong.infraestructure.persistence.collections.SeriesC;

public interface serieRepository extends MongoRepository<SeriesC, String>{
    
}
