package August.ex_10082024.superthiskeyword;

public class Lab168 {

    class Student extends Person
    {
        // This is "is A"  relation - inheritance
        @Override
        void message()
        {
            System.out.println("I am Student message");
        }

        void display()
        {
            super.message();
        }

    }

    class Person {
        void message()
        {
            System.out.println("I am person message");
        }
}
}
