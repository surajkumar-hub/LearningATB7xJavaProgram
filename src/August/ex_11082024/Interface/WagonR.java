package August.ex_11082024.Interface;

public class WagonR implements Engine{

    void drive()
    {
        startEngine();
        stopEngine();
    }

    @Override
    public void startEngine()
    {
        System.out.println("WagonR is starting");
    }

    @Override
    public void stopEngine()
    {
        System.out.println("WagonR is Stopping");
    }
}
