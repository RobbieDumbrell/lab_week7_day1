import Components.Radio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {


    Radio coolRadio;
    @Before
    public void before(){
        coolRadio = new Radio();
    }

    @Test
    public void canTuneToStations(){
        coolRadio.tune("Capital");
        assertEquals("Capital", coolRadio.getStation());
    }
}
