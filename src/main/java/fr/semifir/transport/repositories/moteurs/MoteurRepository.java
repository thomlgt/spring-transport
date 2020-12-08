package fr.semifir.transport.repositories.moteurs;

import fr.semifir.transport.models.moteurs.Moteur;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MoteurRepository extends MongoRepository<Moteur, String> {
}
