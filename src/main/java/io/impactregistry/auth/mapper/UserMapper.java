package io.impactregistry.auth.mapper;

import io.impactregistry.auth.domain.ImpactregistryUser;
import io.impactregistry.auth.dto.ImpactregistryUserDto;

public final class UserMapper {

    public static ImpactregistryUserDto toDto(ImpactregistryUser impactregistryUser) {
        return ImpactregistryUserDto.builder()
                .id(impactregistryUser.getId())
                .username(impactregistryUser.getUsername())
                .build();
    }

    public static ImpactregistryUser toEntity(ImpactregistryUserDto impactregistryUserDto) {
        return ImpactregistryUser.builder()
                .id(impactregistryUserDto.getId())
                .username(impactregistryUserDto.getUsername())
                .password(impactregistryUserDto.getPassword())
                .build();
    }
}
