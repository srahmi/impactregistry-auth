package io.impactregistry.auth.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ImpactregistryUserDto {

    long id;
    String username;
    String password;
}
