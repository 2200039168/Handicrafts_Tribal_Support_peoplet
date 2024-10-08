package com.tribal.handicrafts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tribal.handicrafts.model.Handicraft;

public interface HandicraftRepository extends JpaRepository<Handicraft, Long> {
}
