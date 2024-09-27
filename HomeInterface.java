public class HomeInterface {
    private HomeService light;
    private HomeService tv;
    private HomeService aircon;

    public HomeInterface(HomeService light, HomeService tv, HomeService aircon) {
        this.light = light;
        this.tv = tv;
        this.aircon = aircon;
    }

    public void turnOnAll() {
        light.turnOn();
        tv.turnOn();
        aircon.turnOn();
    }

    public void turnOffAll() {
        light.turnOff();
        tv.turnOff();
        aircon.turnOff();
    }
}
