package August.ex_11082024.exAbstraction.RealLifeExample;

abstract class GrandBaseClass {
    abstract void takeScreenShot();

    GrandBaseClass(){}// We can create constructor of abstract class but there is now use of this
    // constructor because we can't create an object of abstract class

//    new GrandBaseClass(); creating an object of abstract class is not possible
}
