package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static final int wateravailable = 400;
    static final int milkavailable = 540;
    static final int cupsavailable = 9;
    static final int beansavailable = 120;
    static final int costavailable = 550;


    public static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int exit;
        int remainingwater = wateravailable;
        int remainingmilk = milkavailable;
        int remainingbeans = beansavailable;
        int remainingcups = cupsavailable;
        int remainingmoney = costavailable;

        remaining rem = new remaining(remainingwater,remainingbeans,remainingcups,remainingmilk,remainingmoney);
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String action = scanner.nextLine();
            exit = doaction(action,rem);
        } while (exit != 0);


        //intro();
        //availableresources();


    }

//    public static void availableresources() {
//        System.out.println("The coffee machine has :");
//        System.out.println(+wateravailable + " ml of water");
//        System.out.println(+milkavailable + " ml of milk");
//        System.out.println(+beansavailable + " g of coffee beans");
//        System.out.println(+cupsavailable + " disposable cups");
//        System.out.println("$" + costavailable + " of money\n");
//    }

    public static int doaction(String action, remaining rem) {

//        String action="";
//        while(action!="exit"){
//            //System.out.println(action);
//            System.out.println("Write action (buy, fill, take, remaining, exit): ");
//            action = scanner.nextLine();
        System.out.println();
        switch (action) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:, back - to main menu");
                String coffeetype = scanner.nextLine();
                int reqwater = 0, reqbeans = 0, reqmilk = 0, cost = 0;


                switch (coffeetype) {
                    case "1":
                        reqwater = 250;
                        reqbeans = 16;
                        cost = 4;
                        break;

                    case "2":
                        reqwater = 350;
                        reqbeans = 20;
                        reqmilk = 75;
                        cost = 7;
                        break;

                    case "3":
                        reqwater = 200;
                        reqmilk = 100;
                        reqbeans = 12;
                        cost = 6;
                        break;

                    case "back":
                        return 1;

                }
                if (rem.getRemainingwater() < reqwater) System.out.println("Sorry,not enough water!\n");
                else if(rem.getRemainingbeans() < reqbeans)System.out.println("Sorry, not enough beans!\n");
                else if(rem.getRemainingmilk() < reqmilk)System.out.println("Sorry, not enough milk");
                else if(rem.getRemainingcups() < 0) System.out.println("Sorry not enough cups");

                else {
                    System.out.println("I have enough resources, making you a coffee !");
                    rem.setRemainingwater(rem.remainingwater - reqwater);
                    rem.setRemainingbeans(rem.remainingbeans - reqbeans);
                    rem.setRemainingmilk(rem.remainingmilk - reqmilk);
                    rem.setRemainingcups(rem.remainingcups - 1);
                    rem.setRemainingmoney(rem.remainingmoney + cost);
                }


                break;
            case "fill":
                System.out.println("Write how many ml of water you want to add:");
                int waterreq = scanner.nextInt();
                System.out.println("Write how many ml of milk you want to add:");
                int milkreq = scanner.nextInt();
                System.out.println("Write how many grams of coffee beans you want to add:");
                int beansreq = scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee you want to add:");
                int disposablecups = scanner.nextInt();
                rem.setRemainingwater(Math.abs(rem.remainingwater + waterreq));
                rem.setRemainingbeans(Math.abs(rem.remainingbeans + beansreq));
                rem.setRemainingmilk(Math.abs(rem.remainingmilk + milkreq));
                rem.setRemainingcups(rem.remainingcups + disposablecups);
                break;

            case "take":
                System.out.println("I gave you $"+rem.getRemainingmoney());
                rem.setRemainingmoney(0);
                break;

            case "remaining":
                remainingresources(rem.getRemainingwater(),rem.getRemainingmilk(),rem.getRemainingbeans(), rem.getRemainingcups(),rem.getRemainingmoney());
                break;

            case "exit":
                return 0;
        }

        return 1;
    }


    public static void remainingresources(int remainingwater, int remainingmilk, int remainingbeans, int remainingcups, int remainingmoney) {

        System.out.println("The coffee machine has:");
        System.out.println(+remainingwater + " ml of water");
        System.out.println(+remainingmilk + " ml of milk");
        System.out.println(+remainingbeans + " g of coffee beans");
        System.out.println(+remainingcups + " disposable cups");
        System.out.println("$"+remainingmoney + " of money");
        System.out.println();

    }
}


