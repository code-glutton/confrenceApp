package com.osahon.firstspringbootapp.repositories;

import com.osahon.firstspringbootapp.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
