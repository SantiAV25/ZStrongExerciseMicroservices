package com.zStrong.app.Zstrong.infraestructure.controller.mappers;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.zStrong.app.Zstrong.core.model.Routine;
import com.zStrong.app.Zstrong.infraestructure.controller.DTOs.RoutineDTO;

@Mapper(componentModel = "spring")
@Component
public interface routineMapper {

    RoutineDTO toroutine(Routine routine);
    Routine toroutineDTO(RoutineDTO routineDTO);
    
}
