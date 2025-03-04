package purchase;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        System.out.println("Hello!");

        String userCurrency = "$";
        int costOfApple = 2; 
        int defAmount = 6;          

        try ( Scanner sc = new Scanner(System.in);) {

            System.out.println("do you want to purchase 6 apples? Y/n");

            String answer = sc.nextLine();
            
            if(answer.equals("n") || answer.equals("N")){

                System.err.println("input amount of apple to purchase");

                int amount= sc.nextInt();
                

                System.out.println("Thank you! The cost will be: " + amount * costOfApple + " " + userCurrency);

            }else{

                System.out.println("Thank you! The cost will be: " + defAmount * costOfApple + " " + userCurrency);
                
            }

        } 

    }

}

