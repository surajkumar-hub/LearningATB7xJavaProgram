package July.ex_27072024;

import java.sql.SQLOutput;

public class Lab131 {
    public static void main(String[] args) {
//        System.out.println(args[0]);
//        System.out.println(args[1]);
//        System.out.println(args[2]);
//        System.out.println(args.length);

        if (args.length > 0)
        {
            for (int i = 0; i < args.length ; i++)
            {
                System.out.println(args[i]);
            }
        }
        else
        {
            System.out.println("No Arguments given");
        }

    }
}

// Here we have discussed on line 4 i.e. main(String[] args)