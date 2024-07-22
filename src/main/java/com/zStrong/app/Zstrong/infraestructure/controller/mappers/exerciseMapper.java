package com.zStrong.app.Zstrong.infraestructure.controller.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import com.zStrong.app.Zstrong.core.model.Exercise;
import com.zStrong.app.Zstrong.infraestructure.controller.DTOs.ExcerciseDTO;

@Mapper(componentModel = "spring")
@Component
public interface exerciseMapper{
    
    Exercise toexerciseDTO(ExcerciseDTO exerciseDTO);

    ExcerciseDTO toexercise(Exercise exercise);
    
}
