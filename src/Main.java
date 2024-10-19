public class Main {
    public static void main(String[] args) {

        //Task1
        System.out.println("Task1");
        double desiredSum = 2_459_000;
        double sum = 0;
        double deposit = 15000;
        double percent = 1D / 100;
        int month = 0;

        while (sum < desiredSum) {
            sum = sum + deposit;
            sum = (float) (sum * (1 + percent));
            month++;
            String formattedSum = String.format("%.2f", sum);
            String formattedDif = String.format("%.2f", desiredSum - sum);
            if ((desiredSum - sum) > 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + formattedSum + " рублей, осталось копить " + (formattedDif));
            } else {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + formattedSum + " рублей. Вы достигли цели");
            }
        }

        //Task2
        System.out.println();
        System.out.println("Task2");
        int j = 0;
        while (j < 10) {
            j++;
            System.out.print(j + " ");

        }
        System.out.println();
        int jj = 10;
        while (jj > 0) {
            System.out.print(jj + " ");
            jj--;

        }
        System.out.println();

        //Task3
        System.out.println();
        System.out.println("Task3");
        int population = 12_000_000;
        int bornPerThousand = 17;
        int deathPerThousand = 8;
        int year = 1;
        while (year <= 10) {
            int born = population / 1000 * bornPerThousand;
            int death = population / 1000 * deathPerThousand;
            population = population + born - death;
            System.out.println("Год " + year + ", численность населения составляет " + population);
            year++;
        }

        //Task4
        System.out.println();
        System.out.println("Task4");
        desiredSum = 12_000_000;
        sum = 15000;
        percent = 7D / 100;
        month = 0;

        while (sum < desiredSum) {
            sum = (sum * (1 + percent));
            month++;
            String formattedSum = String.format("%.2f", sum);
            String formattedDif = String.format("%.2f", desiredSum - sum);
            if ((desiredSum - sum) > 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + formattedSum + " рублей, осталось копить " + (formattedDif));
            } else {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + formattedSum + " рублей. Вы достигли цели");
            }
        }
        //Task5
        System.out.println();
        System.out.println("Task5");
        desiredSum = 12_000_000;
        sum = 15000;
        percent = 7D / 100;
        month = 0;

        while (sum < desiredSum) {
            sum = (sum * (1 + percent));
            month++;
            String formattedSum = String.format("%.2f", sum);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + formattedSum + " рублей");
            }
        }

        //Task6
        System.out.println();
        System.out.println("Task6");
        sum = 15000;
        percent = 7D / 100;
        month = 0;
        int years = 9;
        int months = years * 12;

        while (month < months) {
            sum = (sum * (1 + percent));
            month++;
            String formattedSum = String.format("%.2f", sum);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + formattedSum + " рублей");
            }
        }

        //Task7
        System.out.println();
        System.out.println("Task7");
        int friday = 5;
        do {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        } while (friday <= 31);

        //Task8
        System.out.println();
        System.out.println("Task8");
        int currentYear = 2024;
        int yearBefore = currentYear - 200;
        int yearAfter = currentYear + 100;
        int flightFrequency = 79;
        for (year = 0; year <= yearAfter; year = year + flightFrequency) {
            if (year <= yearAfter && year >= yearBefore)System.out.println(year);
        }
    }
}