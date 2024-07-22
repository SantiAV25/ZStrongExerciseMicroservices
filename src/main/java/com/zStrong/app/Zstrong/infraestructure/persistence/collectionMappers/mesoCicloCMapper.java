package com.zStrong.app.Zstrong.infraestructure.persistence.collectionMappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.zStrong.app.Zstrong.core.model.MesoCiclo;
import com.zStrong.app.Zstrong.infraestructure.persistence.collections.MesoCicloC;

@Mapper(componentModel = "spring")
@Component
public interface mesoCicloCMapper {

    MesoCicloC tomesoCiclo(MesoCiclo mesoCiclo);
    MesoCiclo tomesoCicloC(MesoCicloC mesoCicloC);

    List<MesoCiclo> tomesoCicloList(List<MesoCiclo> mesoCiclo);
    List<MesoCiclo> tomesoCicloCList(List<MesoCicloC> mesoCicloC);

    
}
