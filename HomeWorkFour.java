/**
 * Java.Level 1. Homework #4
 *
 * @author Marina Nikiforova
 * @version 21.12.2021
 */

import java.util.Scanner;
import java.util.Random;


class HomeWorkFour {

    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;

    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'x';
    public static final char DOT_O = 'o';


    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            setHuman();
            printMap();
            if (isWinner(DOT_X)) {
                System.out.println("You won!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Sorry, Draw");
                break;
            }
            setAi();
            printMap();
            if (isWinner(DOT_O)) {
                System.out.println("Computer wins!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Sorry, Draw");
                break;
            }
        }
        System.out.println("Game over!");
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void setHuman() {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;

        do {
            System.out.println("Enter coordinates in X and Y format");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));

        map[y][x] = DOT_X;
    }

    public static void setAi() {
        Random random = new Random();
        int x;
        int y;

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Computer went to the point" + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y > SIZE)
            return false;
        if (map[y][x] == DOT_EMPTY)
            return true;
        return false;
    }

    public static boolean isWinner(char symb) {
        for (int i = 0; i < SIZE; i++)
            if ((map[i][0] == symb && map[i][1] == symb && map[i][2] == symb) ||
                    (map[0][i] == symb && map[1][i] == symb && map[2][i] == symb))
                return true;
        if ((map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) ||
                (map[0][2] == symb && map[1][1] == symb && map[2][0] == symb))
            return true;
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}