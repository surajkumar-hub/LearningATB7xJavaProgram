package August.ex_17082024.exWrapperClass;

public class Lab183 {
    public static void main(String[] args) {
        APIAutomation a = new APIAutomation();
        // SIB - call 1 time
        // IIB - when object is created
    }
}

class APIAutomation{

    static
    {
        // write a code to load the data from the MySQL
        System.out.println("Loaded data from the MYSQL");
    }

    {
        // write a code to load the data from the CSV file
        System.out.println("Loaded data from the CSV");

    }
}

/** OP:
 Loaded data from the MYSQL
 Loaded data from the CSV **/
