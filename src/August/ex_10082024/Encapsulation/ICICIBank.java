package August.ex_10082024.Encapsulation;

public class ICICIBank {
    // Encapsulation Rules -
    // Data members should be private in nature.
    // Methods with getter and setter only, you can access the data members / attributes.

    private String name;
    private long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

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
