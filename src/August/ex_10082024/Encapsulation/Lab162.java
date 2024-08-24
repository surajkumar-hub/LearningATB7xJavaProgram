package August.ex_10082024.Encapsulation;

// Encapsulation Concept
// Encapsulation is a fundamental concept in object-oriented programming (OOP).
// Bundling of data and methods that operate on that data within a single unit.
public class Lab162 {
    public static void main(String[] args)
    {
        VWOLogin vwoLogin = new VWOLogin("admin","password123");
        System.out.println(vwoLogin.password); //O/P: password123
        vwoLogin.password = "123";
        System.out.println(vwoLogin.password); //O/P: 123
    }
}

    class VWOLogin // We can't have 2 public class. We can have only 1 public class in 1 java file
    {
        public String username;
        public String password;

        public VWOLogin(String username, String password)
        {
            this.username = username;
            this.password = password;
        }
    }

/** If we hide the VWOLogin class also anyone can change the password. There is no security in
this class.It shouldn't be allowed right? So, in this case what we should we do? **/