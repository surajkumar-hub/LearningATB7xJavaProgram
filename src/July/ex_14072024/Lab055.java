package July.ex_14072024;

public class Lab055 {
    public static void main(String[] args) {
        String s1 = new String("Pramod");
        String s2 = new String("Pramod");
        //  2 strings are created in Heap area
        String s3  = s1; // (This doesn't mean this is in the SCP).
        // It means S3 -> S1 in the heap area
        //  2 strings are created in Heap area  s3 -> s1 -> Pramod
    }
}
