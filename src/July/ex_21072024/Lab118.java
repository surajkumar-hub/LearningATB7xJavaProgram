package July.ex_21072024;

public class Lab118 {
    public static void main(String[] args) {
        int i = 10;
//        while (i<10)
//        {
//            System.out.println(i);
//            i++;
//        } // No output

        do
        {
            System.out.println(i);
            i++;
        }while(i<10); // O/P: 10

    }
}
// In do-while loop -> It'll print the statement first, then check the condition (It runs atleast 1 time)
// In while & for loop -> First it"ll check the condition, then it prints the statement
