public class Main {
    public static void main(String[] args) {
        System.out.println("Переменные_Часть2!");

        //Задача 1
        System.out.println("Задача 1");
        byte apple = 23;
        System.out.println("Значение переменной byte с типом apple равно " + apple);
        short oranges = 15;
        System.out.println("Значение переменной short с типом oranges равно " + oranges);
        int tangerines = 50;
        System.out.println("Значение переменной int с типом tangerines равно " + tangerines);
        long seeds = 100000L;
        System.out.println("Значение переменной long с типом seeds равно " + seeds);
        float meat = 13.50F;
        System.out.println("Значение переменной float с типом meat равно " + meat);
        double sugar = 98;
        System.out.println("Значение переменной double с типом sugar равно " + sugar);


        //Задача 2
        System.out.println("Задача 2");
        float a = (float) 27.12;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        double c =  2.786;
        System.out.println(c);
        boolean d = false;
        System.out.println(d);
        int e = 569;
        System.out.println(e);
        short f = -159;
        System.out.println(f);
        short i = 27897;
        System.out.println(i);
        byte g = 67;
        System.out.println(g);


        //Задача 3
        System.out.println("Задача 3");
        int teacher1 = 23;
        System.out.println(teacher1 + " Ученика в классе у Людмилы Павловны");
        int teacher2 = 27;
        System.out.println(teacher2 + " Учеников в класса у Анны Сергеевны");
        int teacher3 = 30;
        System.out.println(teacher3 + " Учеников в классе Екатерины Андреевны");
        int allClass = teacher1 + teacher2 + teacher3;
        System.out.println("Всего " + allClass + " учеников на три класса");
        short paper = 480;
        System.out.println(paper + " Листов бумаги закупили на три класса");
        int teacherPaper = paper / allClass;
        System.out.println("Всего " + teacherPaper + " Листов достанется каждому ученику");


        //Задача 4
        System.out.println("Задача 4");
        byte bottle = 16;
        System.out.println("Произведено " + bottle + " бутылок за 2 минуты");
        short bottle20 = 16 * 10;
        System.out.println("Произведено " + bottle20 + " бутылок за 20 минут");
        short bottleDay = 16 * 720;
        System.out.println("Произведено " + bottleDay + " бутылок в сутки");
        int bottleDay3 = 16 * 2160;
        System.out.println("Произведено " + bottleDay3 + " бутылок за 3 дня");
        int bottleMonth = 16 * 21600;
        System.out.println("Произведено " + bottleMonth + " бутылок за месяц");


        //Задача 5
        System.out.println("Задача 5");
        byte schoolColor = 120;
        System.out.println("На ремонт школы нужно " + schoolColor + " банок краски двух цветов");
        byte whiteColor = 2;
        byte brownColor = 4;
        System.out.println("На один класс уходит " + whiteColor + " банки белой краски и " + brownColor + " банки коричневой краски");
        int twoColor = whiteColor + brownColor;
        System.out.println("Всего " + twoColor + " банок краски уходит на один класс");
        int classColors = schoolColor / twoColor;
        int whiteColorsClass = classColors * whiteColor;
        int brownColorsClass = classColors * brownColor;
        System.out.println("В школе, где " + classColors + " классов, нужно " + whiteColorsClass + " банок белой краски и " + brownColorsClass + " банок коричневой краски");


        //Задача 6
        System.out.println("Задача 6");
        short bananas = 5;
        System.out.println("Бананы " + bananas + " шт.");
        short grmBananas = 80;
        System.out.println(grmBananas + " грамм один банан");
        short milk = 200;
        System.out.println("Молоко " + milk + " мл.");
        short grmMilk = 210;
        System.out.println(grmMilk + " молока в граммах");
        short iceCream = 100;
        System.out.println(iceCream + " грамм мороженое пломбир");
        int iceCream2 = 2;
        System.out.println(iceCream2 + " брикета мороженного по " + iceCream + " грамм");
        int egg = 4;
        System.out.println("Яйца сырые " + egg + " шт.");
        int grmEgg = 70;
        System.out.println("Одно яйцо весит " + grmEgg + " гр.");
        double allProduct = (bananas * grmBananas) + grmMilk + (iceCream * iceCream2) + (egg * grmEgg);
        System.out.println("Смешиваем все в блендоре и получаем " + allProduct + " гр.");
        double allProductKg = 1000;
        System.out.println(allProduct / allProductKg + " получаемый вес в кг.");


        //Задача 7
        System.out.println("Задача 7");
        byte weight = 7;
        System.out.println("нашему спортсмену нужно похудеть на " + weight + " кг.");
        int grmWeight = weight * 1000;
        System.out.println("Перевод 7кг в " + grmWeight + " грамм");
        int weight250 = 250;
        System.out.println(weight250);
        int weight500 = 500;
        System.out.println(weight500);
        int lostWeight250 = grmWeight / weight250;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то уйдет у него на похудение " + lostWeight250 + " дней");
        int lostWeight500 = grmWeight / weight500;
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, то уйдет у него на похудение " + lostWeight500 + " дней");
        int meanDay = (28 + 14) / 2;
        System.out.println("В среднем может потребоватся " + meanDay + " день, чтобы добиться результата похудения.");


        //Задача 8
        System.out.println("Задача 8");
        short interest = 10;
        System.out.println("Каждый год повышение составляет " + interest + " % от текущей зарплаты");
        int manMaria = 67760;
        System.out.println("Маша получает " + manMaria + " рублей в месяц");
        int manDenis = 83690;
        System.out.println("Денис получает " + manDenis + " рублей в месяц");
        int manKristina = 76230;
        System.out.println("Кристина получает " + manKristina + " рублей в месяц");
        int interestMonth1 = (manMaria * interest) / 100;
        System.out.println(interestMonth1 + " рублей, годовая у Марии");
        int interestMonth2 = (manDenis * interest) / 100;
        System.out.println(interestMonth2 + " рублей, годовая у Дениса");
        int interestMonth3 = (manMaria * interest) / 100;
        System.out.println(interestMonth3 + " рублей, годовая у Кристины");
        int fullMaria = manMaria + interestMonth1;
        System.out.println("Маша теперь получает " + fullMaria + " рублей. Годовой доход вырос на " + interestMonth1 + " рублей");
        int fullDenis = manDenis + interestMonth2;
        System.out.println("Денис теперь получает " + fullDenis + " рублей. Годовой доход вырос на " + interestMonth2 + " рублей");
        int fullKristina = manKristina + interestMonth3;
        System.out.println("Кристина теперь получает " + fullKristina + " рублей. Годовой доход вырос на " + interestMonth3 + " рублей");


        //Доп.Задания(УРОК 2. ПЕРЕМЕННЫЕ - задача 6)
        System.out.println("Доп.Задания(УРОК 2. ПЕРЕМЕННЫЕ - задача 6");
        int a1 = 12;
        int b1 = 27;
        int c1 = 44;
        int d1 = 15;
        int e1 = 9;
        int result = a1*(b1+(c1-d1*e1));
        System.out.println("Результат " + result);
        int result1 = -1 * result;
        System.out.println("Положительный результат " + result1);
        int result2 = -1 * result1;
        System.out.println("Отрицательный результат " + result2);


        //Доп.Задания(УРОК 2. ПЕРЕМЕННЫЕ - задача 7)
        System.out.println("Доп.Задания(УРОК 2. ПЕРЕМЕННЫЕ - задача 6");
        int a2 = 5;
        int b2 = 7;
        System.out.println(a2);
        System.out.println(b2);
        int tmp1 = a2;
        int aFinal = b2;
        int bFinal = tmp1;
        System.out.println(aFinal);
        System.out.println(bFinal);


        //Доп.Задания(УРОК 2. ПЕРЕМЕННЫЕ - задача 8)
        System.out.println("Доп.Задания(УРОК 2. ПЕРЕМЕННЫЕ - задача 8)");


    }
}