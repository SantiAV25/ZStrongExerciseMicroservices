package com.zStrong.app.Zstrong.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class mesoCiclo {
    
    private Long UserID;
    private Long mesoCicloId;
    private Float chestMeasure;
    private Float leftArmMeasure;
    private Float rightArmMeasure;
    private Float backMeasure;
    private Float waisteMeasure;
    private Float rightLegMeasure;
    private Float leftLegMeasure;
    private Float startetWeight;
    private Float height;
    private Float Objetive;
    
    @Default
    private List<routine> routines = new ArrayList<>();
}
