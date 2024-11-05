import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("добро пожаловать в программу для расчёта кредитов!");
        System.out.print("введите сумму кредита: ");
        
        double credit_amount = sc.nextDouble();
        double month_pay = credit_amount / 36;
        int month_count = 0;
        boolean program = true;
        
        while (program) {
            if (credit_amount < 100) {
                System.out.println("нет.");
                program = false;
                break;
            }      
            System.out.println("------------------------------------------->");
            System.out.println("1. месячный платёж");
            System.out.println("2. информация о кредите");
            System.out.println("3. выход из программы");
            System.out.print("команда: ");
            
            int menu_count = sc.nextInt();
            
            switch (menu_count) {
                case 1:
                    if (month_count >= 36) {
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println("ты больше никому не должен!");
                    } else {
                        month_count += 1;
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println("ты внёс " + month_count + " платёж из 36 всего.");
                        System.out.println("твоя cумма платежа:" + month_pay);
                    }
                    break;
                    
                case 2:
                    System.out.println(" ");
                    System.out.println("осталось выплатить: " + (credit_amount - (month_pay * month_count)));
                    System.out.println("твоя переплата: " + (credit_amount * 0.2));
                    System.out.println("осталось " + (36 - month_count) + " месяцев.");
                    break;
                case 3:
                    System.out.println("пока.");
                    program = false;
                    break;                    
            }
        }
        
        sc.close();
    }
}
