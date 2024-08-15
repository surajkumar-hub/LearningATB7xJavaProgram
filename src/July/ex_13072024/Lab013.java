package July.ex_13072024;

public class Lab013 {
    public static void main(String[] args) {
        int a = 10;
        int b= 34;
       System.out.println(a+b); // Here it"ll add the values and o/p will be 44

          String s1 = "Pramod";
          String s2 = "Dutta";
         System.out.println(s1+s2); // Here it"ll concatenate the values and o/p will be PramodDutta

          String s3 = "Amit";
          int x = 99;
          int y = 100;
        System.out.println(x+y); // O/P: 199 -> here + added the two values
        System.out.println(x+s3); // O/P: 99Amit -> here + append the two values
        System.out.println(s3+y); // O/P: Amit100 -> here + append the two values
        System.out.println(x+y+s3); // O/P: 199Amit
        System.out.println(s3+x+y); // O/P: Amit99100
        System.out.println(x+s3+y); // O/P: 99Amit100
        System.out.println(x+y+s3+y+s3+x+y); // O/P: 199Amit100Amit99100
    }
}
