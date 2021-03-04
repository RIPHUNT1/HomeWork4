
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTakToe {
    private static char[][] map;
    private static final int SIZE = 3;
    private static final char EMPTY_DOT = '•';
    private static final char X_DOT = 'X';
    private static final char O_DOT = 'O';
    private static Scanner sc;

    public static void main(String[] args) {
        initGame();
        int xCordinate;
        int yCordinate;
        do {
            Random random = new Random();
             xCordinate = random.nextInt(SIZE);
             yCordinate = random.nextInt(SIZE);
        } while (!isValidCell (xCordinate, yCordinate));
        map [xCordinate][yCordinate] = "O_DOT";
        }




    private static boolean isValidCell do {
        System.out.println("Введите координаты x y ");
        if (sc.hasNext()) {
            xCordinate = sc.nextInt();
        }
        if (sc.hasNext()) {
            yCordinate = sc.nextInt();
        }
    } while(!isValidCell(xCordinate, yCordinate));
    (int x, int y, char[][] map){
        if (x < 0 || y < 0 || x > map.length - 1 || y > map.length - 1) {
            return false;
        }
        return map[x][y] == EMPTY_DOT;
        private static final char EMPTY = 'X_DOT';


    }


        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();

        }



            



    private static void initGame() {
        sc = new Scanner(System.in);
        map = new char[SIZE][SIZE];
        for (char[] chars : map) {
            Arrays.fill(chars, EMPTY_DOT);
        }

    }

}
