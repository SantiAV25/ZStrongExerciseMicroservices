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
public class MesoCiclo {
    
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
