package Components;

public class CassettePlayer extends Component implements IPlayer {
    private int cassetteSlots;
    public void play (String song){
        this.currentlyPlaying = song;
    }
}
