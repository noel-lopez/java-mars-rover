package com.codurance;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

/*
- Rotate right
- Rotate left
- Move forward
- Warp around grid
- Not move above an obstacle
 */

class RoverShould {
    @ParameterizedTest
    @CsvSource ({
            "R, 0:0:E",
            "RR, 0:0:S",
            "RRR, 0:0:W",
            "RRRR, 0:0:N",
            "L, 0:0:W",
            "LL, 0:0:S",
            "LLL, 0:0:E",
            "LLLL, 0:0:N",
            "LRLLR, 0:0:W",
    })
    public void
    rotate_right_and_left (String commands, String desiredOutput) {
        Rover rover = new Rover();
        String output = rover.execute(commands);
        assertEquals(desiredOutput, output);
    }
}