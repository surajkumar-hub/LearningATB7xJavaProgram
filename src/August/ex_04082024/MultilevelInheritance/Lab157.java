package August.ex_04082024.MultilevelInheritance;

public class Lab157 {
    public static void main(String[] args) {
        // Concept of Multilevel Inheritance
        // Grand Father -> Father -> Child
        Child c1 = new Child();
        c1.home(); // Here by using c1 ref. we can access child home because local has more priority

        /** If home name is same then automatically 1st priority will be Child -> then Father ->
        then GF. If home name is different then we"ll get option which one to use.
         Suppose child doesn't have home then it"ll fetch father's 2BHK and if father doesn't have
        any home then it"ll fetch GF's home **/

        c1.c();
        c1.gf();
        c1.f();
    }
}
