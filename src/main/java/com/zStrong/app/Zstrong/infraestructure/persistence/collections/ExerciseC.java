package com.zStrong.app.Zstrong.infraestructure.persistence.collections;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.zStrong.app.Zstrong.core.model.Serie;

import lombok.AllArgsConstructor;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "exerciseC")
public class ExerciseC {

    private String userId;
    @Id
    private String exerciseId;
    private String exerciseName;
    private boolean defaultExercise;
    private boolean isAcopy;
    
    @Field("series")
    private List<Serie> series = new ArrayList<>();
    
}
