package com.elmoultaka.selfservice.repository;

import com.elmoultaka.selfservice.model.ERole;
import com.elmoultaka.selfservice.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}