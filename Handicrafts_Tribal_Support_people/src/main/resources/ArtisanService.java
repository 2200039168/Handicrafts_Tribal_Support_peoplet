package com.tribal.handicrafts.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tribal.handicrafts.model.Artisan;
import com.tribal.handicrafts.repository.ArtisanRepository;

@Service
public class ArtisanService {
    @Autowired
    private ArtisanRepository artisanRepository;

    public List<Artisan> getAllArtisans() {
        return artisanRepository.findAll();
    }

    public Artisan saveArtisan(Artisan artisan) {
        return artisanRepository.save(artisan);
    }
}
