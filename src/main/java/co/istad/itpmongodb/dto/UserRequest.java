package co.istad.itpmongodb.dto;

import lombok.Data;

@Data
public class UserRequest {
    private String name;
    private String username;
    private String email;
}
