package com.zStrong.app.Zstrong.infraestructure.controller.DTOs;

import java.util.ArrayList;
import java.util.List;

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
public class SerieDTO {
    
    private String serieId;
    @Builder.Default
    private List<Long> reps = new ArrayList<>();
    @Builder.Default
    private List<Float> kgs = new ArrayList<>();
    @Builder.Default
    private List<Float> restTime = new ArrayList<>();
}
