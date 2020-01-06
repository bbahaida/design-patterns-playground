package com.bahaida.dpplayground.behavioral.state;

public class Canvas {
    private Tool tool;

    public String mouseDown() {
        return tool.mouseDown();
    }
    public String mouseUp() {
        return tool.mouseUp();
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }
}
