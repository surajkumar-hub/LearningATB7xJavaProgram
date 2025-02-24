package July.ex_27072024;

public class Lab124 {
    public static void main(String[] args) {

        // Create an array
        int[] marks_10_board = {90, 91, 95, 99, 100, 78}; // Now elements are fixed.
        // It is also called hard coded values
        // length -> 6
        // who is present index - 3 -> 99
        System.out.println(marks_10_board.length); //6
        System.out.println(marks_10_board[3]); // 99
        System.out.println(marks_10_board[0]); // 90
        System.out.println(marks_10_board[-1]); // ArrayIndexOutOfBoundsException
        System.out.println(marks_10_board[10]); // ArrayIndexOutOfBoundsException

        // There is another way to create an array i.e. by using "New" keyword
        // Arrays -> new
        int[] marks = new int[3]; // Here no values are stored. So default value is zero
        // index - 0,1,2
        // length - 3
    }
}
