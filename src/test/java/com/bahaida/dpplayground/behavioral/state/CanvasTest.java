package com.bahaida.dpplayground.behavioral.state;

import org.junit.Test;

import static org.junit.Assert.*;

public class CanvasTest {
    Canvas canvas = new Canvas();
    Tool brush = new BrushTool();
    Tool selection = new SelectionTool();

    @Test
    public void mouseDown_ShouldReturnBrush_IfToolIsBrush(){
        canvas.setTool(brush);
        assertEquals("Brush", canvas.mouseDown());
    }

    @Test
    public void mouseUp_ShouldReturnLine_IfToolIsBrush(){
        canvas.setTool(brush);
        assertEquals("Line", canvas.mouseUp());
    }

    @Test
    public void mouseDown_ShouldReturnBrush_IfToolIsSelection(){
        canvas.setTool(selection);
        assertEquals("Selection", canvas.mouseDown());
    }

    @Test
    public void mouseUp_ShouldReturnLine_IfToolIsSelection(){
        canvas.setTool(selection);
        assertEquals("Rectangle", canvas.mouseUp());
    }
}