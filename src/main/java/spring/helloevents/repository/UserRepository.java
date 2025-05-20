package spring.helloevents.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.helloevents.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
