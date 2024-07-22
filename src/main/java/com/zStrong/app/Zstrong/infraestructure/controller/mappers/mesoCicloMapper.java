package com.zStrong.app.Zstrong.infraestructure.controller.mappers;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.zStrong.app.Zstrong.core.model.MesoCiclo;
import com.zStrong.app.Zstrong.infraestructure.controller.DTOs.MesoCicloDTO;

@Mapper(componentModel = "spring")
@Component
public interface mesoCicloMapper {
    
    MesoCiclo tomesoCicloDTO(MesoCicloDTO mesoCicloDTO);
    MesoCicloDTO tomesoCiclo(MesoCiclo mesoCiclo);

}
