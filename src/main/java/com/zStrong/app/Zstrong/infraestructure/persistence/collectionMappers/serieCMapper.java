package com.zStrong.app.Zstrong.infraestructure.persistence.collectionMappers;

import org.mapstruct.Mapper;

import com.zStrong.app.Zstrong.core.model.Serie;
import com.zStrong.app.Zstrong.infraestructure.persistence.collections.SeriesC;

@Mapper(componentModel = "spring")
public interface serieCMapper {
    
    Serie toSerie(SeriesC serieC);
    SeriesC toSerieC(Serie serie);


    
} 