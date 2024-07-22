package com.zStrong.app.Zstrong.service.serviceInterface;

import java.util.List;

import com.zStrong.app.Zstrong.core.model.Exercise;
import com.zStrong.app.Zstrong.core.model.Routine;

public interface iroutineService {
    
    public Routine saveRoutine(Routine routine);
    public Routine editRoutine(Routine routine);
    public Routine delteRoutine(Routine routine);
    public List<Routine> listRoutinesByUser(String userId);
    public List<Routine> listDefaulRoutines(Boolean isDefault);
    public Routine getRoutineById(String routineId);

}
