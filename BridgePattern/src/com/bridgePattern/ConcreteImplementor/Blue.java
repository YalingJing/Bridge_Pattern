package com.bridgePattern.ConcreteImplementor;

import com.bridgePattern.Implementor.Color;

public class Blue implements Color {

    @Override
    public void paint(String penType, String name) {
        System.out.println(penType + "蓝色的" + name + "!");
    }
}
