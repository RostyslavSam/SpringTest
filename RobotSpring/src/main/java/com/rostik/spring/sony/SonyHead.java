package com.rostik.spring.sony;

import com.rostik.spring.interfaces.Head;

/**
 * Created by Ростик on 03.04.2017.
 */
public class SonyHead implements Head {
    @Override
    public void calc() {
        System.out.println("Thinking Sony....");
    }
}
