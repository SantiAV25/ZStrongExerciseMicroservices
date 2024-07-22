package com.zStrong.app.Zstrong.infraestructure.controller.DTOs;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.zStrong.app.Zstrong.core.model.Exercise;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoutineDTO {
    
    private String userId;
    private String routineId;
    private boolean defaultRoutine;
    private boolean isAcopy;
    private String routineName;
    private Date routineDate;

    @Builder.Default
    private List<Exercise> exercises = new ArrayList<>();

}
