package com.example.services;

import java.util.List;

import com.example.entities.State;

public interface StateService {
    List<State> getAllStates();
    State getStateById(int stateId);
}
