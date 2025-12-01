package co.istad.itpmongodb.dto;

import lombok.Builder;

@Builder

public record UserResponse(
        String id,
        String name,
        String username,
        String email
) {
}
