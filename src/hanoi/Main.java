package hanoi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDisks = Integer.parseInt(scanner.nextLine());
        char from = scanner.next().charAt(0);
        char helper = scanner.next().charAt(0);
        char to = scanner.next().charAt(0);
        scanner.close();
    }
}
