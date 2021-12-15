package com.bridgePattern.RefinedAbstraction;

import com.bridgePattern.Abstraction.AbstractBrush;

public class LargeBrush extends AbstractBrush {

    @Override
    public void draw(String name) {
        String penType = "大号毛笔绘制";
        this.color.paint(penType, name);
    }
}
