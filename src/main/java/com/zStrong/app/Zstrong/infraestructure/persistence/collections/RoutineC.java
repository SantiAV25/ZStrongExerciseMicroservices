package com.zStrong.app.Zstrong.infraestructure.persistence.collections;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.zStrong.app.Zstrong.core.model.Exercise;

import lombok.AllArgsConstructor;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "routineC")
public class RoutineC {
    private String userId;
    @Id
    private String routineId;
    private boolean defaultRoutine;
    private boolean isAcopy;
    private String routineName;
    private Date routineDate;
    @Field("exercises")
    private List<Exercise> exercises = new ArrayList<>();
    
}
