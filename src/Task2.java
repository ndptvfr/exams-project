import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("мы в космосе, останови ракету - угадая пароль от 0 до 10, удачи.");
        Scanner sc = new Scanner(System.in);
        int attepmt = 0; // мне скучно, держите счетчик попыток, аче нет?
        while (true) {
            attepmt += 1;
            System.out.print("попытка №" + attepmt + ", какой пароль: ");
            int input_number = sc.nextInt();
            int current_number = (int) (Math.random() * 10) + 1;
            if (input_number == current_number) {
                System.out.println("угадал, прикинь!");
                break;
            } else {
                System.out.println("давай ещё раз))0)00))");
            }
        }
    }
}
