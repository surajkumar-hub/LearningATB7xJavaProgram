package July.ex_27072024;

public class Lab136 {
    public static void main(String[] args) {
        // How many rows and how many columns we have in this 2D array
        int[][] array_2d = {
                {34, 1},
                {34, 2},
                {34, 3}
        };

        int row = array_2d.length;
        for (int i = 0; i < row; i++) { // Row  0,1
            for (int j = 0; j < array_2d[i].length; j++) { // Column , 0,1,2
                System.out.print(array_2d[i][j]);
                System.out.print("\t");
            }
            System.out.println("");
        }

    }
}
