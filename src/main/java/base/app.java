package base;

import java.util.Calendar;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class app {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("What is your current age?");
        String input0 = in.nextLine();
        int num0 = Integer.parseInt(input0);

        System.out.print("At what age would you like to retire?");
        String input1 = in.nextLine();
        int num1 = Integer.parseInt(input1);

        int yeardiff = num1-num0;

        int currentyear =  Calendar.getInstance().get(Calendar.YEAR);

        int finalyear = currentyear + yeardiff;



      System.out.println("You have " + yeardiff + " years until you can retire.");
        System.out.print("It's " + currentyear + ", so you can retire in " + finalyear + ".");










    }
}
