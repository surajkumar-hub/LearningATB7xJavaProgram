package August.ex_11082024.Abstraction.exCar;

public class WagonR extends Engine {

    void drive() {
        openCar();
        start();
        partGearBox();
        speed();
        stop();
    }

    @Override
    void start() {
        System.out.println("Starting WagonR");
    }

    @Override
    void stop() {
        System.out.println("Stop WagonR");

    }

    @Override
    void speed() {
        System.out.println("100KM/Hr");
    }

    @Override
    void partGearBox() {
        System.out.println("Wagon/Hr");

    }

    @Override
    void openCar() {
        System.out.println("open Keys");

    }
}
