package com.zStrong.app.Zstrong.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zStrong.app.Zstrong.core.model.Exercise;
import com.zStrong.app.Zstrong.core.model.Routine;
import com.zStrong.app.Zstrong.core.model.Serie;
import com.zStrong.app.Zstrong.core.repository.iexerciseRepository;
import com.zStrong.app.Zstrong.core.repository.iroutineRepository;
import com.zStrong.app.Zstrong.service.serviceInterface.iexerciseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class exerciseServiceImpl implements iexerciseService {

    @Autowired
    private iroutineRepository iroutineRepository;

    

    @Override
    public Exercise saveExercise(String routineId, Exercise exercise) {
        exercise.setExerciseId(UUID.randomUUID().toString());
        Routine routine = this.iroutineRepository.getRoutineById(routineId);
        routine.getExercises().add(exercise);
        System.out.println("Entro  a saveExercise");
        System.out.println(routine.toString());
        this.iroutineRepository.editRoutine(routine);
        return exercise;
    }

    @Override
    public Exercise editExercise(String routineId,Exercise exercise) {
         Routine routine = this.iroutineRepository.getRoutineById(routineId);
        for (Exercise exercise2 : routine.getExercises()) {
            if (exercise2.getExerciseId().equals(exercise.getExerciseId())) {
                routine.getExercises().remove(exercise2);
                routine.getExercises().add(exercise);
            }
        }
        this.iroutineRepository.editRoutine(routine);
        return exercise;
    }

    @Override
    public Exercise delteExercise(String routineId,Exercise exercise) {
        Routine routine = this.iroutineRepository.getRoutineById(routineId);
        for (Exercise exercise2 : routine.getExercises()) {
            if (exercise2.getExerciseId().equals(exercise.getExerciseId())) {
                routine.getExercises().remove(exercise2);
            }
        }
        this.iroutineRepository.editRoutine(routine);
        return exercise;
    }

    @Override
    public Exercise addSeriesToExercise(String routineId, String  exerciseId, Serie serie) {
        Routine routine = this.iroutineRepository.getRoutineById(routineId);
        Exercise exercise = new Exercise();
        for (Exercise exercise2 : routine.getExercises()) {
            if (exercise2.getExerciseId().equals(exerciseId)) {
                exercise2.getSeries().add(serie);
                exercise = exercise2;
            }
        }
        this.iroutineRepository.editRoutine(routine);
        return exercise;
        
    }

    @Override
    public Exercise deleteSeriesToExercise(String routineId, String exerciseId, Serie serie) {
        Routine routine = this.iroutineRepository.getRoutineById(routineId);
        Exercise exercise = new Exercise();
        for (Exercise exercise2 : routine.getExercises()) {
            if (exercise2.getExerciseId().equals(exerciseId)) {
                for (Serie serie2 : exercise2.getSeries()) {
                    if (serie2.getSerieId().equals(serie.getSerieId())) {
                        exercise2.getSeries().remove(serie2);
                        exercise = exercise2;
                    }
                }
            }
        }

        return exercise;
    }

    @Override
    public List<Exercise> listExercisesByUser(String userId) {
        List<Routine> routines = this.iroutineRepository.listRoutinesByuserId(userId);
        List<Exercise> exercises = new ArrayList<>();

        for (Routine routine : routines) {
            for (Exercise exercise : routine.getExercises()) {
                exercises.add(exercise);
            }
        }

        return exercises;
    }

    @Override
    public List<Exercise> listExercisesByDefault(Boolean isDefault) {
        List<Routine> routines = this.iroutineRepository.listDefaultRoutines();
        List<Exercise> exercises = new ArrayList<>();

        for (Routine routine : routines) {
            for (Exercise exercise : routine.getExercises()) {
                exercises.add(exercise);
            }
        }

        return exercises;
    }

    @Override
    public Exercise editSeriesToExercise(String RoutineId, String exerciseId, Serie serie) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'editSeriesToExercise'");
    }
    
}
