package com.zStrong.app.Zstrong.core.repository;
import com.zStrong.app.Zstrong.core.model.Exercise;
import java.util.*;


public interface iexerciseRepository {

    public Exercise saveExercise(Exercise exercise);
    public Exercise editExercise(Exercise exercise);
    public Exercise deleteExercise(Exercise exercise);
    public List<Exercise> listExercies();
    public List<Exercise> listExerciesByUserId(String id);
    
} 
