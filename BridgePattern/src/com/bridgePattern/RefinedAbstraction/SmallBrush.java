package com.bridgePattern.RefinedAbstraction;

import com.bridgePattern.Abstraction.AbstractBrush;

public class SmallBrush extends AbstractBrush {
    @Override
    public void draw(String name) {
        String penType = "小号毛笔绘制";
        this.color.paint(penType, name);
    }
}
