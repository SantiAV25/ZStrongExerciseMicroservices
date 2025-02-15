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
public class Routine {

    private String userId;
    private String routineId;
    private boolean defaultRoutine;
    private boolean isAcopy;
    private String routineName;
    private Date routineDate;
    @Builder.Default
    private List<Exercise> exercises = new ArrayList<>();
    
}
