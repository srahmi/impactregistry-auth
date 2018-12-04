package io.impactregistry.auth.repository;

import io.impactregistry.auth.domain.ImpactregistryUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<ImpactregistryUser, Long> {
    ImpactregistryUser findByUsername(String username);
}
