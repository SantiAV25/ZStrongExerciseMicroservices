package com.zStrong.app.Zstrong.service.serviceInterface;

import java.util.List;

import com.zStrong.app.Zstrong.core.model.Exercise;
import com.zStrong.app.Zstrong.core.model.Serie;

public interface iexerciseService {

    public Exercise saveExercise(String RoutineId,Exercise exercise);
    public Exercise editExercise(String RoutineId,Exercise exercise);
    public Exercise delteExercise(String RoutineId,Exercise exercise);
    public Exercise addSeriesToExercise(String RoutineId,String exerciseId,Serie serie);
    public Exercise editSeriesToExercise(String RoutineId,String exerciseId,Serie serie);
    public Exercise deleteSeriesToExercise(String RoutineId,String exerciseId,Serie serie);
    public List<Exercise> listExercisesByUser(String userId);
    public List<Exercise> listExercisesByDefault(Boolean isDefault);
    
} 
