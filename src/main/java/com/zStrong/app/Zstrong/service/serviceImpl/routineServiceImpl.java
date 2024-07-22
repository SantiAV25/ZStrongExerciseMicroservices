package com.zStrong.app.Zstrong.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.READER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zStrong.app.Zstrong.core.model.Exercise;
import com.zStrong.app.Zstrong.core.model.Routine;
import com.zStrong.app.Zstrong.core.repository.iroutineRepository;
import com.zStrong.app.Zstrong.service.serviceInterface.iroutineService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class routineServiceImpl implements iroutineService {

    @Autowired
    private iroutineRepository IroutineRepository;

    @Override
    public Routine saveRoutine(Routine routine) {
        return this.IroutineRepository.saveRoutine(routine);
    }

    @Override
    public Routine editRoutine(Routine routine) {
       return this.IroutineRepository.editRoutine(routine);
    }

    @Override
    public Routine delteRoutine(Routine routine) {
        return this.IroutineRepository.deleteRoutine(routine);
    }


    @Override
    public List<Routine> listRoutinesByUser(String userId) {
        return this.IroutineRepository.listRoutinesByuserId(userId);
    }

    @Override
    public List<Routine> listDefaulRoutines(Boolean isDefault) {
        return this.IroutineRepository.listDefaultRoutines();
        
    }

    @Override
    public Routine getRoutineById(String routineId) {
       return this.IroutineRepository.getRoutineById(routineId);
    }
    
}
