package net.petercole.chitterspring.web;

import net.petercole.chitterspring.model.Peep;
import net.petercole.chitterspring.repository.PeepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/peeps")
public class PeepController {

    @Autowired
    private PeepRepository peepRepository;

    @GetMapping
    public List getPeeps() {
       return peepRepository.findAll();
    }

    @PostMapping
    public Peep postPeeps(@RequestBody Peep peep) {
        return peepRepository.insert(peep);
    }

    
}
