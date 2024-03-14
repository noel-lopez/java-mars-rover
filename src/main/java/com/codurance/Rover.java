package com.codurance;

public class Rover {
    private Direction direction = new North();
    public String execute(String commands) {
        char[] commandsList = commands.toCharArray();

        for (char command: commandsList){
            if (command == 'R'){
                direction = direction.turnRight();
            }
            if (command == 'L'){
                direction = direction.turnLeft();
            }
        }

        return "0:0:" + direction.getOrientation();
    }

}
