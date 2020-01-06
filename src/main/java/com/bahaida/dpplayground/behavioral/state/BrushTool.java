package com.bahaida.dpplayground.behavioral.state;

public class BrushTool implements Tool {
    @Override
    public String mouseDown() {
        return "Brush";
    }

    @Override
    public String mouseUp() {
        return "Line";
    }
}
