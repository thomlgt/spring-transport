package fr.semifir.transport.models.moteurs;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Moteur {

    @Id
    private String id;
    private String puissance;

}
