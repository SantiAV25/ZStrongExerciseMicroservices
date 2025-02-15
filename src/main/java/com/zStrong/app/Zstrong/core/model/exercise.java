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
public class Exercise {

    private String userId;
    private String exerciseId;
    private String exerciseName;
    private boolean defaultExercise;
    private boolean isAcopy;
    @Builder.Default
    private List<Serie> series = new ArrayList<>();
    
}
