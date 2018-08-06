package Components;

public abstract class Component {
    protected String make;
    protected String model;
    protected String currentlyPlaying;

    public String getCurrentlyPlaying() {
        return currentlyPlaying;
    }
}
