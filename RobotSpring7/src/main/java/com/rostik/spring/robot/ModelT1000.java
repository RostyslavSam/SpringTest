package com.rostik.spring.robot;

import com.rostik.spring.interfaces.Hand;
import com.rostik.spring.interfaces.Head;
import com.rostik.spring.interfaces.Leg;
import com.rostik.spring.interfaces.Robot;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by Ростик on 03.04.2017.
 */
public class ModelT1000 extends BaseModel implements InitializingBean, DisposableBean {

    private String color;
    private int year;
    private boolean soundEnable;

    public ModelT1000() {
    }

    public ModelT1000(Head head, Hand hand, Leg leg) {
        super(head, hand, leg);
    }

    public ModelT1000(String color, int year, boolean soundEnable) {
        this.color = color;
        this.year = year;
        this.soundEnable = soundEnable;
    }

    public ModelT1000(Head head, Hand hand, Leg leg, String color, int year, boolean soundEnable) {
        super(head, hand, leg);
        this.color = color;
        this.year = year;
        this.soundEnable = soundEnable;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnable() {
        return soundEnable;
    }

    public void setSoundEnable(boolean soundEnable) {
        this.soundEnable = soundEnable;
    }

    @Override
    public void action() {

        getHead().calc();
        getHand().catchSomething();
        getLeg().go();
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Can play sound: " + soundEnable);
    }

    @Override
    public void dance() {

        System.out.println("T1000 is dancing!");
    }

    public void initObject(){
        System.out.println("init...");
    }

    public void destroyObject(){
        System.out.println("destroy...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(this + " - method destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println(this + " - method init");
    }
}
