package com.zStrong.app.Zstrong.infraestructure.persistence.collectionMappers;

import org.mapstruct.Mapper;
import com.zStrong.app.Zstrong.core.model.Exercise;
import com.zStrong.app.Zstrong.infraestructure.persistence.collections.ExerciseC;

@Mapper(componentModel = "spring")
public interface exerciseCMapper {
    Exercise toExerciseC(ExerciseC exerciseC);
    ExerciseC toExercise(Exercise exercise);
}
