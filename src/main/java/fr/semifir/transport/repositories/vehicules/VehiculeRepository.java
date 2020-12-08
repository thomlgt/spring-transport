package fr.semifir.transport.repositories.vehicules;

import fr.semifir.transport.models.vehicules.Vehicule;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VehiculeRepository extends MongoRepository<Vehicule, String> {
}
