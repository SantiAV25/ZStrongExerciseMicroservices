package com.zStrong.app.Zstrong.service.serviceInterface;

import com.zStrong.app.Zstrong.core.model.Serie;

public interface iserieService {

    public Serie saveSerie(Serie serie);
    public Serie editSerie(Serie serie);
    public Serie deleteSerie(Serie serie);
    
}
