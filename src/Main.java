public class Main {
    public static void main(String[] args) {


//        //zadacha 1
        int clientOS = 0;
        switch (clientOS){
            case 1:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 0:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("error");
        }

        //zadacha 2
        int clientDeviceYear = 2000;


        if(clientDeviceYear>= 2015 && clientOS ==0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if(clientDeviceYear>= 2015 && clientOS==1){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear <2015 && clientOS ==0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

//        //zadacha 3
        int year = 2024;
        if(year % 4 ==0 && year % 100 !=0 && year %400 !=0  ){
            System.out.println(year + " год является високосным");
                    }
        else{
            System.out.println(year  +" год не является високосным");
        }


        //zadacha 4
        int distance = 62;

        if (distance <= 20){
            System.out.println("Потребуется дней: 1 сутки " );
        }
        else if (distance <=60 ){
            System.out.println("Потребуется дней: 2 суток");
        }
        else if (distance<=100){
            System.out.println("Потребуется дней: 3 суток");
        }
        else {
            System.out.println("Доставки нет");
        }


        //zadacha 5
        int monthNumber = 9;
        switch (monthNumber){
            case 12,1,2:
                System.out.println("Зима");
                break;
            case 3,4,5 :
                System.out.println("Весна");
                break;
            case 6,7,8:
                System.out.println("Лето");
                break;
            case 9,10,11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Error");


        }








    }
}