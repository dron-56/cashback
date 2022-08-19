public class Main {
    public static void main(String[] args) {
        int deposit = 1250; // сумма пополнения
        int balance = 300; // сумма на счете
        int bonus = 0; // количество бонусов

        if (deposit > 1000) {
            bonus = deposit / 100;
        }

        balance = balance + deposit + bonus;

        System.out.println(balance + " рублей на счете");
        System.out.println(bonus + " бонусных рублей");
    }
}
