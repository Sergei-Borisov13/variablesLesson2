public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte a = 100;
        short b = 200;
        int c = 300;
        long d = 400L;
        float e = 500.16f;
        double f = 600.1654986161654;
        System.out.println("Значение переменной A с типом byte равно " + a);
        System.out.println("Значение переменной B с типом short равно " + b);
        System.out.println("Значение переменной C с типом int равно " + c);
        System.out.println("Значение переменной D с типом long равно " + d);
        System.out.println("Значение переменной E с типом float равно " + e);
        System.out.println("Значение переменной F с типом double равно " + f);
    }

    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
        System.out.println("Значению " + a + " соответствует переменная float");
        System.out.println("Значению " + b + " соответствует переменная long");
        System.out.println("Значению " + c + " соответствует переменная float");
        System.out.println("Значению " + d + " соответствует переменная short");
        System.out.println("Значению " + e + " соответствует переменная short");
        System.out.println("Значению " + f + " соответствует переменная short");
        System.out.println("Значению " + g + " соответствует переменная byte");
    }
    public static void task3() {
        System.out.println("Задача 3");
        byte studentsLudmily = 23;
        byte studentsAnny = 27;
        byte studentsEkateriny = 30;
        short sheetsPaper = 480;
        byte totalStudents = (byte) (studentsLudmily + studentsAnny + studentsEkateriny);
        short sheetsToTheStudent = (short) (sheetsPaper / totalStudents);
        System.out.println("На каждого ученика рассчитано " + sheetsToTheStudent + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte efficiency = 16;
        byte duringTheTime = 2;
        byte productivityMinute = (byte) (efficiency / duringTheTime);
        short productivity20Minute = (short) (productivityMinute * 20);
        short productivityDay = (short) (productivityMinute * 60 * 24);
        int productivity3Day = productivityDay * 3;
        int productivityMonth = productivityDay * 30;
        System.out.println("За 20 минут машина произвела " + productivity20Minute + " штук бутылок");
        System.out.println("За 1 день машина произвела " + productivityDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + productivity3Day + " штук бутылок");
        System.out.println("За месяц машина произвела " + productivityMonth + " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte totalPaint = 120;
        byte whitePaintClass = 2;
        byte brownPaintClass = 4;
        byte totalPainClass = (byte) (whitePaintClass + brownPaintClass);
        byte totalClass = (byte) (totalPaint / totalPainClass);
        byte totalWhitePaint = (byte) (whitePaintClass * totalClass);
        byte totalBrownPaint = (byte) (brownPaintClass * totalClass);
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhitePaint + " банок белой краски и "  + totalBrownPaint + " банок коричневой краски");

    }
    public static void task6() {
        System.out.println("Задача 6");
        byte banans = 5;
        byte weightBanan = 80;
        short milk = 200;
        byte weightMilk100 = 105;
        byte icecream = 2;
        byte weightIcecream = 100;
        byte egg = 4;
        byte weightEgg = 70;
        float weightBreakfast = (banans * weightBanan) + (milk / 100 * weightMilk100) + (icecream * weightIcecream) + (egg * weightEgg);
        System.out.println("Вес завтра спортсмена составляет " + weightBreakfast + " грамм");
        float weightBreakfast2 = weightBreakfast / 1000;
        System.out.println("Вес завтра спортсмена составляет " + weightBreakfast2 + " киллограмм");
    }
    public static void task7() {
        System.out.println("Задача 7");
        short minWeight = 250;
        short maxWeight = 500;
        byte  totalWeightKg = 7;
        short totalWeightGr = (short) (totalWeightKg * 1000);
        float averageWeight = (minWeight + maxWeight) / 2;
        short minWeightDays = (short) (totalWeightGr / minWeight);
        short maxWeightDays = (short) (totalWeightGr / maxWeight);
        float averageWeightDays = totalWeightGr / averageWeight;
        System.out.println("При похудении на 250 грамм в день потребуется " + minWeightDays + " дней");
        System.out.println("При похудении на 500 грамм в день потребуется " + maxWeightDays + " дней");
        System.out.println("В среднем потребуется " + averageWeightDays + " дней");
    }
    public static void task8() {
        System.out.println("Задача 8");
        float salaryMashy = 67760f;
        float salaryDenisa = 83690f;
        float salaryKristiny = 76230f;
        float increasedSalaryMashy = (float) (salaryMashy * 1.1);
        float increasedSalaryDenisa = (float) (salaryDenisa * 1.1);
        float increasedSalaryKristiny = (float) (salaryKristiny * 1.1);
        float annualIncomeMashy = (increasedSalaryMashy - salaryMashy) * 12;
        float annualIncomeDenisa = (increasedSalaryDenisa - salaryDenisa) * 12;
        float annualIncomeKristyiny = (increasedSalaryKristiny - salaryKristiny) * 12;
        System.out.println("Маша теперь получает " + increasedSalaryMashy + " рублей. Годовой доход вырос на " + annualIncomeMashy + " рублей");
        System.out.println("Денис теперь получает " + increasedSalaryDenisa + " рублей. Годовой доход вырос на " + annualIncomeDenisa + " рублей");
        System.out.println("Кристина теперь получает " + increasedSalaryKristiny + " рублей. Годовой доход вырос на " + annualIncomeKristyiny + " рублей");
    }
}