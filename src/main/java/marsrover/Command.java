package marsrover;

public enum Command {
    MOVE("M"), TURN_LEFT("L"), TURN_RIGHT("R"),Reverse("B");

    private String shortName;

    Command(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }
}
