public class HomeApp {
    public static void main(String[] args) {
        // creating home service objects
        HomeService light = new Light();
        HomeService tv = new TV();
        HomeService aircon = new AirConditioning();

        // creating home interface object
        HomeInterface homeInterface = new HomeInterface(light, tv, aircon);

        // turning on all home services
        homeInterface.turnOnAll();

        System.out.println();

        // turning off all home services
        homeInterface.turnOffAll();
    }
}
