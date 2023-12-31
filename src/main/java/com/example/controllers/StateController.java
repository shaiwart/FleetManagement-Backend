package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.entities.State;
import com.example.services.StateService;
import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:3000") // in 'http://localhost:3000' h
public class StateController {
    @Autowired
    private StateService stateService; 

    // get all the states 
    @GetMapping("/api/states")
    public List<State> getAllStates() {
        return stateService.getAllStates();
    }

    
    // get cities by state id 
    @GetMapping("/api/state/{stateId}")
    public State getStateById(@PathVariable int stateId) {
        return stateService.getStateById(stateId); // need changes !!!!!!! 
    }
    
    
}
