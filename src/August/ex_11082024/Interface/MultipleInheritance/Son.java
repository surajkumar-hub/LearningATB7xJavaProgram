package August.ex_11082024.Interface.MultipleInheritance;

public class Son implements Mother, Father {
    @Override
    public void loan()
    {
        System.out.println("This is only one Function");
    }

    @Override
    public void loan(String b, String c)
    {
        System.out.println("String b, String c");
    }

    @Override
    public void loan(String a)
    {
        System.out.println("String a");
    }

    @Override
    public void home()
    {

    }
}
