package org.dlut.managedrone.dto;

import lombok.Data;
import org.dlut.managedrone.domain.DroneInput;
import org.dlut.managedrone.domain.TaskInput;

import java.util.List;

@Data
public class DroneSimulationRequest {
    private List<DroneInput> drones;
    private List<TaskInput> taskList;
}
