package co.istad.itpmongodb;

import co.istad.itpmongodb.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ItpmongodbApplicationTests {


    @Test
    void contextLoads() {
    }

    @Autowired
    private UserRepository userRepository;

    @Test
    void testFindByUsername_Query() {
        System.out.println(userRepository.findByUsername("admin"));
    }

    @Test
    void testFilter_Query() {
        System.out.println(userRepository.filter("Cambodia", 29));
    }

}
