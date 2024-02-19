package Project.Bank.braindata.bankmanagement.client;

import Project.Bank.braindata.bankmanagement.service.Rbi;
import Project.Bank.braindata.bankmanagement.serviceImpl.Sbi;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String args[]) throws IOException {
        Rbi bank = new Sbi();

        Scanner sc = new Scanner(System.in);
        while(true){

            System.out.println("\n- Welcome to the Bank -");
            System.out.println("Press 1: Create Account"+
                    "\nPress 2: Display All Data"+
                    "\nPress 3: Deposit Money"+
                    "\nPress 4: Withdrawal Money"+
                    "\nPress 5: Check Balance"+
                    "\nPress 6: Update data"+
                    "\nPress 0: Exit"+
                    "\n- Please Enter your choice -");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    bank.createAccount();
                    break;
                case 2:
                    bank.displayAllDetails();
                    break;
                case 3:
                    bank.depositMoney();
                    break;
                case 4:
                    bank.withdrawal();
                    break;
                case 5:
                    bank.balanceCheck();
                    break;
                case 6:
                    bank.updateData();
                    break;
                case 0:
                    System.out.println("****** Thank you ******");
                    return;
                default:
                    System.out.println("Enter Valid Input");
            }

        }

    }


}
