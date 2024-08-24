package August.ex_10082024.Polymorphism.MethodOverloading;

public class Lab165 {
    // Polymorphism

    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        int result = mathOperations.add(2,3);
        double result2 = mathOperations.add(2.4,3.6);
        String result3 = mathOperations.add("Pramod","Dutta");
        String result4 = mathOperations.add("Pramod",123);
        //String result4 = mathOperations.add("Pramod",12.34);
        /** At compile time only JVM figuring it out that there is no function like this -
        add(String, double). That's why it is called Compile time Polymorphism or Static Polymorphism
         or Method Overloading.
        Method Overloading - One or more methods with same name but different arguments **/
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}

