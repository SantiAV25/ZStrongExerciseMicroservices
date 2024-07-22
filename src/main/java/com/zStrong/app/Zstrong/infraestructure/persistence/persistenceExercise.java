package com.zStrong.app.Zstrong.infraestructure.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zStrong.app.Zstrong.core.model.Exercise;
import com.zStrong.app.Zstrong.core.repository.iexerciseRepository;
import com.zStrong.app.Zstrong.infraestructure.persistence.collectionMappers.exerciseCMapperImpl;
import com.zStrong.app.Zstrong.infraestructure.persistence.collections.ExerciseC;
import com.zStrong.app.Zstrong.infraestructure.persistence.persistenceRepositorys.exerciseRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class persistenceExercise implements iexerciseRepository{

    @Autowired
    private final exerciseRepository exerciseRepository;

    private final exerciseCMapperImpl exerciseCMapper;

    @Override
    public Exercise saveExercise(Exercise exercise) {
        ExerciseC exerciseC = exerciseCMapper.toExercise(exercise);
        this.exerciseRepository.save(exerciseC);
        return exercise;

    }

    @Override
    public Exercise editExercise(Exercise exercise) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'editExercise'");
    }

    @Override
    public Exercise deleteExercise(Exercise exercise) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteExercise'");
    }

    @Override
    public List<Exercise> listExercies() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listExercies'");
    }

    @Override
    public List<Exercise> listExerciesByUserId(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listExerciesByUserId'");
    }
    
}
