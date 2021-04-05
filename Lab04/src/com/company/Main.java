package com.company;

public class Main {

    public static void main(String[] args) {
        if(Order.checkLimitOrder()){
            MyDate mydate = new MyDate(23,3,2000);
            Order anOrder = new Order(mydate);
            DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
            anOrder.addDigitalVideoDisc(dvd1);

            DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War","Science Fiction","Geogre Lucas",124,24.95f);
            anOrder.addDigitalVideoDisc(dvd2);

            DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin","Animation","John Musker",90,18.99f);
            anOrder.addDigitalVideoDisc(dvd3);

            anOrder.removeDigitaVideoDisc(dvd3);

            DigitalVideoDisc myDvd[] = new DigitalVideoDisc[2];
            myDvd[0] = new DigitalVideoDisc("The King","Animation","Roger Allers",87,19.95f);
            myDvd[1] = new DigitalVideoDisc("The Fast King","Animation","Roger Allers",87,19.95f);
            anOrder.addDigitalVideoDisc(myDvd);

            DigitalVideoDisc dvd4 = new DigitalVideoDisc("My Song","Science Fiction","Geogre Lucas",124,24.95f);
            DigitalVideoDisc dvd5 = new DigitalVideoDisc("Her Song","Science Fiction","Geogre Lucas",124,24.95f);
            anOrder.addDigitalVideoDisc(dvd4,dvd5);
            anOrder.removeDigitaVideoDisc(dvd4);

//        System.out.println("Total cost is: " + anOrder.totalCost());
            anOrder.viewOrder();
        }
//        Test day
        MyDate myDate1 = new MyDate(13,8,1999);
        MyDate myDate2 = new MyDate(24,2,1999);
        MyDate myDate3 = new MyDate(4,2,1998);
        MyDate myDate4 = new MyDate(31,12,2000);
        MyDate myDate5 = new MyDate(1,12,2000);
        MyDate arr[] = new MyDate[5];
        arr[0] = myDate1;
        arr[1] = myDate2;
        arr[2] = myDate3;
        arr[3] = myDate4;
        arr[4] = myDate4;
        //myDate1.yourChoice();
        //System.out.println(DateUtils.compareDate(myDate1,myDate2));
        DateUtils.sortDate(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].convertDay());
        }
    }
}
