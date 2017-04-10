package com.rostik.spring.sony;

import com.rostik.spring.interfaces.Hand;

/**
 * Created by Ростик on 03.04.2017.
 */
public class SonyHand implements Hand{
    @Override
    public void catchSomething() {
        System.out.println("Catch from Sony!!!");
    }
}
