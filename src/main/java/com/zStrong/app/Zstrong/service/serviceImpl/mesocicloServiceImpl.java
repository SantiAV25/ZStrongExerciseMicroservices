package com.zStrong.app.Zstrong.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zStrong.app.Zstrong.core.model.MesoCiclo;
import com.zStrong.app.Zstrong.core.model.Routine;
import com.zStrong.app.Zstrong.core.repository.iexerciseRepository;
import com.zStrong.app.Zstrong.core.repository.imesoCicloRepository;
import com.zStrong.app.Zstrong.core.repository.iroutineRepository;
import com.zStrong.app.Zstrong.service.serviceInterface.imesocicloService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class mesocicloServiceImpl implements imesocicloService{

    @Autowired
    private imesoCicloRepository imesoCicloRepository;

    @Autowired
    private iroutineRepository  iroutineRepository;


    @Override
    public MesoCiclo saveMesoCiclo(MesoCiclo mesoCiclo) {
        System.out.println("Entro en el service de mesociclo");
        this.imesoCicloRepository.saveMesoCiclo(mesoCiclo);
        return mesoCiclo;
    }

    @Override
    public MesoCiclo editMesoCiclo(MesoCiclo mesoCiclo) {
        this.imesoCicloRepository.editMesoCiclo(mesoCiclo);
        return mesoCiclo;
    }

    @Override
    public MesoCiclo delteMesoCiclo(MesoCiclo mesoCiclo) {
        this.imesoCicloRepository.deleteMesoCiclo(mesoCiclo);
        return  mesoCiclo;
    }

    @Override
    public MesoCiclo addRoutinetoMesoCiclo(MesoCiclo mesoCiclo, String routineId) {
        if (iroutineRepository.getRoutineById(routineId) == null){
            throw new IllegalArgumentException("Routine not found");
        }
        mesoCiclo.getRoutinesIds().add(routineId);
        this.imesoCicloRepository.editMesoCiclo(mesoCiclo);
        return mesoCiclo;
    }

    @Override
    public MesoCiclo delteRoutinetoMesoCiclo(MesoCiclo mesoCiclo, String routineId) {
        if (iroutineRepository.getRoutineById(routineId) == null){
            throw new IllegalArgumentException("Routine not found");
        }
        mesoCiclo.getRoutinesIds().remove(routineId);
        this.imesoCicloRepository.editMesoCiclo(mesoCiclo);
        return mesoCiclo;
    }

    @Override
    public List<MesoCiclo> listMesoCiclosByUser(String userId) {
       return this.imesoCicloRepository.listMesoCiclosByUserId(userId);
    }

    @Override
    public MesoCiclo getMesoCicloById(String mesoCicloId) {
        return this.imesoCicloRepository.getMesoCicloById(mesoCicloId);
    }
}
