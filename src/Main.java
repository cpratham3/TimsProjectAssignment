//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        TimsItems[] itemlist = new TimsItems[100];
//        int orderCounter = 0;
//        int choice =0;
//        double total_price=0;
//        boolean cond=true;
//        Scanner sc = new Scanner(System.in);
//
//        while(cond) {
//            System.out.println("1. Tims Merchandise \n2. Tims Consumables \n3. Done Ordering, proceed to checkout");
//
//            choice = sc.nextInt();
//            switch (choice){
//                case 1:
//                    System.out.println("1. Mug \n2. Coffee Powder \n3. Gift Card \n4. Hockey Cards");
//                    choice = sc.nextInt();
//                    switch (choice){
//                        case 1:
//                            Mugs mug = new Mugs();
//                            System.out.println("MUG\nPrice : "+ mug.getPrice()+ "Features : " + mug.getFeatures() + " \n\n1.Add to Cart\n2.Continue with other products" );
//                            choice = sc.nextInt();
//                            if(choice==1){
//                                itemlist[orderCounter++]=mug;
//                                total_price+=mug.getPrice();
//                            }
//                            break;
//                        case 2:
//                            CoffeePowder cp = new CoffeePowder();
//                            System.out.println("COFFEE POWDER\nPrice :"+ cp.getPrice()+ "Features: " + cp.getFeatures() + " \n\n1.Add to Cart\n2.Continue with other products" );
//                            choice = sc.nextInt();
//                            if(choice==1){
//                                itemlist[orderCounter++]=cp;
//                                total_price+=cp.getPrice();
//                            }
//                            break;
//                        case 3:
//                            GiftCards gc=new GiftCards();
//                            System.out.println("GIFT CARDS \nPrice :"+ gc.getPrice()+ "Features: " + gc.getFeatures() + " \n\n1.Add to Cart\n2.Continue with other products" );
//                            choice = sc.nextInt();
//                            if(choice==1){
//                                itemlist[orderCounter++]=gc;
//                                total_price+=gc.getPrice();
//                            }
//                            break;
//                        case 4:
//                            HockeyCards hc=new HockeyCards();
//                            System.out.println("HOCKEY CARDS \nPrice :"+ hc.getPrice()+ "Features: " + hc.getFeatures() + " \n\n1.Add to Cart\n2.Continue with other products" );
//                            choice = sc.nextInt();
//                            if(choice==1){
//                                itemlist[orderCounter++]=hc;
//                                total_price+=hc.getPrice();
//                            }
//                            break;
//                        default:
//                            System.out.println("Please try again. only enter 1 or 2");
//                    }
//
//                    break;
//
//                case 2:
//                    System.out.println("1. Bagel \n2. Coffee\n3. Donut \n4. Wrap\n5. Sandwich");
//                    choice = sc.nextInt();
//                    switch (choice){
//                        case 1:
//                            Bagel bagel = new Bagel();
//                            System.out.println("BAGEL\nPrice :"+ bagel.getPrice()+ "Calories :" + bagel.getCalories() + " \n\n1.Add to Cart\n2.Continue with other products" );
//                            choice = sc.nextInt();
//                            if(choice==1){
//                                itemlist[orderCounter++]=bagel;
//                                total_price+=bagel.getPrice();
//                            }
//                            break;
//                        case 2:
//                            Coffee coffee = new Coffee();
//                            System.out.println("COFFEE\nPrice :"+ coffee.getPrice()+ "Calories :" + coffee.getCalories() + " \n\n1.Add to Cart\n2.Continue with other products" );
//                            choice = sc.nextInt();
//                            if(choice==1){
//                                itemlist[orderCounter++]=coffee;
//                                total_price+=coffee.getPrice();
//                            }
//                            break;
//                        case 3:
//                            Donut donut = new Donut();
//                            System.out.println("DONUT\nPrice :"+ donut.getPrice()+ "Calories :" + donut.getCalories() + " \n\n1.Add to Cart\n2.Continue with other products" );
//                            choice = sc.nextInt();
//                            if(choice==1){
//                                itemlist[orderCounter++]=donut;
//                                total_price+=donut.getPrice();
//                            }
//                            break;
//                        case 4:
//                            Wrap wrap = new Wrap();
//                            System.out.println("WRAP \nPrice :"+ wrap.getPrice()+ "Calories :" + wrap.getCalories() + " \n\n1.Add to Cart\n2.Continue with other products" );
//                            choice = sc.nextInt();
//                            if(choice==1){
//                                itemlist[orderCounter++]=wrap;
//                                total_price+=wrap.getPrice();
//                            }
//                            break;
//                        case 5:
//                            Sandwich sandwich = new Sandwich();
//                            System.out.println("SANDWICH \nPrice :"+ sandwich.getPrice()+ "Calories :" + sandwich.getCalories() + " \n\n1.Add to Cart\n2.Continue with other products" );
//                            choice = sc.nextInt();
//                            if(choice==1){
//                                itemlist[orderCounter++]=sandwich;
//                                total_price+=sandwich.getPrice();
//                            }
//                            break;
//                        default:
//                            System.out.println("Please try again. only enter 1 to 5");
//                            break;
//                    }
//
////                    break;
//                case 3:
//                    System.out.println("*******************Order Summary*************************");
//                    for (int i = 0; i < orderCounter; i++) {
//                        System.out.println(itemlist[i]);
//                    }
//                    System.out.println("Your Total amount due: "+total_price);
//                    System.out.println("Thank You!");
//                    cond=false;
//                    break;
//                default:
//                    System.out.println("Wrong entry,please try again");
//            }
//        }
//
//    }
//}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TimsItems[] itemlist = new TimsItems[100];
        int orderCounter = 0;
        int choice =0;
        String option;
        double total_price=0;
        boolean cond=true;
        int moneyinwallet = 10;
        final long walletAccessNumber = 12345678;
        long userWalletInput = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO TIM HORTONS PLEASE SELECT FROM THE MENU");

        while(cond) {
            System.out.println("1. Tims Merchandise \n2. Tims Consumables \n3. View Cart\n4. Checkout");

            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("1. Mug \n2. Coffee Powder \n3. Gift Card \n4. Hockey Cards");
                    choice = sc.nextInt();
                    switch (choice){
                        case 1:
                            Mugs mug = new Mugs();
                            System.out.println("MUG\nPrice : "+ mug.getPrice()+ " Features : " + mug.getFeatures() + " \n\n1.Add to Cart\n2.Continue with other products" );
                            choice = sc.nextInt();
                            if(choice==1){
                                itemlist[orderCounter++]=mug;
                                total_price+=mug.getPrice();
                            }
                            break;
                        case 2:
                            CoffeePowder cp = new CoffeePowder();

                            System.out.println("COFFEE POWDER\nPrice :"+ cp.getPrice()+ " Features: " + cp.getFeatures() + " \n\n1.Add to Cart\n2.Continue with other products" );
                            choice = sc.nextInt();
                            if(choice==1){
                                itemlist[orderCounter++]=cp;
                                total_price+=cp.getPrice();
                            }
                            break;
                        case 3:
                            GiftCards gc=new GiftCards();
                            System.out.println("GIFT CARDS \nPrice :"+ gc.getPrice()+ " Features: " + gc.getFeatures() + " \n\n1.Add to Cart\n2.Continue with other products" );
                            choice = sc.nextInt();
                            if(choice==1){
                                itemlist[orderCounter++]=gc;
                                total_price+=gc.getPrice();
                            }
                            break;
                        case 4:
                            HockeyCards hc=new HockeyCards();
                            System.out.println("HOCKEY CARDS \nPrice :"+ hc.getPrice()+ " Features: " + hc.getFeatures() + " \n\n1.Add to Cart\n2.Continue with other products" );
                            choice = sc.nextInt();
                            if(choice==1){
                                itemlist[orderCounter++]=hc;
                                total_price+=hc.getPrice();
                            }
                            break;
                        default:
                            System.out.println("Please try again. only enter 1 or 2");
                    }

                    break;

                case 2:
                    System.out.println("1. Bagel \n2. Coffee\n3. Donut \n4. Wrap\n5. Sandwich");
                    choice = sc.nextInt();
                    switch (choice){
                        case 1:
                            Bagel bagel = new Bagel();
                            System.out.println("BAGEL\nPrice :"+ bagel.getPrice()+ "Calories :" + bagel.getCalories() + " \n\n1.Add to Cart\n2.Continue with other products" );
                            choice = sc.nextInt();
                            if(choice==1){
                                itemlist[orderCounter++]=bagel;
                                total_price+=bagel.getPrice();
                            }
                            break;
                        case 2:
                            Coffee coffee = new Coffee();
                            System.out.println("COFFEE\nPrice :"+ coffee.getPrice()+ "Calories :" + coffee.getCalories() + " \n\n1.Add to Cart\n2.Continue with other products" );
                            choice = sc.nextInt();
                            if(choice==1){
                                itemlist[orderCounter++]=coffee;
                                total_price+=coffee.getPrice();
                            }
                            break;
                        case 3:
                            Donut donut = new Donut();
                            System.out.println("DONUT\nPrice :"+ donut.getPrice()+ "Calories :" + donut.getCalories() + " \n\n1.Add to Cart\n2.Continue with other products" );
                            choice = sc.nextInt();
                            if(choice==1){
                                itemlist[orderCounter++]=donut;
                                total_price+=donut.getPrice();
                            }
                            break;
                        case 4:
                            Wrap wrap = new Wrap();
                            System.out.println("WRAP \nPrice :"+ wrap.getPrice()+ "Calories :" + wrap.getCalories() + " \n\n1.Add to Cart\n2.Continue with other products" );
                            choice = sc.nextInt();
                            if(choice==1){
                                itemlist[orderCounter++]=wrap;
                                total_price+=wrap.getPrice();
                            }
                            break;
                        case 5:
                            Sandwich sandwich = new Sandwich();
                            System.out.println("SANDWICH \nPrice :"+ sandwich.getPrice()+ "Calories :" + sandwich.getCalories() + " \n\n1.Add to Cart\n2.Continue with other products" );
                            choice = sc.nextInt();
                            if(choice==1){
                                itemlist[orderCounter++]=sandwich;
                                total_price+=sandwich.getPrice();
                            }
                            break;
                        default:
                            System.out.println("Please try again. only enter 1 to 5");
                            break;
                    }

//                    break;
                case 3:
                    System.out.println("*******************Cart Details***************************");
                    for (int i = 0; i < orderCounter; i++) {
                        System.out.println(itemlist[i]);
                    }
                    System.out.println("Your Total amount due: "+total_price);
                    System.out.println("**********************************************************");
                    break;
                case 4:
                    System.out.println("*******************Order Summary*************************");
                    System.out.println("Your Order total: "+total_price);
                    System.out.println("Please Input 1 to use your wallet otherwise 2 to autopay");
                    choice = sc.nextInt();
                    if(choice==1){
                        System.out.println("Enter the Wallet Access number");
                        userWalletInput = sc.nextLong();
                        if(userWalletInput==walletAccessNumber){
                            System.out.println("Current Balance :"+ moneyinwallet);
                            System.out.println("Amount Due :"+ total_price);
                            System.out.println(" Please press 1 to pay using wallet money");
                            choice = sc.nextInt();
                            if(choice==1 && moneyinwallet-total_price>0){
                                moneyinwallet= (int) (moneyinwallet-total_price);
                                System.out.println("TRANSACTION SUCCESSFUL, new wallet balance :"+moneyinwallet);
                                System.out.println("Amount paid: "+total_price);
                                System.out.println("Thank You for ordering!");
                                System.out.println("**********************************************************");
                            }
                            else if(moneyinwallet-total_price<0) {
                                System.out.println("Insufficient funds, Order cancelled");
                            }
                            else {
                                System.out.println("Input invalid,Order cancelled");
                            }
                        }
                        else{
                            System.out.println("WRONG ACCESS NUMBER,Order Cancelled");
                        }
                        }
                    else if(choice==2){
                        System.out.println("Thank You AUTOPAYMENT");
                        System.out.println("Amount paid: "+total_price);
                        System.out.println("Thank You for ordering!");
                        System.out.println("**********************************************************");
                        cond=false;

                    }

//                    System.out.println("Amount paid: "+total_price);
//                    System.out.println("Thank You for ordering!");
//                    System.out.println("**********************************************************");
                    cond=false;
                    break;

                default:
                    System.out.println("Wrong entry,please try again");
            }
        }

    }
}