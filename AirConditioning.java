public class AirConditioning implements HomeService{
    @Override
    public void turnOn() {
        System.out.println("Aircon is turned on!");
    }

    @Override
    public void turnOff() {
        System.out.println("Aircon is turned off!");
    }
}
