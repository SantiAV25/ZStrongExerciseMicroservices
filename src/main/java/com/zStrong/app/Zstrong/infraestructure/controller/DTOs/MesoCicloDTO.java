package com.zStrong.app.Zstrong.infraestructure.controller.DTOs;

import java.util.ArrayList;
import java.util.List;

import com.zStrong.app.Zstrong.core.model.Exercise;
import com.zStrong.app.Zstrong.core.model.Routine;

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
public class MesoCicloDTO {

   
    private String userID;
    private String mesoCicloId;
    private Float chestMeasure;
    private Float leftArmMeasure;
    private Float rightArmMeasure;
    private Float backMeasure;
    private Float waisteMeasure;
    private Float rightLegMeasure;
    private Float leftLegMeasure;
    private Float startetWeight;
    private Float height;
    private String objetive;

     @Builder.Default
     private List<String> routinesIds = new ArrayList<>();
    
}
