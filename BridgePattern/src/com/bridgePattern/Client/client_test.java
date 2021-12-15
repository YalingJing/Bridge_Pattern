package com.bridgePattern.Client;

import com.bridgePattern.Abstraction.AbstractBrush;
import com.bridgePattern.Implementor.Color;

public class client_test {
    public static void main(String[] args){
        AbstractBrush abstractBrush;
        Color color;
        color = (Color) XMLUtil.getBean("Color");
        abstractBrush = (AbstractBrush) XMLUtil.getBean("AbstractBrush");
        abstractBrush.setColor(color);
        abstractBrush.draw("图画");
    }
}
