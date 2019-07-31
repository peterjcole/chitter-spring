package net.petercole.chitterspring.web;

import net.petercole.chitterspring.model.Peep;
import net.petercole.chitterspring.repository.PeepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/peeps")
public class PeepController {

    @Autowired
    private PeepRepository peepRepository;

    @GetMapping
    public List getPeeps() {
       return peepRepository.findAll();
    }

    @PostMapping("/create")
    public Peep postPeeps(@RequestBody Peep peep) {
        return peepRepository.insert(peep);
    }

    @PutMapping("/update")
    public Peep updatePeeps(@RequestBody Peep peep, @RequestParam String id) {
         peep.setId(id);
         Optional<Peep> oldPeep = peepRepository.findById(id);
         peep.setCreatedDate(oldPeep.get().getCreatedDate());
         return peepRepository.save(peep);
    }

    @DeleteMapping("/delete")
    public Peep deletePeeps(@RequestParam String id) throws ResponseStatusException {
        Optional<Peep> deletedPeep = peepRepository.findById(id);
        if (deletedPeep.isPresent()) {
            peepRepository.deleteById(id);
            return deletedPeep.get();
        } else {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "entity not found"
            );
        }
    }
}
