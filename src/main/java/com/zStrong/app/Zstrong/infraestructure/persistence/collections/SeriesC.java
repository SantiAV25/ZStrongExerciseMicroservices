package com.zStrong.app.Zstrong.infraestructure.persistence.collections;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "seriesC")
public class SeriesC {
    
    @Id
    private String serieId;
    @Field("reps")
    private List<Long> reps;
    @Field("kgs")
    private List<Float> kgs = new ArrayList<>();
    @Field("restTime")
    private List<Float> restTime = new ArrayList<>();

}
