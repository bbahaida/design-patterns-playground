package com.bahaida.dpplayground.behavioral.state;

public class SelectionTool implements Tool{
    @Override
    public String mouseDown() {
        return "Selection";
    }

    @Override
    public String mouseUp() {
        return "Rectangle";
    }
}
