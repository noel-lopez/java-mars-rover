package com.codurance;

import com.sun.source.tree.DirectiveTree;

public abstract class Direction {
    private char orientation;
    public Direction(char orientation) {
        this.orientation = orientation;
    }
    public char getOrientation() {
        return orientation;
    }
    public abstract Direction turnRight();
    public abstract Direction turnLeft();


}