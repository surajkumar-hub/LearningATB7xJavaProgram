package August.ex_18082024.ExceptionHandelling;

// Throw Concept

public class Lab203 {
    public static void main(String[] args) throws Exception {
        // Purpose of throw
        // How to create a custom exception
        Bank sbi = new Bank("INR", 100);
//        Bank icici = new Bank("INR",  10);
//        Integer total = sbi.add(icici);
//        System.out.println(total);

        Bank jpmorgan = new Bank("USD", 89);
        Integer totalnew = sbi.add(jpmorgan);
        System.out.println(totalnew);


    }
}
