package August.ex_11082024.exAbstraction.exCar;

abstract class Keys {
    abstract void openCar();
}


class ConcreteClass {
    // This is a concrete class.
    //  We can create an object of concrete class
    //  To find out concrete class,  there shouldn't be abstract keyword
}

abstract class IncompleteAbstractClass{
    abstract void f1();
    abstract String f2();
    abstract boolean f3();
    abstract long f4();
}

// abstract methods has a return type
// abstract methods support all the data types
// A concrete class doesn't have abstract method. If it has, then it"ll become abstract class.
