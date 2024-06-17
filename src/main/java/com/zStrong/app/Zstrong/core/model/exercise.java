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
public class exercise {

    private Long userId;
    private Long exerciseId;
    private String exerciseName;
    
    @Default
    private List<serie> series = new ArrayList<>();
    
}
