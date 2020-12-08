package fr.semifir.transport.repositories.vehicules;

import fr.semifir.transport.models.vehicules.Voiture;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VoitureRepository extends MongoRepository<Voiture, String> {
}
