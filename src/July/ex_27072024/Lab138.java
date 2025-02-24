package July.ex_27072024;

public class Lab138 {
    public static void main(String[] args) {
        // Generally people don't prefer to use String in automation because Strings are
        // immutable in nature
        // We have two more classes i.e. 1. StringBuilder , 2. StringBuffer
        String s1 = "PRAMOD";
        s1 = "Dutta"; // In this case 2 string object will be created in SCP memory

        StringBuffer stringBuffer = new StringBuffer("Pramod");
        // If user change the value of stringBuffer, then only one string value will be there
        stringBuffer.append("Dutta"); //append means a new string will be created with the name of
        // PramodDutta
        stringBuffer.append("JI"); //PramodDuttaJI

        StringBuilder stringBuilder = new StringBuilder("Amit");
        stringBuilder.append("Sharma"); // AmitSharma

        // It"ll solve our memory wastage problem
        // stringBuilder - not thread safe - people LOVE it :)


    }
}

/** StringBuffer and StringBuilder is different based on thread safety and we avoid
 * thread safety as much as we can in automation because thread safety leads to slowness.
 So people use StringBuilder most of the time */