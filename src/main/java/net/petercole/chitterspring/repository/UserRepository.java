package net.petercole.chitterspring.repository;

import net.petercole.chitterspring.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
}
