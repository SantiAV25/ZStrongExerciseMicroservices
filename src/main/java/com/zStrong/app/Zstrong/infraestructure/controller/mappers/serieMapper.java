package com.zStrong.app.Zstrong.infraestructure.controller.mappers;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.zStrong.app.Zstrong.core.model.Serie;
import com.zStrong.app.Zstrong.infraestructure.controller.DTOs.SerieDTO;

@Mapper(componentModel = "spring")
@Component
public interface serieMapper {

    Serie toserieDTO(SerieDTO serieDTO);
    SerieDTO toserie(Serie serie);
    
}
