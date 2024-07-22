package com.zStrong.app.Zstrong.service.serviceInterface;

import java.util.List;

import com.zStrong.app.Zstrong.core.model.MesoCiclo;
import com.zStrong.app.Zstrong.core.model.Routine;

public interface imesocicloService {
    
    public MesoCiclo saveMesoCiclo(MesoCiclo mesoCiclo);
    public MesoCiclo editMesoCiclo(MesoCiclo mesoCiclo);
    public MesoCiclo delteMesoCiclo(MesoCiclo mesoCiclo);
    public MesoCiclo addRoutinetoMesoCiclo(MesoCiclo mesoCiclo, String routineId);
    public MesoCiclo delteRoutinetoMesoCiclo(MesoCiclo mesoCiclo, String routineId);
    public List<MesoCiclo> listMesoCiclosByUser(String userId);
    public MesoCiclo getMesoCicloById(String mesoCicloId);
    
    
}
