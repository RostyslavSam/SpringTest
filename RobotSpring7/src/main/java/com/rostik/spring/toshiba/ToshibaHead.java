package com.rostik.spring.toshiba;

import com.rostik.spring.interfaces.Head;

/**
 * Created by Ростик on 03.04.2017.
 */
public class ToshibaHead implements Head {
    @Override
    public void calc() {
        System.out.println("Thinking Toshiba....");
    }
}
