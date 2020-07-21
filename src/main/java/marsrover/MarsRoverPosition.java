package marsrover;


public class MarsRoverPosition {
    private int coordinatesX;
    private int coordinatesY;
    private Direction direction;

    public MarsRoverPosition(int coordinatesX, int coordinatesY, String direction) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.direction = Direction.fromShortName(direction);
    }

    public int getCoordinatesX() {
        return coordinatesX;
    }

    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }

    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public String getDirectionShortName() {
        return direction.getShortName();
    }


}
