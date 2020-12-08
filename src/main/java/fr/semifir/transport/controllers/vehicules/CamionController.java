package fr.semifir.transport.controllers.vehicules;

import fr.semifir.transport.models.vehicules.Camion;
import fr.semifir.transport.models.vehicules.Vehicule;
import fr.semifir.transport.services.vehicules.CamionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("vehicules/camions")
public class CamionController {

    @Autowired
    CamionService service;

    @GetMapping()
    public List<Camion> findAll() {
        return this.service.findAll();
    }

    @GetMapping("{id}")
    public Optional<Camion> findById(@PathVariable String id) {
        return this.service.findById(id);
    }

    @PostMapping()
    public Camion save(@RequestBody Camion body) {
        return this.service.save(body);
    }

    @PutMapping()
    public Camion update(@RequestBody Camion body) {
        return this.service.save(body);
    }

    @DeleteMapping()
    public void delete(@RequestBody Camion body) {
        this.service.delete(body);
    }

}
