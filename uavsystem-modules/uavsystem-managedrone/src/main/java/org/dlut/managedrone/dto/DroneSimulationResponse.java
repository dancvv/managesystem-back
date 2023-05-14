package org.dlut.managedrone.dto;

import lombok.Data;

import java.util.List;

@Data
public class DroneSimulationResponse {
    private List<DroneResult> drones;
    private String image;


    @Data
    public static class DroneResult {
        private int droneId;
        private List<Integer> completedTasks;
        private int totalEnergyConsumption;

    }
}
