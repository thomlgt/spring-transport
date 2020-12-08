package fr.semifir.transport.models.vehicules;

import fr.semifir.transport.models.moteurs.Moteur;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Vehicule {

    @Id
    private String id;
    private String marque;
    private String couleur;
    private Moteur moteur;
}
