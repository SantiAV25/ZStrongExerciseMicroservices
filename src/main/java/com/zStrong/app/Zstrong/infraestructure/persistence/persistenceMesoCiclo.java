package com.zStrong.app.Zstrong.infraestructure.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zStrong.app.Zstrong.core.model.MesoCiclo;
import com.zStrong.app.Zstrong.core.repository.imesoCicloRepository;
import com.zStrong.app.Zstrong.infraestructure.persistence.collectionMappers.mesoCicloCMapper;
import com.zStrong.app.Zstrong.infraestructure.persistence.collections.MesoCicloC;
import com.zStrong.app.Zstrong.infraestructure.persistence.persistenceRepositorys.mesoCicloRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class persistenceMesoCiclo implements imesoCicloRepository {

    @Autowired
    private final mesoCicloRepository mesoCicloRepository;

    private final mesoCicloCMapper mesoCicloCMapper;

    @Override
    public MesoCiclo saveMesoCiclo(MesoCiclo mesoCiclo) {
        MesoCicloC mesociclo = mesoCicloCMapper.tomesoCiclo(mesoCiclo);
        this.mesoCicloRepository.save(mesociclo);
        return mesoCiclo;
    }

    @Override
    public MesoCiclo editMesoCiclo(MesoCiclo mesoCiclo) {
        MesoCicloC mesociclo = mesoCicloCMapper.tomesoCiclo(mesoCiclo);
        this.mesoCicloRepository.save(mesociclo);
        return mesoCiclo;
    }

    @Override
    public MesoCiclo deleteMesoCiclo(MesoCiclo mesoCiclo) {
        MesoCicloC mesociclo = mesoCicloCMapper.tomesoCiclo(mesoCiclo);
        this.mesoCicloRepository.delete(mesociclo);
        return mesoCiclo;
    }

    @Override
    public List<MesoCiclo> listMesoCiclosByUserId(String id) {
        List<MesoCicloC> mesoCiclos = this.mesoCicloRepository.findAllByUserID(id);
        return mesoCicloCMapper.tomesoCicloCList(mesoCiclos);
    }

    @Override
    public MesoCiclo getMesoCicloById(String id) {
        Optional<MesoCicloC> mesoCiclos = this.mesoCicloRepository.findById(id);
        return mesoCicloCMapper.tomesoCicloC(mesoCiclos.get());
    }
    
}
