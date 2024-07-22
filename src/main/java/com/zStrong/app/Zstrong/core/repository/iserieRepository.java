package com.zStrong.app.Zstrong.core.repository;
import java.util.*;

import com.zStrong.app.Zstrong.core.model.Serie;

public interface iserieRepository {
    
    public Serie saveSerie(Serie serie);
    public Serie editSerie(Serie serie);
    public Serie delteSerie(Serie serie);
    public List<Serie> getSerie();

}
