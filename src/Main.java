import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name");
        String first = scanner.nextLine();
        System.out.println("Enter second name");
        String second = scanner.nextLine();
        char[][] game = new char[3][3];
            for(int i = 0; game.length > i; i++) {
                for (int j = 0; game[i].length > j; j++) {
                    game[i][j] = '-';
                }
            }
        while (true) {
            int count = 0;
            while (true) {
                System.out.println(first + " motion");
                System.out.println("Choose a string");
                int firstmotion = scanner.nextInt() - 1;
                if (firstmotion > 2 || firstmotion <0) {
                    System.out.println("Wrong. Enter other number");
                    continue;
                }
                System.out.println("Choose a column");
                int firstmotion2 = scanner.nextInt()-1;
                if (firstmotion2 > 2 || firstmotion < 0) {
                    System.out.println("Wrong. Enter other number");
                    continue;
                }
                if (game[firstmotion][firstmotion2] != '-') {
                    System.out.println("Wrong. Enter other number");
                    continue;
                } else
                    game[firstmotion][firstmotion2] = 'X';
                break;
            }
                for(int i = 0; game.length > i; i++) {
                    for (int j = 0; game[i].length > j; j++) {
                        System.out.print(game[i][j]);
                    }
                    System.out.println();
                }
            if (is('X',game,first)) {
                break;
            }
            if(isf(game, count)) {
                System.out.println("Game was finished");
                break;
            }
            count = 0;
            while (true) {
                System.out.println(second + " motion");
                System.out.println("Choose a string");
                int secondmotion = scanner.nextInt() - 1;
                if ((secondmotion > 2) || (secondmotion < 0)) {
                    System.out.println("Wrong. Enter other number");
                    continue;
                }
                System.out.println("Choose a column");
                int secondmotion2 = scanner.nextInt() - 1;
                if ((secondmotion2 > 2) || (secondmotion2 < 0)) {
                    System.out.println("Wrong. Enter other number");
                    continue;
                }
                if (game[secondmotion][secondmotion2] != '-') {
                    System.out.println("Wrong. Enter other number");
                    continue;
                } else
                    game[secondmotion][secondmotion2] = '0';
                break;
            }
                for(int i = 0; game.length > i; i++) {
                    for (int j = 0; game[i].length > j; j++) {
                        System.out.print(game[i][j]);
                    }
                    System.out.println();
                }
            if(is('0',game, second)) {
                break;
            }
            if(isf(game, count)) {
                System.out.println("Game was finished");
                break;
            }
            count = 0;
        }
    }

    private static boolean is(char n, char[][] game, String name) {
        if ((game[0][0] == n && game[0][1] == n && game[0][2] == n) ||
                (game[1][0] == n && game[1][1] == n && game[1][2] == n) ||
                (game[2][0] == n && game[2][1] == n && game[2][2] == n) ||
                (game[0][0] == n && game[1][0] == n && game[2][0] == n) ||
                (game[0][1] == n && game[1][1] == n && game[2][1] == n) ||
                (game[0][2] == n && game[1][2] == n && game[2][2] == n) ||
                (game[0][0] == n && game[1][1] == n && game[2][2] == n) ||
                (game[0][2] == n && game[1][1] == n && game[2][0] == n)) {
            System.out.println(name+ " won");
            return true;
        }
        return false;
    }
    private static boolean isf(char[][] game, int count) {
        for(int i = 0; game.length > i; i++) {
            for (int j = 0; game[i].length > j; j++) {
                if (game[i][j] == '-') {
                    count = 1;
                }
            }
        }
        if (count != 1) {
            return true;
        }
        else
            return false;
    }
}
