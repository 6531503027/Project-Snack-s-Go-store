package Project;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Main {
	private static String name1;
    private static double wallet1 = 0;
    private static double wallet2 = 0;
    
    public static void setName1(String name1) {
        Main.name1 = name1;
    }

    public static void main(String[] args) {
        System.out.println("===============================");
        System.out.println("|Welcome to Snack's Go Store|");
        System.out.println("===============================");
        System.out.println("|1.Register/Login|");
        System.out.println("|2.Exit|");
        Scanner Login = new Scanner(System.in);
        System.out.print("Please select your service:  ");
        int login = Login.nextInt();

        switch (login) {
            case 1:
                System.out.print("Please choose 1 or 2 people : "); ///Input people
                Scanner keyboard = new Scanner(System.in);
                int oneortwo = keyboard.nextInt();///Read people

                switch (oneortwo) {
                    case 1:
                        User1(); ///  User 
                        break;
                    case 2:
                        TwoUser();/// TwoUser
                        break;
                    default:
                        //////ผิดเงื่อนไขขึ้นตามนี้///
                        System.out.println("***Please re-select the preferred choice***");
                        break;
                }
                break;
            case 2:
                System.out.println("Thank you for choosing Snack's Go Store, bye bye.");
                break;
            default:
                System.out.println("Please enter the specified number.");
                break;
        }


        
    }

    public static void User1() {

        Scanner Name = new Scanner(System.in);
        System.out.println("Enter username : ");
        String name = Name.nextLine();
 
    

        Scanner Cre = new Scanner(System.in);  
        System.out.println("Please deposit required credit (Min credit 100 $) : "); //Input Credit
        Double credit = Cre.nextDouble();
    
        if (credit <= 39) {
            System.out.println("Please make a new credit deposit");
        }
    
        else if (credit>=40){

        System.out.printf("|Welcome %s Your credit is %.2f $|\n", name, credit);
        
        System.out.println("=================================");
        System.out.println("Boat noodles");
        System.out.println("Item 1 Boat noodles Normal  : 40.0 $");
        System.out.println("Item 2 Boat noodles Special : 50.0 $");
        System.out.println("Item 3 Boat noodles Jumbo   : 60.0 $");
        System.out.println("=================================");
        System.out.println("Side dishes");
        System.out.println("Item 4 Pork caps  : 10.0 $");
        System.out.println("Item 5 Pork rinds : 15.0 $");
        System.out.println("=================================");
        System.out.println("Water");
        System.out.println("Item 6 Iced tea   : 20.0 $");
        System.out.println("Item 7 Okra       : 20.0 $");
        System.out.println("Item 8 Pepsi      : 15.0 $");
        System.out.println("Item 9 Water      : 10.0 $");
        System.out.println("=================================");

        Scanner Ans = new Scanner(System.in);
        System.out.print("Selected Products : ");
        int ans = Ans.nextInt();
        if (ans < 1)
        {
            ///ถ้าน้อยกว่า1 ไม่สามารถไปต่อได้
            System.out.println("Please enter the product number that we have specified");
        }
        else if (ans == 1)
        {
            double money = credit, pay1 = 40.0;
            
            System.out.println("|Your credit :" +credit+  "Bath|");
    
            money = - pay1;
            if (credit < pay1)////ถ้าไม่เข้าเงื่อนไขจะขึ้นคำด้านล่าง
            {
                System.out.println("Please make a new transaction (Because your balance is not enough)");
            }
            else if (credit >= pay1)
            {
                System.out.println("|Boat noodles Normal : 40.0 $|");
                System.out.println("|Your balance = " +(credit-pay1)+" Bath|");///โชว์ยอดที่เหลือ
                System.out.println("**************************");
            }
        }
        else if (ans == 2)
        {
            double money = credit, pay2 = 50.0;
            
            System.out.println("|Your credit :" +credit+  "Bath|");
    
            money = - pay2;
            if (credit < pay2)////ถ้าไม่เข้าเงื่อนไขจะขึ้นคำด้านล่าง
            {
                System.out.println("Please make a new transaction (Because your balance is not enough)");
            }
            else if (credit >= pay2)
            {
                System.out.println("|Boat noodles Special : 50.0 $|");
                System.out.println("|Your balance = " +(credit-pay2)+" Bath|");///โชว์ยอดที่เหลือ
                System.out.println("**************************");
            }
        }
        else if (ans == 3)
        {
            double money = credit, pay3 = 60.0;
            
            System.out.println("|Your credit :" +credit+  "Bath|");
    
            money = - pay3;
            if (credit < pay3)////ถ้าไม่เข้าเงื่อนไขจะขึ้นคำด้านล่าง
            {
                System.out.println("Please make a new transaction (Because your balance is not enough)");
            }
            else if (credit >= pay3)
            {
                System.out.println("|Boat noodles Jumbo : 60.0 $|");
                System.out.println("|Your balance = " +(credit-pay3)+" Bath|");///โชว์ยอดที่เหลือ
                System.out.println("**************************");
            }
        }
        else if (ans == 4)
        {
            double money = credit, pay4 = 10.0;
            
            System.out.println("|Your credit :" +credit+  "Bath|");
    
            money = - pay4;
            if (credit < pay4)////ถ้าไม่เข้าเงื่อนไขจะขึ้นคำด้านล่าง
            {
                System.out.println("Please make a new transaction (Because your balance is not enough)");
            }
            else if (credit >= pay4)
            {
                System.out.println("|Pork caps : 10.0 $|");
                System.out.println("|Your balance = " +(credit-pay4)+" Bath|");///โชว์ยอดที่เหลือ
                System.out.println("**************************");
            }
        }
        else if (ans == 5)
        {
            double money = credit, pay5 = 15.0;
            
            System.out.println("|Your credit :" +credit+  "Bath|");
    
            money = - pay5;
            if (credit < pay5)////ถ้าไม่เข้าเงื่อนไขจะขึ้นคำด้านล่าง
            {
                System.out.println("Please make a new transaction (Because your balance is not enough)");
            }
            else if (credit >= pay5)
            {
                System.out.println("|Pork rinds : 15.0 $|");
                System.out.println("|Your balance = " +(credit-pay5)+" Bath|");///โชว์ยอดที่เหลือ
                System.out.println("**************************");
            }
        }
        else if (ans == 6)
        {
            double money = credit, pay6 = 20.0;
            
            System.out.println("|Your credit :" +credit+  "Bath|");
    
            money = - pay6;
            if (credit < pay6)////ถ้าไม่เข้าเงื่อนไขจะขึ้นคำด้านล่าง
            {
                System.out.println("Please make a new transaction (Because your balance is not enough)");
            }
            else if (credit >= pay6)
            {
                System.out.println("|Iced tea : 20.0 $|");
                System.out.println("|Your balance = " +(credit-pay6)+" Bath|");///โชว์ยอดที่เหลือ
                System.out.println("**************************");
            }
        }
        else if (ans == 7)
        {
            double money = credit, pay7 = 20.0;
            
            System.out.println("|Your credit :" +credit+  "Bath|");
    
            money = - pay7;
            if (credit < pay7)////ถ้าไม่เข้าเงื่อนไขจะขึ้นคำด้านล่าง
            {
                System.out.println("Please make a new transaction (Because your balance is not enough)");
            }
            else if (credit >= pay7)
            {
                System.out.println("|Okra : 20.0 $|");
                System.out.println("|Your balance = " +(credit-pay7)+" Bath|");///โชว์ยอดที่เหลือ
                System.out.println("**************************");
            }
        }
        else if (ans == 8)
        {
            double money = credit, pay8 = 15.0;
            
            System.out.println("|Your credit :" +credit+  "Bath|");
    
            money = - pay8;
            if (credit < pay8)////ถ้าไม่เข้าเงื่อนไขจะขึ้นคำด้านล่าง
            {
                System.out.println("Please make a new transaction (Because your balance is not enough)");
            }
            else if (credit >= pay8)
            {
                System.out.println("|Pepsi : 15.0 $|");
                System.out.println("|Your balance = " +(credit-pay8)+" Bath|");///โชว์ยอดที่เหลือ
                System.out.println("**************************");
            }
        }
        else if (ans == 9)
        {
            double money = credit, pay9 = 10.0;
            
            System.out.println("|Your credit :" +credit+  "Bath|");
    
            money = - pay9;
            if (credit < pay9)////ถ้าไม่เข้าเงื่อนไขจะขึ้นคำด้านล่าง
            {
                System.out.println("Please make a new transaction (Because your balance is not enough)");
            }
            else if (credit >= pay9)
            {
                System.out.println("|Water : 10.0 $|");
                System.out.println("|Your balance = " +(credit-pay9)+" Bath|");///โชว์ยอดที่เหลือ
                System.out.println("**************************");
            }
        }
    }

}

        public static void TwoUser() {
            try{
            Scanner Name = new Scanner(System.in);

            System.out.println("1.Enter first username : "); //Input name
            setName1(Name.nextLine());

            System.out.println("2.Enter second username : "); //Input name
            String name2 = Name.nextLine(); //Read name
            }catch(InputMismatchException ex){
                System.out.println("Exception occurred: "+ex); 
            }
            //Credit สำหรับซื้อของทางร้าน////
            Scanner Cre = new Scanner(System.in);
            System.out.println("Please deposit required credit (Min credit 100 $) : "); //Input Credit
            Double credit = Cre.nextDouble(); //Read Credit
          
			if (credit <= 100) {
                System.out.println("Please make a new credit deposit");
			}
			// ตั้งค่ายอดเงินกระเป๋าเงินเริ่มต้น
			 int wallet = credit.intValue();

			 System.out.println("=================================");
		        System.out.println("Boat noodles");
		        System.out.println("=================================");
		        System.out.println("Item 1 Boat noodles Normal  : 40.0 $");
		        System.out.println("Item 2 Boat noodles Special : 50.0 $");
		        System.out.println("Item 3 Boat noodles Jumbo   : 60.0 $");
		        System.out.println("=================================");
		        System.out.println("Side dishes");
		        System.out.println("Item 4 Pork caps  : 10.0 $");
		        System.out.println("Item 5 Pork rinds : 15.0 $");
		        System.out.println("=================================");
		        System.out.println("Water");
		        System.out.println("Item 6 Iced tea   : 20.0 $");
		        System.out.println("Item 7 Okra       : 20.0 $");
		        System.out.println("Item 8 Pepsi      : 15.0 $");
		        System.out.println("Item 9 Water      : 10.0 $");
		        System.out.println("=================================");
         
		        Scanner Ans = new Scanner(System.in);
		        int[] ans = new int[2];
		        System.out.println("Selected Products 1 : ");
		        ans[0] = Ans.nextInt();

		        System.out.println("Selected Products 2 : ");
		        ans[1] = Ans.nextInt();
       
		        // Calculate the total cost of the selected items
		        double totalCost = 0;
		        for (int i = 0; i < ans.length; i++) {
		            if (ans[i] < 1 || ans[i] > 9) {
		                System.out.println("Please enter a valid product number");
		                return;
		            } else if (ans[i] == 1) {
		                totalCost += 40.0;
		            } else if (ans[i] == 2) {
		                totalCost += 50.0;
		            } else if (ans[i] == 3) {
		                totalCost += 60.0;
		            } else if (ans[i] == 4) {
		                totalCost += 10.0;
		            } else if (ans[i] == 5) {
		                totalCost += 15.0;
		            } else if (ans[i] == 6) {
		                totalCost += 20.0;
		            } else if (ans[i] == 7) {
		                totalCost += 20.0;
		            } else if (ans[i] == 8) {
		                totalCost += 15.0;
		            } else if (ans[i] == 9) {
		                totalCost += 10.0;
		            }
		        }
		        if (wallet < totalCost) {
		            System.out.println("Not enough balance");
		            return;
		        }

		        // Calculate the remaining balance
		        double remainingBalance = wallet - totalCost;

		        // Display the order summary
		        System.out.println("===========================");
		        System.out.println("Order Summary");
		        System.out.println("===========================");
		        System.out.println("Selected Items: ");
		        for (int i = 0; i < ans.length; i++) {
		            if (ans[i] == 1) {
		                System.out.println("Boat noodles Normal");
		            } else if (ans[i] == 2) {
		                System.out.println("Boat noodles Special");
		            } else if (ans[i] == 3) {
		                System.out.println("Boat noodles Jumbo");
		            } else if (ans[i] == 4) {
		                System.out.println("Pork caps");
		            } else if (ans[i] == 5) {
		                System.out.println("Pork rinds");
		            } else if (ans[i] == 6) {
		                System.out.println("Iced tea");
		            } else if (ans[i] == 7) {
		                System.out.println("Okra");
		            } else if (ans[i] == 8) {
		                System.out.println("Pepsi");
		            } else if (ans[i] == 9) {
		                System.out.println("Water");
		            }
		        }
		        System.out.println("===========================");
		        System.out.println("Total Cost: " + totalCost + " $");
		        System.out.println("Remaining Balance: " + remainingBalance + " $");
            }
        }

        
            

