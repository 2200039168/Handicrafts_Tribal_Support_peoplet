package com.tribal.handicrafts.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tribal.handicrafts.model.Handicraft;
import com.tribal.handicrafts.repository.HandicraftRepository;

@Service
public class HandicraftService {
    @Autowired
    private HandicraftRepository handicraftRepository;

    public List<Handicraft> getAllHandicrafts() {
        return handicraftRepository.findAll();
    }

    public Handicraft saveHandicraft(Handicraft handicraft) {
        return handicraftRepository.save(handicraft);
    }
}
