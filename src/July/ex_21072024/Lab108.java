package July.ex_21072024;

public class Lab108 {
    public static void main(String[] args) {
        // Use of continue keyword
        for (int i = 0; i < 10; i++) // i = 0 to 9, times  = 10
        {
            System.out.println(i);
            if( i == 5)
            {
                continue; // Continue basically used to skipping the remaining program
                /** Basically it means when i value became 5, row no 14 won't execute and will be skipped **/
            }
            System.out.println("After!!");
        }
    }
}

/**  O/P:
 0
 After!!
 1
 After!!
 2
 After!!
 3
 After!!
 4
 After!!
 5
 6
 After!!
 7
 After!!
 8
 After!!
 9
 After!! **/
