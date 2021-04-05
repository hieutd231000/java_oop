package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        DayInMonth days;
        do{
            System.out.println("Input year and month: ");
            int year = scanner.nextInt();
            scanner.nextLine();
            String srcMon = scanner.nextLine();
            //xu ly month
            int month;
            if(isNumeric(srcMon)){
                month = Integer.parseInt(srcMon); // month la integer
            }else{
                ConvertToMonth months = new ConvertToMonth(srcMon); // month la string
                month = months.covertMonth();
            }
            days = new DayInMonth(month,year);
        }while(!days.isValid());
	    days.dayInMonth();
    }
    private static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
