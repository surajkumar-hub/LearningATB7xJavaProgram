package August.ex_10082024.Polymorphism.MethodOverriding;

public class Lab166 {
    // Method overriding | Runtime Polymorphism
    public static void main(String[] args) {
        Hound h1 = new Hound();
        h1.bark(); // I am Hound, I will Bark!! because local has priority
        h1.bike();

        Dog d1 = new Dog();
        d1.bark(); // I am Dog, i will Bark!!

        Dog dog_Ref = new Hound(); // Parent reference with child object is possible
        dog_Ref.bark(); // Overriden Functions O/P: I am Hound, I will Bark!
        //dog_Ref.bike();
        // We can't call this bike() method because this method doesn't exist in Dog class.
        // Dog doesn't know there is a bike() in Hound class. It means we can call only common
        // methods by using parent reference.

        //Hound h2 = new Dog(); // Not possible because son can't exist before father  

    }
}
