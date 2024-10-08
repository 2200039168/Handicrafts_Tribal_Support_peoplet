package com.tribal.handicrafts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tribal.handicrafts.model.Artisan;

public interface ArtisanRepository extends JpaRepository<Artisan, Long> {
}
