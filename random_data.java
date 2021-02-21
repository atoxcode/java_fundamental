import java.util.Scanner;
import java.util.Random;

class random_data {
    public static void main(String[] args) {

        Random rand = new Random();

        int randomnumber = rand.nextInt(9901) + 100;

        Scanner console = new Scanner(System.in);

        System.out.print("Enter row :");
        int n = console.nextInt();

        System.out.print("Enter column :");
        int y = console.nextInt();

        int[][] array = new int[n][y];
        array[n][y] = randomnumber;

        for (int i = 0; i < array.length; i++) {

            for (int k = 0; k < array[i].length; k++) {
                array[i][k] = rand.nextInt(9901) + 100;
                System.out.print(array[i][k]);

            }
            System.out.println(); // separate rows
        }
    }

}
