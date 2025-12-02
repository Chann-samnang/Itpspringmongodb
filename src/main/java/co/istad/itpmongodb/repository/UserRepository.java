package co.istad.itpmongodb.repository;

import co.istad.itpmongodb.domain.User;
import co.istad.itpmongodb.dto.UserResponse;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    @Query("{ 'username': { $regex: ?0, $options: 'i' } }")
    List<User> findByUsername(String username);

    @Query("{$and: [{city:  ?0}, {age:  {$lt :  ?1 }}]}")
    List<User> filter(String city, Integer age);


}
