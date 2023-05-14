package org.dlut.managedrone.service;

import org.dlut.managedrone.domain.DroneInput;
import org.dlut.managedrone.domain.TaskInput;
import org.dlut.managedrone.dto.DroneSimulationResponse;

import java.util.List;

public interface DroneSimulationService {
    DroneSimulationResponse simulateDroneTasks(List<DroneInput> drones, List<TaskInput> tasks);
}
