package com.zStrong.app.Zstrong.core.repository;
import java.util.*;

import com.zStrong.app.Zstrong.core.model.Routine;


public interface iroutineRepository {
    
    public Routine saveRoutine(Routine routine);
    public Routine editRoutine(Routine routine);
    public Routine deleteRoutine(Routine routine);
    public List<Routine> listDefaultRoutines();
    public List<Routine> listRoutinesByuserId(String userId);
    public Routine getRoutineById(String routineId);
}
