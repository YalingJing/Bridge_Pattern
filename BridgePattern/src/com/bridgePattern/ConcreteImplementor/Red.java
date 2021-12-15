package com.bridgePattern.ConcreteImplementor;

import com.bridgePattern.Implementor.Color;

public class Red implements Color {
    @Override
    public void paint(String penType, String name) {
        System.out.println(penType + "红色的" + name + "!");
    }
}
