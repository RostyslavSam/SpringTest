package com.rostik.spring.robot;

import com.rostik.spring.interfaces.Hand;
import com.rostik.spring.interfaces.Head;
import com.rostik.spring.interfaces.Leg;
import com.rostik.spring.interfaces.Robot;

/**
 * Created by Ростик on 03.04.2017.
 */
public class ModelT1000 implements Robot {

    private Head head;
    private Hand hand;
    private Leg leg;

    public ModelT1000() {
    }

    public ModelT1000(Head head, Hand hand, Leg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    @Override
    public void fire() {

        head.calc();
        hand.catchSomething();
        leg.go();
    }

    @Override
    public void dance() {

        System.out.println("T1000 is dancing!");
    }
}
