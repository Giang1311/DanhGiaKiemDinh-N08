import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int number = scanner.nextInt();

        if (isEven(number)) {
            System.out.println(number + " la so chan");
        } else {
            System.out.println(number + " la so le");
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}