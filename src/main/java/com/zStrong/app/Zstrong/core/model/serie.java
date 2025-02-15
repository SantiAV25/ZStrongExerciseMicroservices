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
public class Serie {
    
    private String serieId;
    @Builder.Default
    private List<Long> reps = new ArrayList<>();
    @Builder.Default
    private List<Float> kgs = new ArrayList<>();
    @Builder.Default
    private List<Float> restTime = new ArrayList<>();
   
}
