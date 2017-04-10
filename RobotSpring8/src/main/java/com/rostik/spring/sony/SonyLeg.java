package com.rostik.spring.sony;

import com.rostik.spring.interfaces.Leg;

/**
 * Created by Ростик on 03.04.2017.
 */
public class SonyLeg implements Leg {
    @Override
    public void go() {
        System.out.println("Go to Sony!");
    }
}
