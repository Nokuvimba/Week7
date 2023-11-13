package ie.atu;

import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args){
        int num=1;

        while(num!=0) {
            try {
                System.out.println("Please enter a number between 0-9:");
                Scanner myscan = new Scanner(System.in);
                String input = myscan.nextLine();
                int myNum = Integer.parseInt(input);

                if (myNum >= 0 && myNum <= 9) {
                    System.out.println("You entered " + myNum);
                    num=0;
                } else {
                    System.out.println("Not a valid number");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter  a valid number between 0-9.");

            }
        }
    }
}
