package com.rostik.spring.robot;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Created by Ростик on 10.04.2017.
 */
public class T1000Replacer implements MethodReplacer {
    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {

        System.out.println("From T1000Replecer Method!!!!!!");
        return null;
    }
}
