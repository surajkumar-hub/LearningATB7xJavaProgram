package July.ex_27072024;

public class Lab129 {
    public static void main(String[] args) {
        final float pi = 3.14F; // Final is nothing but alternate name of Constant in Java

        // Disadvantage of array
        //1. Fixed Data Type (homogeneous)
        //2.  Fixed Length
        // 3. wastage of memory
        int[] ages = new int[100];
        ages[1] = 99;
        // Can we change the value on index 1 again?
        // Yes we can
        ages[1] = 100;
        System.out.println(ages[1]); // 0 99 0 0 0 0 0 0 0 0... Waste of memory

    }
}
