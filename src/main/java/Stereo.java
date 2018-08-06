import Components.*;

import java.util.ArrayList;

public class Stereo{
    private Radio radio;
    private CDPlayer cdPlayer;
    private CassettePlayer cassettePlayer;
    private RecordPlayer recordPlayer;
    private String name;
    private int volumeLevel;
    private ArrayList<IConnect> plugIns;

    public Stereo(Radio radio, CDPlayer cdPlayer, CassettePlayer cassettePlayer, RecordPlayer recordPlayer, String name) {
        this.radio = radio;
        this.cdPlayer = cdPlayer;
        this.cassettePlayer = cassettePlayer;
        this.recordPlayer = recordPlayer;
        this.name = name;
        this.volumeLevel = 0;
        this.plugIns = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void tuneRadio(String station){
        this.radio.tune(station);
    }

    public void playComponent(IPlayer player, String song){
        player.play(song);
    }

    public String getCurrentlyPlaying(Component player){
        return player.getCurrentlyPlaying();
    }

    public void changeVolume(int volume){
        this.volumeLevel += volume;
    }

    public void connect(IConnect device){
        plugIns.add(device);
    }

    public boolean hasDevice(IConnect device){
       return this.plugIns.contains(device);
    }
}
