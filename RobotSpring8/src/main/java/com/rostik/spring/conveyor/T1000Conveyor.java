package com.rostik.spring.conveyor;

import com.rostik.spring.interfaces.Robot;
import com.rostik.spring.interfaces.RobotConveyor;

/**
 * Created by Ростик on 10.04.2017.
 */
public abstract class T1000Conveyor implements RobotConveyor {

    @Override
    public abstract Robot creatRobot();
}
