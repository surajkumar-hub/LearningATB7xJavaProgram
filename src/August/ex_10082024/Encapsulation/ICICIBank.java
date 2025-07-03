package August.ex_10082024.Encapsulation;

public class ICICIBank {
    // Encapsulation Rules -
    // Data members should be private in nature.
    // Methods with getter and setter only, you can access the data members / attributes.

    private String name;
    private long bal;

    // PC Constructor
    public ICICIBank(String name, long bal)
        {
        this.name = name;
        this.bal = bal;
    }
    // Getter Setter Methods
    public long getBal(boolean isAdmin)
    {
        if (isAdmin)
        {
            return bal;
        } else
        {
            return 0;
        }
    }

    public void setBal(long bal, boolean isAdmin)
    {
        if (isAdmin)
        {
            this.bal = bal;
            System.out.println("Allowed");
        } else
        {
            System.out.println("Not Allowed!");
        }
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name, boolean isAdmin)
    {
        if (isAdmin)
        {
            this.name = name;
            System.out.println("Allowed");
        } else
        {
            System.out.println("Not Allowed!");
        }
    }

}

// Use setter and getter method with condition to secure your data member
// Getter is used to fetch the data member
// Setter is used to update the value
// We"ll be Encapsulation concept in -
// Web Automation - When we create a Page Class
// API Automation - When we create a Pojo Class

/** Advantages of Encapsulation:
 1. Data Hiding
 2. Increased Flexibility - We can make the variables of the class read only or write only depending
 on requirement.
 3.Security
 4.Maintain the privacy
 */
