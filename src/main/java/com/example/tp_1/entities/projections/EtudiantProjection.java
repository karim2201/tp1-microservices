package com.example.tp_1.entities.projections;
import com.example.tp_1.entities.Etudiant;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "pr", types = { Etudiant.class })
public interface EtudiantProjection {
@Value("#{target.nom}")
    public String getNom();
@Value("#{target.dataNaissance}")
    public String getDataNaissance();
}
