package com.hirepath.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hirepath.model.Training;
import com.hirepath.repository.TrainingRepository;

@RestController
@RequestMapping("/api/trainings")
@CrossOrigin(origins = "*")
public class TrainingController {

	    private final TrainingRepository trainingRepository;

	    public TrainingController(TrainingRepository trainingRepository) {
	        this.trainingRepository = trainingRepository;
	    }

	    @GetMapping
	    public List<Training> getAllTrainings() {
	        return trainingRepository.findAll();
	    }

	    @PostMapping
	    public Training addTraining(@RequestBody Training training) {
	        return trainingRepository.save(training);
	    }
	
}
