package Practice;

public class WordCount {
    public static void main(String[] args)
    {
        String str = "I love my country";
        String[] words = str.split(" ");
        System.out.println("Word count: " + words.length);
    }
}
