package July.ex_20072024;

public class Lab087 {
    public static void main(String[] args) {
        int a = 11;
        switch (-1){
            default:
                System.out.println("Default");
                break;
            case -1:
                System.out.println("10");
                break;
            case 9:
                System.out.println("10");
                break;
        }
    }
}
// here -1 will match with the case -1 and output will be 10
