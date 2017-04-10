package com.rostik.spring.robot;

import com.rostik.spring.interfaces.Hand;
import com.rostik.spring.interfaces.Head;
import com.rostik.spring.interfaces.Leg;
import com.rostik.spring.interfaces.Robot;

/**
 * Created by Ростик on 10.04.2017.
 */
public abstract class BaseModel implements Robot{

    private Head head;
    private Hand hand;
    private Leg leg;

    public BaseModel() {
        System.out.println(this + " - BaseModel");
    }

    public BaseModel(Head head, Hand hand, Leg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }
}
