package com.bridgePattern.Abstraction;

import com.bridgePattern.Implementor.Color;

public abstract class AbstractBrush {
    public Color color;

    public void setColor(Color color){
        this.color = color;
    }

    public abstract void draw(String name);
}
