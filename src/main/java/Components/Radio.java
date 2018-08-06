package Components;

public class Radio extends Component {

    private String station;

    public void tune(String station){
        this.station = station;
    }

    public String getStation() {
        return station;
    }
}
