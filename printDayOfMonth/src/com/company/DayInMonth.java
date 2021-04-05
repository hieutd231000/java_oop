package com.company;

public class DayInMonth {
    private int month;
    private int year;
    public DayInMonth(int month, int year){
        this.month = month;
        this.year = year;
    }
    public void dayInMonth(){
        switch (this.month){
            case 1:
                System.out.println("Month " + this.month + " in year "+ this.year + " has 31 days");
                break;
            case 2:
                if(isYear()){
                    System.out.println("Month " + this.month + " in year "+ this.year + " has 29 days");
                }else System.out.println("Month " + this.month + " in year "+ this.year + " has 28 days");
                break;
            case 3:
                System.out.println("Month " + this.month + " in year "+ this.year + " has 31 days");
                break;
            case 4:
                System.out.println("Month " + this.month + " in year "+ this.year + " has 30 days");
                break;
            case 5:
                System.out.println("Month " + this.month + " in year "+ this.year + " has 31 days");
                break;
            case 6:
                System.out.println("Month " + this.month + " in year "+ this.year + " has 30 days");
                break;
            case 7:
                System.out.println("Month " + this.month + " in year "+ this.year + " has 31 days");
                break;
            case 8:
                System.out.println("Month " + this.month + " in year "+ this.year + " has 31 days");
                break;
            case 9:
                System.out.println("Month " + this.month + " in year "+ this.year + " has 30 days");
                break;
            case 10:
                System.out.println("Month " + this.month + " in year "+ this.year + " has 31 days");
                break;
            case 11:
                System.out.println("Month " + this.month + " in year "+ this.year + " has 30 days");
                break;
            case 12:
                System.out.println("Month " + this.month + " in year "+ this.year + " has 31 days");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
    public boolean isValid(){
        return (month>=1 && month<=12) &&(year>=1950 && year<=2050);
    }
    private boolean isYear(){
        return (year %400==0)||(year%100 !=0 && year%4==0);
    }
}
