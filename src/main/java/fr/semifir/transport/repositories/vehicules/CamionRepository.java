package fr.semifir.transport.repositories.vehicules;

import fr.semifir.transport.models.vehicules.Camion;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CamionRepository extends MongoRepository<Camion, String> {
}
