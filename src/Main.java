public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        double targetAmount = 2_459_000;
        double monthlyContribution = 15000;
        double savings = 0;
        int month = 1;

        while (savings < targetAmount) {
            savings += monthlyContribution;
            System.out.printf("Месяц %d: сумма накоплений равна %.2f рублей\n", month, savings);
            month++;
        }
        System.out.println("Цель достигнута! Вам потребовалось " + (month - 1) + " месяцев, чтобы накопить 2 459 000 рублей.");

        System.out.println("Задача 2");
        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Задача 3");
        int people = 12_000_000;
        int birthrate = 17;
        int mortality = 8;
        for (int year = 1; year <= 10; year++) {
            people += people * (birthrate - mortality) / 1000;
            System.out.println("Год " + year + ": численность населения состовляет " + people + " человек");
        }

        System.out.println("Задача 4");
        double nestEgg = 15000;
        double targetSum = 12_000_000;
        double percent = 0.07;
        int moon = 1;

        while (nestEgg < targetSum) {
            nestEgg += nestEgg * percent;
            System.out.printf("Месяц %d: сумма накоплений равна %.2f рублей\n", moon, nestEgg);
            moon++;
        }
        System.out.println("Цель достигнута! Вам потребовалось " + (moon - 1) + " месяцев, чтобы накопить 12 000 000 рублей.");

        System.out.println("Задача 5");
        double depositAmount = 15000;
        double monthlyInterestRate = 7.0 / 100;
        int totalMonths = 9 * 12;

        for (int months = 1; months <= totalMonths; months++) {
            depositAmount *= (1 + monthlyInterestRate);

            if (months % 6 == 0) {
                System.out.printf("%d месяц: %.2f рублей\n", months, depositAmount);
            }
        }

        System.out.println("Задача 6");
        int pledgeMoon = 15000;
        double percentageMonth = 0.07;
        int monthPurpose = 9 * 12;
        int monthNumber = 1;

        while (monthNumber <= monthPurpose) {
            pledgeMoon += (int) (pledgeMoon * percentageMonth);

            if (monthNumber % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений: %d%n", monthNumber, pledgeMoon);
            }
            monthNumber++;
        }

        System.out.println("Задача 7");
        int firstFriday = 5;
        int daysInMonth = 31;

        for (int day = firstFriday; day <= daysInMonth; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }

        System.out.println("Задача 8");
        int currentYear = 2096;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        int cometPeriod = 79;

        for (int year = startYear; year <= endYear; year += cometPeriod) {
            System.out.println(year);
        }
    }
}