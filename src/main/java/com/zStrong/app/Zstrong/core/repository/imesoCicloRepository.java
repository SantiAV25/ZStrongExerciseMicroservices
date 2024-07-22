package com.zStrong.app.Zstrong.core.repository;

import com.zStrong.app.Zstrong.core.model.MesoCiclo;

import java.util.*;

public interface imesoCicloRepository {
    
    public MesoCiclo saveMesoCiclo(MesoCiclo mesoCiclo);
    public MesoCiclo editMesoCiclo(MesoCiclo mesoCiclo);
    public MesoCiclo deleteMesoCiclo(MesoCiclo mesoCiclo);
    public List<MesoCiclo> listMesoCiclosByUserId(String id);
    public MesoCiclo getMesoCicloById(String id);

}
