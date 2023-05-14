package org.dlut.managedrone.domain;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DroneInput {
    private int x;
    private int y;
    private int battery;

}
