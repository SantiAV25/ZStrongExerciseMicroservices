package com.zStrong.app.Zstrong.infraestructure.persistence.collectionMappers;

import java.util.List;
import java.util.Optional;

import org.mapstruct.Mapper;

import com.zStrong.app.Zstrong.core.model.Routine;
import com.zStrong.app.Zstrong.infraestructure.persistence.collections.RoutineC;

@Mapper(componentModel = "spring")
public interface routinesCMapper {

    Routine toRoutine(RoutineC optional);
    RoutineC toRoutineC(Routine Routine);

    List<Routine> toRoutines(List<RoutineC> RoutineC);
    List<RoutineC> toRoutineCs(List<Routine> Routine);
    
}
