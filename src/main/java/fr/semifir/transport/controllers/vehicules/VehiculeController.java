package fr.semifir.transport.controllers.vehicules;

import fr.semifir.transport.models.moteurs.Moteur;
import fr.semifir.transport.models.vehicules.Vehicule;
import fr.semifir.transport.services.vehicules.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("vehicules")
public class VehiculeController {

    @Autowired
    VehiculeService service;

    @GetMapping()
    public List<Vehicule> findAll() {
        return this.service.findAll();
    }

    @GetMapping("{id}")
    public Optional<Vehicule> findById(@PathVariable String id) {
        return this.service.findById(id);
    }

    @PostMapping()
    public Vehicule save(@RequestBody Vehicule body) {
        return this.service.save(body);
    }

    @PutMapping()
    public Vehicule update(@RequestBody Vehicule body) {
        return this.service.save(body);
    }

    @DeleteMapping()
    public void delete(@RequestBody Vehicule body) {
        this.service.delete(body);
    }

}
