import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Задание 1.
        System.out.println("Задание 1");
        System.out.println();

        int year = 2012;

         checksYears(year);

        System.out.println();
        // Задание 2.
        System.out.println("Задание 2");
        System.out.println();

        int osIosOrAndroid = 0;
        int yearOfProduction = 2022;
        int currentYear = LocalDate.now().getYear();

        choosingPrograms(osIosOrAndroid, yearOfProduction, currentYear);

        System.out.println();
        // Задание 3.
        System.out.println("Задание 3");
        System.out.println();

        int deliveryDistance = 95;

        calculationOfDeliveryTime(deliveryDistance);

    }
    public static void checksYears(int year) {

        if (((year % 4) == 0) && ((year % 100) != 0) || ((year % 400) == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void choosingPrograms(int osIosOrAndroid, int yearOfProduction, int currentYear) {

        if (yearOfProduction < currentYear) {

            if (osIosOrAndroid == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");

            } else if (osIosOrAndroid == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");

            } else {
                System.out.println("Выберете Вашу операционную систему: iOS - цифра 0, или Android - цифра 1.");
            }

        } else {
            System.out.println("Ваше приложение работает корректно.");
        }

    }

    public static void calculationOfDeliveryTime(int deliveryDistance) {

        if (deliveryDistance < 21) {
            System.out.println("Потребуется дней: 1");

        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");

        }else if (deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");

        }
    }




    /*
    public static void printSeparator() {
        System.out.println("+++++++++++++");
        System.out.println("-------------");
    }
    public static void printIssues(int issuesCount) {
        System.out.println(issuesCount);
    }
    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] issuesByMonths = {1, 4, 8, 9, 3, 5, 6, 8, 1, 4, 7, 9, 3, 7};
        printSeparator();
        for (int i = 0; i < issuesByMonths.length; i++) {
            printIssues(issuesByMonths[i]);
            if ((i + 1) % 3 == 0) {
                printSeparator();
            }
        }
        printSeparator();
        int total = sum(issuesByMonths);
        printIssues(total);
    }*/
}