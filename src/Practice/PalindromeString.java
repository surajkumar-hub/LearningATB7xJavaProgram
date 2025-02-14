package Practice;

public class PalindromeString {
    public static void main(String[] args)
    {
        String s = "MADAM";
        String PS = "";
        for (int i = s.length()-1; i>=0; i--)
        {
            PS = PS +s.charAt(i);
        }
        if(s.equals(PS))
        {
            System.out.println(PS + " is a palindrome string");
        } else
        {
            System.out.println(PS + " is not a palindrome string");
        }
    }
}
