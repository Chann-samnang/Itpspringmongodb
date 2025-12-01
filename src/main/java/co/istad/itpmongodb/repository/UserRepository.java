package co.istad.itpmongodb.repository;

import co.istad.itpmongodb.domain.User;
import co.istad.itpmongodb.dto.UserResponse;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {


    UserResponse findAllByUsername(String username);
}
