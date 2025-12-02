package co.istad.itpmongodb.service;

import co.istad.itpmongodb.dto.UserRequest;
import co.istad.itpmongodb.dto.UserResponse;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {

    Page<UserResponse> findAll(int page, int size);

    UserResponse findById(String id);

    UserResponse create(UserRequest request);

    UserResponse update(String id, UserRequest request);

    void delete(String id);
}
