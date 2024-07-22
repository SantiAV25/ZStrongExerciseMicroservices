package com.zStrong.app.Zstrong.infraestructure.controller.DTOs;

import java.util.ArrayList;
import java.util.List;

import com.zStrong.app.Zstrong.core.model.Serie;

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
public class ExcerciseDTO {
    
    private String userId;
    private String exerciseId;
    private String exerciseName;
    private boolean defaultExercise;
    private boolean isAcopy;
    
    @Builder.Default
    private List<Serie> series = new ArrayList<>();
    

}
