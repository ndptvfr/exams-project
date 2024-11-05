import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("скажи мне свое число: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        if (number == 7) {
            System.out.println("семерочка сюдаа");
        } else if (number == 13 || number == 24) {
            System.out.println("ужасное число");
        } else {
            System.out.println("ну для тебя " + number + " наверно классное число");
        }
    }
}
