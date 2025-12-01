package co.istad.itpmongodb.controller;

import co.istad.itpmongodb.dto.UserRequest;
import co.istad.itpmongodb.dto.UserResponse;
import co.istad.itpmongodb.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<UserResponse> getAll() {
        return userService.findAll();

    }

    @GetMapping("/{id}")
    public UserResponse getById(@PathVariable String id) {
        return userService.findById(id);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse create(@RequestBody UserRequest request) {
        return userService.create(request);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UserResponse update(@PathVariable String id, @RequestBody UserRequest request) {
        return userService.update(id, request);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        userService.delete(id);
    }

}
