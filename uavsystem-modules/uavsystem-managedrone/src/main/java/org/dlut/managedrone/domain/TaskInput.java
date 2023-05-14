package org.dlut.managedrone.domain;

import lombok.Data;

@Data
public class TaskInput {
    private int x;
    private int y;
    private int priority;
    private int energy_requirement;
}
