package com.zStrong.app.Zstrong.core.repository;

import com.zStrong.app.Zstrong.core.model.mesoCiclo;

import java.util.*;

public interface imesoCicloRepository {
    
    public mesoCiclo saveMesoCiclo(mesoCiclo mesoCiclo);
    public mesoCiclo editMesoCiclo(mesoCiclo mesoCiclo);
    public mesoCiclo deleMesoCiclo(mesoCiclo mesoCiclo);
    public List<mesoCiclo> listMesoCiclos();
    public List<mesoCiclo> listMesoCiclosByUserId(Long id);
}
