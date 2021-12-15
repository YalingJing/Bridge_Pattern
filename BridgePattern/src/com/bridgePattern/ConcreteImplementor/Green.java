package com.bridgePattern.ConcreteImplementor;

import com.bridgePattern.Implementor.Color;

public class Green implements Color {
    @Override
    public void paint(String penType, String name) {
        System.out.println(penType + "绿色的" + name + "!");
    }
}
