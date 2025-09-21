package com.jaco.vibetrack.repository;

import com.jaco.vibetrack.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
}

