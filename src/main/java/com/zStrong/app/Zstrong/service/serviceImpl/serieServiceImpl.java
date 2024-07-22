package com.zStrong.app.Zstrong.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zStrong.app.Zstrong.core.model.Serie;
import com.zStrong.app.Zstrong.core.repository.iserieRepository;
import com.zStrong.app.Zstrong.service.serviceInterface.iserieService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class serieServiceImpl implements iserieService {

    @Autowired
    private iserieRepository iserieRepository;

    @Override
    public Serie saveSerie(Serie serie) {
        return this.iserieRepository.saveSerie(serie);
    }

    @Override
    public Serie editSerie(Serie serie) {
       return this.iserieRepository.editSerie(serie);
    }

    @Override
    public Serie deleteSerie(Serie serie) {
        return this.iserieRepository.delteSerie(serie);
    }
    
}
