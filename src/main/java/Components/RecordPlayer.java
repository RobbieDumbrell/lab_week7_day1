package Components;

public class RecordPlayer extends Component implements IPlayer {
    private int playSpeed;
    public void play (String song){
        this.currentlyPlaying = song;
    }
}
