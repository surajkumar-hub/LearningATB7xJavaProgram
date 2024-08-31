package August.ex_11082024.exInterface.ex2;

public interface E {
    void startEngine();

    void stopEngine();

    default void haltEngineJustStart() {
        System.out.println("Halt the Engine");
    }

    default void haltEngineJustStop() {
        System.out.println("Halt the Engine");
    }

    static void M1() {
        System.out.println("M1");
    }

    void m2();

    void m3();
/** void m4()
 {
 System.out.println("Not possible");
 }
 We can't create concrete method in interface. Only with default & static keyword it is possible **/

}
