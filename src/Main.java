public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        double balance = 0;
        double target = 2_459_000;
        int countOfMouth = 0;
        int deposition = 15000;
        double percent = 0.01;
        while (balance < target) {
            balance = balance + deposition + balance * percent;
            countOfMouth++;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей %n", countOfMouth, balance);
        }
        System.out.printf("Для накопления %.2f рублей необходимо %d месяцев %n", target, countOfMouth);

        System.out.println("Task2");
        int value = 0;
        while (value < 10) {
            value++;
            System.out.print(value + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(value + " ");
            value--;
        }
        System.out.println();

        System.out.println("Task3");
        int population = 12_000_000;
        int bornInYear = 17;
        int dieInYear = 8;
        for (int i = 1; i < 11; i++) {
            int births = bornInYear * population / 1000;
            int deaths = dieInYear * population / 1000;
            int deltaBornAndDie = births - deaths;
            population += deltaBornAndDie;
            System.out.printf("Год %d, численность населения составляет %d %n", i, population);
        }

        System.out.println("Task4");
        double deposit = 15000;
        double incrementPercent = 0.07;
        int month = 0;
        double goal = 12_000_000;
        while (deposit < goal) {
            month++;
            deposit = deposit + deposit * incrementPercent;
            System.out.printf("За %d месяц на счете %.2f рублей %n", month, deposit);
        }
        System.out.printf("Для накопления %.2f рублей необходимо %d месяцев %n", goal, month);

        System.out.println("Task5");
        double depositForTask5 = 15000;
        double incrementPercentForTask5 = 0.07;
        int monthForTask5 = 0;
        double goalForTask5 = 12_000_000;
        while (depositForTask5 < goalForTask5) {
            monthForTask5++;
            depositForTask5 = depositForTask5 + depositForTask5 * incrementPercentForTask5;
            if (monthForTask5 % 6 == 0)
                System.out.printf("За %d месяц на счете %.2f рублей %n", monthForTask5, depositForTask5);
        }

        System.out.println("Task6");
        deposit = 15000;
        int mouthInYear = 12;
        int countYear = 9;
        countOfMouth = countYear * mouthInYear;
        for (int i = 1; i <= countOfMouth; i++) {
            deposit = deposit + deposit * incrementPercent;
            if (i % 6 == 0)
                System.out.printf("За %d месяц на счете %.2f рублей %n", i, deposit);
        }
        System.out.printf("За %d лет Василий накопит %.2f рублей", countYear, deposit);

        System.out.println("Task7");
        int firstFriday = 1;
        for (int i = firstFriday; i <= 31; i += 7) {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет %n", i);
        }
    }
}