package com.rostik.spring.main;

import com.rostik.spring.interfaces.Robot;
import com.rostik.spring.interfaces.RobotConveyor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ростик on 03.04.2017.
 */
public class Start {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Robot t1000 = (Robot) context.getBean("t1000");

//        RobotConveyor t1000Conveyor = (RobotConveyor) context.getBean("t1000Conveyor");
//
//        Robot terminator1 = t1000Conveyor.creatRobot();
//        Robot terminator2 = t1000Conveyor.creatRobot();
//        Robot terminator3 = t1000Conveyor.creatRobot();
//
//        System.out.println("terminator1 - " + terminator1);
//        System.out.println("terminator2 - " + terminator2);
//        System.out.println("terminator3 - " + terminator3);
        t1000.action();
    }
}
