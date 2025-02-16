package July.ex_14072024;

public class Lab063 {
    public static void main(String[] args) {
        String password  = "Pramod@123";
        String pass_u = password.toLowerCase();
        System.out.println(pass_u);
        // pass_u == password
        System.out.println(pass_u == password);
        System.out.println(pass_u.equals(password));
        System.out.println(pass_u.equalsIgnoreCase(password)); // O/P: True
        // equalsIgnoreCase() ignores the case
        //Pramod@123 =  pramod@123  = PRamod@123 = PraMod@123 - According to
        // equalsIgnoreCase() all of the above values are equal

        System.out.println(password.substring(0,3)); // It will display the result from
        // o index to 3rd index O/P: Pra
        System.out.println(password.indexOf('r')); // Display the index of r
        System.out.println(password.length()); // Display the length of the string
    }
}
