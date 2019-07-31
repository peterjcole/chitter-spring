package net.petercole.chitterspring.web;

import net.petercole.chitterspring.model.Peep;
import net.petercole.chitterspring.repository.PeepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ChitterController {

    @Autowired
    private PeepRepository peepRepository;

//    @GetMapping()
//    public String home() {
//        return "hi";
//    }

    @GetMapping("testcreate")
    public String testCreate() {
//        Peep peep = new Peep("me", "Here is a peep");
//        peepRepository.insert(peep);
        return "did it work?";
    }
}
