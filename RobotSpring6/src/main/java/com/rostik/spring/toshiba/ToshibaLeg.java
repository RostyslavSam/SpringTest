package com.rostik.spring.toshiba;

import com.rostik.spring.interfaces.Leg;

/**
 * Created by Ростик on 03.04.2017.
 */
public class ToshibaLeg implements Leg {
    @Override
    public void go() {
        System.out.println("Go to Toshiba!");
    }
}
