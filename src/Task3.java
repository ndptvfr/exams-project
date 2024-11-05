import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String[] array = new String[25];
        System.out.println("программа для хранения списка фильмов");
        
        for (int i=0; i<25; i++) {        
            System.out.print("введите фильм: ");
            Scanner sc = new Scanner(System.in);
            String film = sc.nextLine();
            if (film.equalsIgnoreCase("выход") || film.equalsIgnoreCase("exit")) { 
                break;
            } else {
                array[i] = film;
            }
        }
        System.out.println("все фильмы: " + Arrays.toString(array)); // у меня в вижуал студио тут почему то русские буквы превращаются в знаки вопроса, надесь что код работает. 
    }
}
