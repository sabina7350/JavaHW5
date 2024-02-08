package ru.netology.javaqa.JavaHW5.services;

public class Schedule {
    public int calculate(int income, int expense, int thresold) {
        int money = 0;
        int count = 0;

        for (int month = 1; month <= 12; month++) {
            {
                System.out.printf("Месяц %d. Денег %d. ", month, money);
                if (money < thresold) { // ворк
                    money = (money + income - expense);
                    System.out.printf("Придётся работать. Заработал +%d, потратил -%d%n", income, expense);

                } else { // чилл
                    money = (money - expense) / 3;
                    System.out.printf("Буду отдыхать. Потратил -%d, затем ещё -%d%n", expense, money / 3);
                    count++;
                }
            }
        }
        return count;
    }
}




