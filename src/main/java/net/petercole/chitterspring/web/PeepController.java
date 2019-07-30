package net.petercole.chitterspring.web;

import net.petercole.chitterspring.repository.PeepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/peeps")
public class PeepController {

    @Autowired
    private PeepRepository peepRepository;

    @GetMapping
    public String getPeeps() {
       return peepRepository.findAll().toString();
    }
}
