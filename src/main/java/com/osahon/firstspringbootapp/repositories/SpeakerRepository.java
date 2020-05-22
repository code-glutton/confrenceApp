package com.osahon.firstspringbootapp.repositories;

import com.osahon.firstspringbootapp.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
