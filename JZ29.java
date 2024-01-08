import java.util.ArrayList;
public class JZ29 {
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res =new ArrayList<>();
        int leftboundary = 0;
        int rightboundary = matrix[0].length - 1;
        int upperboundary = 1;
        int downboundary = matrix.length - 1;

        int total_number = matrix.length * matrix[0].length;
        int x = 0;
        int y = 0;
        int number = 1;
        while (number <= total_number) {
            while (y <= rightboundary && number <= total_number) {
                res.add(matrix[x][y]);
                number++;
                y++;
            }
            y--;
            x++;
            rightboundary--;

            while (x <= downboundary && number <= total_number) {
                res.add(matrix[x][y]);
                number++;
                x++;
            }
            x--;
            y--;
            downboundary--;
           
            while (y >= leftboundary && number <= total_number) {
                res.add(matrix[x][y]);
                number++;
                y--;
            }
            y++;
            x--;
            leftboundary++;

            while (x >= upperboundary && number <= total_number) {
                res.add(matrix[x][y]);
                number++;
                x--;
            }
            y++;
            x++;
            upperboundary++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        ArrayList<Integer> result = printMatrix(matrix);
        System.out.println(result);
    }
}
