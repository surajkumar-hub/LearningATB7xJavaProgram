package ex_27072024;

public class Lab130 {
    public static void main(String[] args) {

        //  What is the maximum size of an array?

        int[] m = new int[1000000000];

        // If we declare like this, then maximum value will be integer max i.e. 2^31-1 (-2147483647).
        // Basically it depends upon the datatype. int[] m = new int[2147483647];

        // How can we define array for different data types:
        int[] int_array = {34,45,43};
        long[] l_array  = {34l, 45l,43l};
        float[] f_array = {45.56f, 32.34f, 43.43f};
        double[] d_array = {34.3, 43.4, 12.32};
        boolean[] b_array = {true,false,true,false};
        char[] c_array = {'A','B','D'};
        String names[] = {"Pramod","Amit","Alok"};
        String[] args1 = {"Pramod","Amit","Alok"};

        int ages[] = new int[4];
        int[] ages1 = new int[4];
        // int ages2[] = new [4]int; This is not possible

    }
}
