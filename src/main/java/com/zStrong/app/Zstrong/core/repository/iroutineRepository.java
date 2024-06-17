package com.zStrong.app.Zstrong.core.repository;
import java.util.*;

import com.zStrong.app.Zstrong.core.model.routine;


public interface iroutineRepository {
    
    public routine saveRoutine(routine routine);
    public routine editRoutine(routine routine);
    public routine deleteRoutine(routine routine);
    public List<routine> listRoutines();
    public List<routine> listRoutinesByuserId(Long userId);
}
