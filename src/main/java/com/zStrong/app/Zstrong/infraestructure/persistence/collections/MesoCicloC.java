package com.zStrong.app.Zstrong.infraestructure.persistence.collections;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.zStrong.app.Zstrong.core.model.Routine;

import lombok.AllArgsConstructor;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "mesoCiclo")
public class MesoCicloC {
    @Id
    private String mesoCicloId;
    private String userID;
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
    @Field("routines")
    private List<String> routinesIds;
}