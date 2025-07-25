package August.ex_11082024.Abstraction.exCar;

class  Car extends Engine {
    // Engine
    // GearBox
    // Keys

    // Tesla is A Car
    // Directly Tesla will use - Drive() function. User can see only Drive() function but behind the scene
    // Tesla will use Engine, GearBox and Keys. These functionalities will be hidden from the user.


    @Override
    void openCar() {
        System.out.println("Open Car with keys");
    }

    @Override
    void partGearBox() {
        System.out.println("Part of GearBox");
    }

    @Override
    void stop() {
        System.out.println("Stop a Car");
    }

    @Override
    void speed() {
        System.out.println("Car");
    }

    @Override
    void start() {
        System.out.println("Start a Car");
    }
}

