import Components.CDPlayer;
import Components.CassettePlayer;
import Components.Radio;
import Components.RecordPlayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo coolStereo;
    Radio coolRadio;
    CDPlayer coolCDPlayer;
    CassettePlayer coolCassetePlayer;
    RecordPlayer coolRecordPlayer;
    mp3Player coolMp3Player;
    @Before
    public void before(){
        coolRadio = new Radio();
        coolCDPlayer= new CDPlayer();
        coolCassetePlayer = new CassettePlayer();
        coolRecordPlayer = new RecordPlayer();
        coolMp3Player = new mp3Player();
        coolStereo = new Stereo(coolRadio, coolCDPlayer, coolCassetePlayer, coolRecordPlayer, "Jerry");
    }

    @Test
    public void stereoCanTuneRadio(){
        coolStereo.tuneRadio("Capital");
        assertEquals("Capital", coolRadio.getStation());
    }
    @Test
    public void playCdPLayer(){
        coolStereo.playComponent(coolCDPlayer, "Let's find a rock");
        assertEquals("Let's find a rock", coolCDPlayer.getCurrentlyPlaying());
    }
    @Test
    public void playRecordPlayer(){
        coolStereo.playComponent(coolRecordPlayer, "I wanna rock");
        assertEquals("I wanna rock", coolRecordPlayer.getCurrentlyPlaying());
    }
    @Test
    public void playCassetePlayer(){
        coolStereo.playComponent(coolCassetePlayer, "Stop the rock");
        assertEquals("Stop the rock", coolCassetePlayer.getCurrentlyPlaying());
    }

    @Test
    public void canAddPlugIn(){
        coolStereo.connect(coolMp3Player);
        assertEquals(true, coolStereo.hasDevice(coolMp3Player));
    }


}
