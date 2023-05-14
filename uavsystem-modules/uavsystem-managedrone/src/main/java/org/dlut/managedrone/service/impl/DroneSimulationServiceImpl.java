package org.dlut.managedrone.service.impl;

import org.dlut.managedrone.domain.DroneInput;
import org.dlut.managedrone.domain.TaskInput;
import org.dlut.managedrone.dto.DroneSimulationRequest;
import org.dlut.managedrone.dto.DroneSimulationResponse;
import org.dlut.managedrone.service.DroneSimulationService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class DroneSimulationServiceImpl implements DroneSimulationService {
    private static final String DRONE_SIMULATION_URL = "http://localhost:8000/drone_simulation";

    @Override
    public DroneSimulationResponse simulateDroneTasks(List<DroneInput> drones, List<TaskInput> tasks) {
        RestTemplate restTemplate = new RestTemplate();

        DroneSimulationRequest request = new DroneSimulationRequest();
        request.setDrones(drones);
        request.setTaskList(tasks);

        ResponseEntity<DroneSimulationResponse> response = restTemplate.postForEntity(
                DRONE_SIMULATION_URL, request, DroneSimulationResponse.class);

        return response.getBody();
    }
}
