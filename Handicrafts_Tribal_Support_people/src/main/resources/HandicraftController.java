package com.tribal.handicrafts.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tribal.handicrafts.model.Handicraft;
import com.tribal.handicrafts.service.HandicraftService;

@RestController
@RequestMapping("/api/handicrafts")
public class HandicraftController {
    @Autowired
    private HandicraftService handicraftService;

    @GetMapping
    public List<Handicraft> getAllHandicrafts() {
        return handicraftService.getAllHandicrafts();
    }

    @PostMapping
    public Handicraft createHandicraft(@RequestBody Handicraft handicraft) {
        return handicraftService.saveHandicraft(handicraft);
    }
}
