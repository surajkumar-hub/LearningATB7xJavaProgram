package July.ex_27072024;

public class Lab128 {
    public static void main(String[] args) {
        final int[] ages = new int[4]; // In this case length is fixed not value
        ages[3] = 78;
        System.out.println(ages[3]); //78

        final int a = 10;
        //a = 90; It is not possible
    }
}