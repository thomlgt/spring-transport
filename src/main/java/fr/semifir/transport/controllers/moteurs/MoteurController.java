package fr.semifir.transport.controllers.moteurs;

import fr.semifir.transport.models.moteurs.Moteur;
import fr.semifir.transport.models.vehicules.Voiture;
import fr.semifir.transport.services.moteurs.MoteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("moteurs")
public class MoteurController {

    @Autowired
    MoteurService service;

    @GetMapping()
    public List<Moteur> findAll() {
        return this.service.findAll();
    }

    @GetMapping("{id}")
    public Optional<Moteur> findById(@PathVariable String id) {
        return this.service.findById(id);
    }

    @PostMapping()
    public Moteur save(@RequestBody Moteur body) {
        return this.service.save(body);
    }

    @PutMapping()
    public Moteur update(@RequestBody Moteur body) {
        return this.service.save(body);
    }

    @DeleteMapping()
    public void delete(@RequestBody Moteur body) {
        this.service.delete(body);
    }
}
