package com.zStrong.app.Zstrong.infraestructure.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zStrong.app.Zstrong.core.model.Serie;
import com.zStrong.app.Zstrong.core.repository.iserieRepository;
import com.zStrong.app.Zstrong.infraestructure.persistence.persistenceRepositorys.serieRepository;
import com.zStrong.app.Zstrong.infraestructure.persistence.collectionMappers.serieCMapper;
import com.zStrong.app.Zstrong.infraestructure.persistence.collections.SeriesC;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class persistenceSerie implements iserieRepository{
    
    @Autowired
    private final serieRepository serieRepository;

    private final serieCMapper serieCMapper;
    
    @Override
    public Serie saveSerie(Serie serie) {
        SeriesC serieC = serieCMapper.toSerieC(serie);
        this.serieRepository.save(serieC);
        return serie;
    }

    @Override
    public Serie editSerie(Serie serie) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'editSerie'");
    }

    @Override
    public Serie delteSerie(Serie serie) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delteSerie'");
    }

    @Override
    public List<Serie> getSerie() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSerie'");
    }
    
}
