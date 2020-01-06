package com.bahaida.dpplayground.behavioral.memento;

import org.junit.Test;

import static org.junit.Assert.*;

public class EditorTest {

    @Test
    public void undo_ShouldUndoTheLastChange() {
        Editor editor = new Editor();
        History history = new History();
        editor.setContent("a");
        history.push(editor.createState());
        editor.setContent("b");
        history.push(editor.createState());
        editor.setContent("c");
        editor.restore(history.pop());

        assertEquals("b", editor.getContent());
        editor.restore(history.pop());

        assertEquals("a", editor.getContent());
    }

}