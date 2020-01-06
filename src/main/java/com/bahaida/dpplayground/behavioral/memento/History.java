package com.bahaida.dpplayground.behavioral.memento;

import java.util.Stack;

public class History {
    Stack<EditorState> states = new Stack<>();
    public void push(EditorState state) {
        states.push(state);
    }

    public EditorState pop(){
        return states.pop();
    }
}
