package Components;

public class CDPlayer extends Component implements IPlayer {
    private int numOfCDs;
    public void play (String song){
        this.currentlyPlaying = song;
    }

}
