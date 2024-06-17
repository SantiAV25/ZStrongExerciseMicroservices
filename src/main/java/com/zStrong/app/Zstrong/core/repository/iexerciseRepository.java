package com.zStrong.app.Zstrong.core.repository;
import com.zStrong.app.Zstrong.core.model.exercise;
import java.util.*;


public interface iexerciseRepository {

    public exercise saveExercise(exercise exercise);
    public exercise editExercise(exercise exercise);
    public exercise deleteExercise(exercise exercise);
    public List<exercise> listExercies();
    public List<exercise> listExerciesByUserId(Long id);
    
} 
