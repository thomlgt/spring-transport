package fr.semifir.transport.controllers.vehicules;

import fr.semifir.transport.models.vehicules.Voiture;
import fr.semifir.transport.services.vehicules.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("vehicules/voitures")
public class VoitureController {

    @Autowired
    VoitureService service;

    @GetMapping()
    public List<Voiture> findAll() {
        return this.service.findAll();
    }

    @GetMapping("{id}")
    public Optional<Voiture> findById(@PathVariable String id) {
        return this.service.findById(id);
    }

    @PostMapping()
    public Voiture save(@RequestBody Voiture body) {
        return this.service.save(body);
    }

    @PutMapping()
    public Voiture update(@RequestBody Voiture body) {
        return this.service.save(body);
    }

    @DeleteMapping()
    public void delete(@RequestBody Voiture body) {
        this.service.delete(body);
    }
}
