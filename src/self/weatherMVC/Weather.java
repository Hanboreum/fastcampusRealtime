package self.weatherMVC;

public class Weather {
    private int temp;
    private String state;
    public Weather(){}

    public Weather(int temp, String state) {
        this.temp = temp;
        this.state = state;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "temp=" + temp +
                ", state='" + state + '\'' +
                '}';
    }
}

