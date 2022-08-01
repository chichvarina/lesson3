public class Main {
    public static void main(String[] args) {
        //Задание 1
        byte pen = 2;
        short pensil = 1500;
        int cat = 20;
        long river = 3800l;
        float volumeOfMilk = 3.5f;
        double sizesMikrob = 0.000000008;
        boolean catIsOld = cat>3;

        System.out.println("кошка взрослая "+ catIsOld);
        char n = 37;

        System.out.println("n="+n);

        //задание 2
        double boxer1=78.2;
        double boxer2=82.7;
        double summBoxsers=boxer1+boxer2;
        double difBoxsers=boxer2-boxer1;
        System.out.println("Общий вес боксеров составляет "+summBoxsers
                +" кг. Разница в весе боксеров составляет "+difBoxsers+" кг ");

        //задание 3
        float bananas = 5*80f;
        float milk = 2*105f;
        float iceCream = 2*100f;
        float eggs = 4*70f;
        float result = bananas + milk + iceCream + eggs;
        float resultKg = result/1000f;
        System.out.println("Спорт-завтрак составил " +resultKg+" кг. ");

        //задание 4
        int a= 7000/250;
        int b= 7000/500;
        int c= (a+b)/2;

        System.out.println("При снижении рациона на 250 гр. спортсмену понадобится " +a +" дней. ");
        System.out.println("При снижении рациона на 500 гр. спортсмену понадобится " +b +" дней. ");
        System.out.println("В среднем спортсмену понадобится " +c +" день. ");

        //Задание 5
        float mashaMonth = 67760f;
        float mashaMonthNew = mashaMonth + 0.1f*mashaMonth;
        float mashaYear = mashaMonth*12f;
        float mashaYearNew = mashaMonthNew*12f;
        float mashaDif= mashaYearNew - mashaYear;
        System.out.println("Маша теперь получает "+mashaMonthNew+ " рублей. Годовой доход вырос на " +mashaDif+ " рублей.");

        float denisMonth = 83690f;
        float denisMonthNew = denisMonth + 0.1f*denisMonth;
        float denisYear = denisMonth*12f;
        float denisYearNew = denisMonthNew*12f;
        float denisDif= denisYearNew - denisYear;
        System.out.println("Денис теперь получает "+denisMonthNew+ " рублей. Годовой доход вырос на " +denisDif+ " рублей.");

        float kristinaMonth = 76230f;
        float kristinaMonthNew = kristinaMonth + 0.1f*kristinaMonth;
        float kristinaYear = kristinaMonth*12f;
        float kristinaYearNew = kristinaMonthNew*12f;
        float kristinaDif= kristinaYearNew - kristinaYear;
        System.out.println("Кристина теперь получает "+kristinaMonthNew+ " рублей. Годовой доход вырос на " +kristinaDif+ " рублей.");


    }
}