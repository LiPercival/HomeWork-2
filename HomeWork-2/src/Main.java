public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        short bananas = 200;
        System.out.println("Бананов" + bananas + "KG");
        float sugar = 3;
        float onePortion = sugar/4;
        System.out.println("Одна порция сахара весит" + onePortion + "KG");
        byte a = 1;
        short b = 1;
        int c = 1;
        int d = a + b + c;
        System.out.println(d);

        float g = a + 1f;
        System.out.println(g);

        byte  testOne= 10;
        short testTwo = 150;
        int testThree = 310;
        long testFour = 500;
        float testFive = 3.4F;
        double testSix = 10.4;
        System.out.println("Значение переменной a c типом byte равно"+ testOne);
        System.out.println("Значение переменной a c типом short равно"+ testTwo);
        System.out.println("Значение переменной a c типом int равно"+ testThree);
        System.out.println("Значение переменной a c типом long равно"+ testFour);
        System.out.println("Значение переменной a c типом float равно"+ testFive);
        System.out.println("Значение переменной a c типом double равно"+ testSix);

        double Number1 = 27.12;
        long Number2= 987678965549L;
        float Number3= 2.786F;
        short Number4 = 569;
        short Number5 = -159;
        short Number6 = 27897;
        byte Number7 = 67;
        System.out.println(Number1);
        System.out.println(Number2);
        System.out.println(Number3);
        System.out.println(Number4);
        System.out.println(Number5);
        System.out.println(Number6);
        System.out.println(Number7);
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        short papers = 480;
        int pupil =class1+class2+class3;
        int needPaper = papers / pupil;
        System.out.println(class1+ "учеников имеет Людмила Павловна");
        System.out.println(class2+ "учеников имеет Анна Сергеевна");
        System.out.println(class3+ "учеников имеет Екатерина Андреевна");
        System.out.println(pupil + "Всего учеников в 3 классах");
        System.out.println(papers+"Всего бумаги");
        System.out.println("На каждого ученика рассчитано" + needPaper + "листов бумаги");

        byte bottles = 16;
        byte minutes = 2;
        int oneMinuts = bottles/minutes;
        System.out.println(bottles+ "За 2 минуты");
        System.out.println(minutes+"минуты");
        System.out.println(oneMinuts+ "бутылок за 1 минуту");
        byte twentyMinuts = 20;
        short oneDay = 1440;
        short threeDay = 4320;
        int oneMounth = 44640;
        System.out.println(twentyMinuts + "минут");
        System.out.println(oneDay + "минут");
        System.out.println(threeDay + "минут");
        System.out.println(oneMounth + "минут");
        int test1 = twentyMinuts * oneMinuts;
        int test2 = oneDay * oneMinuts;
        int test3 = threeDay * oneMinuts;
        int test4 = oneMounth * oneMinuts;
        System.out.println("За 20 минут машина произвела " + test1 + " штук бутылок");
        System.out.println("За 1 день машина произвела "+ test2 + " штук бутылок");
        System.out.println("За 3 суток машмна произвела " + test3 + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + test4 + " штук бутылок");

        byte schoolRepair = 120;
        byte repairWhite = 2;
        byte repairBrown = 4;
        int kraski = repairBrown + repairWhite;
        int qtyClass = schoolRepair/kraski;
        int whiteQty = qtyClass/repairWhite;
        int brownQty = qtyClass/repairBrown;
        System.out.println( schoolRepair +" Столько банок краски купили");
        System.out.println("Нужно " + repairWhite +  " банки белой краски");
        System.out.println("Нужно "+repairBrown+" банки коричневый краски");
        System.out.println("Всего банок краски "+ kraski);
        System.out.println("Всего классов для покраски "+ qtyClass );
        System.out.println("В школе,где " +qtyClass + " классов нужно "+ whiteQty + " банок белой краски и " +brownQty + " банок коричневый краски" );
        short banana = 5*80;
        short milk = 105*2;
        short iceCream = 2*100;
        short eggs = 4*70;
        int allGr = banana + milk + iceCream + eggs ;
        double kg = (short) 1000.0;
        double qtyKg = allGr/kg;
        System.out.println("В 5 бананах " + banana + " грамм");
        System.out.println("В 200 граммах молока "+milk+"грамм ");
        System.out.println("В 2 брикетах мороженого "+iceCream+" грамм");
        System.out.println("В 4 сырых яйцах "+eggs+" грамм");
        System.out.println("Всего грамм в этом блюде" + allGr);
        System.out.println("Всего грамм в одном килограмме "+ kg);
        System.out.println("Кол-во КГ "+ qtyKg);

        byte weightKG = 7;
        double weightGr =7*kg;
        double weight =1000.0;
        double day250 = weightGr/250;
        double day500 = weightGr/500;
        System.out.println("В одном килограмме " +weight+" грамм");
        System.out.println("Требуемый вес для сброса "+weightGr+ " грамм");
        System.out.println("Требуемый вес для сброса "+weightKG+" килограмм");
        System.out.println("В случае потери 250 грам в день ,потребуется "+day250+ " дней" );
        System.out.println("В случае потери 500 грам в день ,потребуется "+day500+ " дней");

        int salaryMashaMounth = 67760;
        int salaryDenisMounth = 83690;
        int salaryKristinaMounth = 76230;
        byte oneYear = 12;
        System.out.println("Зарплаты Маши в месяц "+salaryMashaMounth+" рублей");
        System.out.println("Зарплата Дениса в месяц "+salaryDenisMounth+" рублей");
        System.out.println("Зарплата Кристины в месяц "+salaryKristinaMounth+" рублей");
        System.out.println(oneYear+" месяцев в году");
        int salaryMashaYear =salaryMashaMounth*oneYear ;
        int salaryDenisYear =salaryDenisMounth *oneYear ;
        int salaryKristinaYear =salaryKristinaMounth *oneYear ;
        System.out.println("Зарплаты Маши в год "+salaryMashaYear+" рублей");
        System.out.println("Зарплаты Дениса в год "+salaryDenisYear+" рублей");
        System.out.println("Зарплаты Кристина в год "+salaryKristinaYear+" рублей");
        double salaryMashaMounthUp = salaryMashaMounth+ salaryMashaMounth*10/100;
        double salaryDenisMounthUp = salaryDenisMounth+ salaryDenisMounth*10/100;
        double salaryKristinaMounthUp = salaryKristinaMounth+ salaryKristinaMounth*10/100;
        System.out.println("Зарплаты Маши в месяц c повышением "+salaryMashaMounthUp+" рублей");
        System.out.println("Зарплата Дениса в месяц с повышением "+salaryDenisMounthUp+" рублей");
        System.out.println("Зарплата Кристины в месяц с повышением "+salaryKristinaMounthUp+" рублей");
        double salaryMashaYearUp =salaryMashaMounthUp *oneYear;
        double salaryDenisYearUp =salaryDenisMounthUp *oneYear;
        double salaryKristinaYearUp=salaryKristinaMounthUp *oneYear;
        System.out.println("Зарплата Маши в год с повышением "+salaryMashaYearUp+" рублей");
        System.out.println("Зарплата Дениса в год с повышением "+salaryDenisYearUp+" рублей");
        System.out.println("Зарплата Кристины в год с повышением "+salaryKristinaYearUp+" рублей");
        double differenceMasha = salaryMashaYearUp-salaryMashaYear;
        double differenceDenis = salaryDenisYearUp-salaryDenisYear;
        double differenceKristina = salaryKristinaYearUp-salaryKristinaYear;
        System.out.println("Маша теперь получает "+salaryMashaMounthUp+" рублей.Годовой доход вырос на "+differenceMasha+" рублей");
        System.out.println("Денис теперь получает "+salaryDenisMounthUp+" рублей.Годовой доход вырос на "+differenceDenis+" рублей");
        System.out.println("Кристина теперь получает "+salaryKristinaMounthUp+" рублей.Годовой доход вырос на "+differenceKristina+" рублей");
    }
}