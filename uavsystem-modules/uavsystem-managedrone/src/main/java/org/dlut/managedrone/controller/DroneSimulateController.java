package org.dlut.managedrone.controller;

import org.dlut.common.core.domain.R;
import org.dlut.managedrone.dto.DroneSimulationRequest;
import org.dlut.managedrone.dto.DroneSimulationResponse;
import org.dlut.managedrone.service.DroneSimulationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simulate")
public class DroneSimulateController {
    @Autowired
    private DroneSimulationService droneSimulationService;
    @GetMapping("route")
    public R<DroneSimulationResponse> simulateDroneTasks(@RequestBody DroneSimulationRequest request){
        DroneSimulationResponse droneSimulationResponse = droneSimulationService.simulateDroneTasks(request.getDrones(), request.getTaskList());
        return R.ok(droneSimulationResponse);
    }
}
