public class Main {

    public static void main(String[] args) {
        String str = ("ЗАДАЧА4");
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("скачайте приложение для IOS по ссылке...");
        } else if (clientOS == 0) {
            System.out.println("скачайте приложение для ANDROID по ссылке...");
        }
        System.out.println("Задание2");
        int clientDeviceYear = 2016;
        if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear > 2015) {
            System.out.println("установите приложение");
        }
        System.out.println("ЗАДАЧА 3");
        int year = 2026;
        if (year % 4 == 0 & year % 100 != 0 || (year % 400 == 0)) {
            System.out.println(year + "год высокостный");
        } else {
            System.out.println(year + "год не высокостный");
        }
//ЗАДАЧА№4
        System.out.println("ЗАДАЧА 4");
        int distance = 150;
        int deliveryDays = 0;
        if (distance < 20) {
            deliveryDays = 1;

        } else if (distance < 60) {
            deliveryDays = 2;
        }else if (distance<100){
            deliveryDays=3;
        }if (distance>100){
            System.out.println("доставки нет");
        }else
        {
            System.out.println("Доставка займет" + deliveryDays);


        }
        System.out.println("Задача 5");
        char  monthNumber=12;
        switch (monthNumber ){
            case 1:
                System.out.println("январь");
                break;
            case  2:
                System.out.println("февраль");
                break;
                case  3:
                    System.out.println("vмарт");
                    break;
            case 4:
                System.out.println("апрель");
            case 5:
                System.out.println("май");
                break;
            case 6:
                System.out.println("июнь");
                break;
            case 7:
                System.out.println("июль");
                break;
            case 8:
                System.out.println("август");
                break;
            case 9:
                System.out.println("cсентябрь");
                break;
            case 10:
                System.out.println("октябрь");
                break;
            case 11:
                System.out.println("ноябрь");
                break;
            case 12:
                System.out.println("декабрь");

        }
    }
}