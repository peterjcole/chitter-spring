package net.petercole.chitterspring.repository;

import net.petercole.chitterspring.model.Peep;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PeepRepository extends MongoRepository<Peep, String> {

}
