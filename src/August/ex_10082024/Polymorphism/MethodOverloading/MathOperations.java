package August.ex_10082024.Polymorphism.MethodOverloading;

public class MathOperations {
    // Encapsulation
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    int add(int a, int b)
    {
        return a + b;
    }

    /** int add(int a, int b)
    {
        return a + b;
    } **/ // If we use same parameter that is not allowed

    // Method Overloading

    int add(int pramod, int dutta, int amit, int megha)
    {
        return pramod + dutta;
    }

    void add(int a, int b, int c)
    {
        System.out.println("Hello");
    }

    double add(double a, double b)
    {
        return a + b;
    }

    double add(double a, double b, float f)
    {
        return a + b + f;
    }

    String add(String a, String b)
    {
        return a + b;
    }

    String add(String a, int b)
    {
        return a + b;
    }

    String add(int b, String a)
    {
        return a + b;
    }
    // We can have different types of constructors also
    MathOperations() {
    }

    MathOperations(int a) {
    }

    MathOperations(int a, int b) {
    }

    MathOperations(int a, int b, int c) {
    }

    MathOperations(int a, int b, int c, String d) {
    }

}
