package ru.semyak.redis_practice.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.semyak.redis_practice.entites.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
