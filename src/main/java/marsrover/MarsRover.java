package marsrover;

import java.util.Arrays;

public class MarsRover {

    private MarsRoverPosition marsRoverPosition;
    private boolean reverse = false;

    public MarsRover(MarsRoverPosition marsRoverPosition) {

        this.marsRoverPosition = marsRoverPosition;
    }

    public MarsRoverPosition getMarsRoverPosition() {

        return marsRoverPosition;
    }

    public MarsRoverPosition receive(String commands) {
        Arrays.asList(commands.split("")).forEach(this::receiveSingleCommand);
        return getMarsRoverPosition();
    }

    private void receiveSingleCommand(String command) {
        if (Command.MOVE.getShortName().equals(command)) {
            if (isReverse()) {
                reverseMove();
                return;
            }
            move();
        }
        if (Command.TURN_LEFT.getShortName().equals(command)) {
            turnLeft();
        }
        if (Command.TURN_RIGHT.getShortName().equals(command)) {
            turnRight();
        }
        if (Command.Reverse.getShortName().equals(command)) {
            asternReverse();
        }
    }

    public void asternReverse() {
        reverse = !reverse;
    }

    public boolean isReverse() {
        return reverse;
    }

    private void reverseMove() {
        String directionShortName = marsRoverPosition.getDirectionShortName();
        if (directionShortName.equals(Direction.NORTH.getShortName())) {
            marsRoverPosition.setCoordinatesY(marsRoverPosition.getCoordinatesY() - 1);
        } else if (directionShortName.equals(Direction.EAST.getShortName())) {
            marsRoverPosition.setCoordinatesX(marsRoverPosition.getCoordinatesX() - 1);
        } else if (directionShortName.equals(Direction.WEST.getShortName())) {
            marsRoverPosition.setCoordinatesX(marsRoverPosition.getCoordinatesX() + 1);
        } else if (directionShortName.equals(Direction.SOUTH.getShortName())) {
            marsRoverPosition.setCoordinatesY(marsRoverPosition.getCoordinatesY() + 1);
        }
    }

    public void turnRight() {
        marsRoverPosition.setDirection(marsRoverPosition.getDirection().rightDirection());
    }

    public void turnLeft() {
        marsRoverPosition.setDirection(marsRoverPosition.getDirection().leftDirection());
    }

    public void move() {
        String directionShortName = marsRoverPosition.getDirectionShortName();
        if (directionShortName.equals(Direction.NORTH.getShortName())) {
            marsRoverPosition.setCoordinatesY(marsRoverPosition.getCoordinatesY() + 1);
        } else if (directionShortName.equals(Direction.EAST.getShortName())) {
            marsRoverPosition.setCoordinatesX(marsRoverPosition.getCoordinatesX() + 1);
        } else if (directionShortName.equals(Direction.WEST.getShortName())) {
            marsRoverPosition.setCoordinatesX(marsRoverPosition.getCoordinatesX() - 1);
        } else if (directionShortName.equals(Direction.SOUTH.getShortName())) {
            marsRoverPosition.setCoordinatesY(marsRoverPosition.getCoordinatesY() - 1);
        }
    }


}
