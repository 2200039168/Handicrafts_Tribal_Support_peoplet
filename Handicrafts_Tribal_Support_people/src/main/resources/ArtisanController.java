package com.tribal.handicrafts.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tribal.handicrafts.model.Artisan;
import com.tribal.handicrafts.service.ArtisanService;

@RestController
@RequestMapping("/api/artisans")
public class ArtisanController {
    @Autowired
    private ArtisanService artisanService;

    @GetMapping
    public List<Artisan> getAllArtisans() {
        return artisanService.getAllArtisans();
    }

    @PostMapping
    public Artisan createArtisan(@RequestBody Artisan artisan) {
        return artisanService.saveArtisan(artisan);
    }
}
