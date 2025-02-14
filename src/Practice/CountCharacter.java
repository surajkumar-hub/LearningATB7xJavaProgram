package Practice;

public class CountCharacter {
    public static void main(String[] args) {
            String str = "QAInterview";
            char ch = 'e';
            int count = 0;
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == ch)
                {
                    count++;
                }
            }
            System.out.println("Character " + ch + " occurs " + count + " times.");
        }
    }

