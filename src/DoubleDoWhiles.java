public class DoubleDoWhiles {
    public static void main(String[] args) {
        int row = 1, column;
        do{
            column = 1;
            do{
                System.out.print(column + " ");
                column++;
            }
            while(column <= row);
            System.out.println();
            row++;
        }
        while(row <= 6);
    }
}