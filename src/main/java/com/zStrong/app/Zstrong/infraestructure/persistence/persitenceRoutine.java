package com.zStrong.app.Zstrong.infraestructure.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zStrong.app.Zstrong.core.model.Routine;
import com.zStrong.app.Zstrong.core.repository.iroutineRepository;
import com.zStrong.app.Zstrong.infraestructure.persistence.collectionMappers.mesoCicloCMapper;
import com.zStrong.app.Zstrong.infraestructure.persistence.collectionMappers.routinesCMapper;
import com.zStrong.app.Zstrong.infraestructure.persistence.collections.MesoCicloC;
import com.zStrong.app.Zstrong.infraestructure.persistence.collections.RoutineC;
import com.zStrong.app.Zstrong.infraestructure.persistence.persistenceRepositorys.routineRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class persitenceRoutine implements iroutineRepository{

    @Autowired
    private final routineRepository routineRepository;

    private final routinesCMapper routineCMapper;

    @Override
    public Routine saveRoutine(Routine routine) {
        RoutineC routineC = routineCMapper.toRoutineC(routine);
        this.routineRepository.save(routineC);
        return routine;
    }

    @Override
    public Routine editRoutine(Routine routine) {
        RoutineC routineC = routineCMapper.toRoutineC(routine);
        this.routineRepository.save(routineC);
        return routine;
    }

    @Override
    public Routine deleteRoutine(Routine routine) {
        RoutineC routineC = routineCMapper.toRoutineC(routine);
        this.routineRepository.delete(routineC);
        return routine;
    }


    @Override
    public List<Routine> listRoutinesByuserId(String userId) {
        return routineCMapper.toRoutines(routineRepository.findAllByUserId(userId));
        
    }

    @Override
    public Routine getRoutineById(String routineId) {
        Optional<RoutineC> routineC = this.routineRepository.findById(routineId);
        return routineCMapper.toRoutine(routineC.get());

    }

    @Override
    public List<Routine> listDefaultRoutines() {
        return routineCMapper.toRoutines(routineRepository.findByDefaultRoutineTrue());
    }
    
}
