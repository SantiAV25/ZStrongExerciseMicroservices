package com.zStrong.app.Zstrong.core.repository;
import java.util.*;

import com.zStrong.app.Zstrong.core.model.serie;

public interface iserieRepository {
    
    public serie saveSerie(serie serie);
    public serie editSerie(serie serie);
    public serie delteSerie(serie serie);
    public List<serie> getSerie();

}
