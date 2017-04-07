package com.rostik.spring.main;

import com.rostik.spring.interfaces.Robot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ростик on 03.04.2017.
 */
public class Start {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Robot t1000 = (Robot) context.getBean("t1000");

        t1000.action();
    }
}
