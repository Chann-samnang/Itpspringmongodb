package co.istad.itpmongodb.service;

import co.istad.itpmongodb.dto.UserRequest;
import co.istad.itpmongodb.dto.UserResponse;

import java.util.List;

public interface UserService {

    List<UserResponse> findAll();

    UserResponse findById(String id);

    UserResponse create(UserRequest request);

    UserResponse update(String id, UserRequest request);

    void delete(String id);
}
