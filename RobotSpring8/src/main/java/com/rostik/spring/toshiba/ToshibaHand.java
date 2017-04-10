package com.rostik.spring.toshiba;

import com.rostik.spring.interfaces.Hand;

/**
 * Created by Ростик on 03.04.2017.
 */
public class ToshibaHand implements Hand {
    @Override
    public void catchSomething() {
        System.out.println("Catch from Toshiba!!!");
    }
}
