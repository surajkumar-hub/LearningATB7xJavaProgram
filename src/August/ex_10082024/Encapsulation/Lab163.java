package August.ex_10082024.Encapsulation;

// ## Fixed Encapsulation
public class Lab163 {
    public static void main(String[] args)
    {
        VWOLogin1 vwoLogin = new VWOLogin1("admin","password123");
        System.out.println(vwoLogin.getUsername()); //O/P: admin
        vwoLogin.setUsername("pramod");
        System.out.println(vwoLogin.getUsername()); //O/P: Pramod


        // Write a code to Authenticate
        // Pramod is running the program - isAuth = true
        // vwoLogin.setPassword("1234",true);
        // if it is true, we're allowed to change the pwd but if it is false then we're not allowed
        vwoLogin.setPassword("1234",false);
    }
}

class VWOLogin1
{
    // Data Members
    private String username;
    private String password;

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password,boolean isAuth)
    {
        if(isAuth)
        {
            this.password = password;
        }else
        {
            System.out.println("Not Allowed!");
        }
    }

    public VWOLogin1(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
}

/** Encapsulation says you can't access any data member, any instance variable without a function.
It means we should create a function and only that function can access these variables and
data members. Basically we are discussing about getter and setter method. When we create this
getter setter functions, they can set the value and get the value also. Now getting and setting
the values can be controlled.
 Encapsulation is nothing but adding private key to the data members and using getter setter
 methods **/