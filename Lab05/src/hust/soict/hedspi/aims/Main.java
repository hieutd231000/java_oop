package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;
import hust.soict.hedspi.aims.utils.MyDate;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        MyDate mydate = new MyDate(23,3,2000);
        Order anOrder = new Order(mydate);
        if(Order.checkLimitOrder()){

            DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
            anOrder.addDigitalVideoDisc(dvd1);

            DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War","Science Fiction","Geogre Lucas",124,24.95f);
            anOrder.addDigitalVideoDisc(dvd2);

            DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin","Animation","John Musker",90,18.99f);
            anOrder.addDigitalVideoDisc(dvd3);

            anOrder.removeDigitaVideoDisc(dvd3);

            DigitalVideoDisc myDvd[] = new DigitalVideoDisc[2];
            myDvd[0] = new DigitalVideoDisc("The King","Animation","Roger Allers",87,9.95f);
            myDvd[1] = new DigitalVideoDisc("The Fast King","Animation","Roger Allers",87,29.95f);
            anOrder.addDigitalVideoDisc(myDvd);

            DigitalVideoDisc dvd4 = new DigitalVideoDisc("My Song","Science Fiction","Geogre Lucas",124,24.95f);
            DigitalVideoDisc dvd5 = new DigitalVideoDisc("Her Song","Science Fiction","Geogre Lucas",124,24.95f);
            anOrder.addDigitalVideoDisc(dvd4,dvd5);
            anOrder.removeDigitaVideoDisc(dvd4);
            //get lucky item
            anOrder.getLuckyItem();
            anOrder.viewOrder();
        }
        //search item
        System.out.println("\nSearch item: ");
        String itemSearch = scanner.nextLine();
        int size = anOrder.qtyOrdered();
        for(int i=0; i<size; i++){
            if(anOrder.getItemOrdered()[i].search(itemSearch)){
                System.out.println(anOrder.getItemOrdered()[i].toString());
            }
        }
        //DateTest.main(args);
    }
    public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        String oldTilte = dvd1.getTitle();
        String oldDirector = dvd1.getDirector();
        dvd1.setTitle(dvd2.getTitle());
        dvd1.setDirector(dvd2.getDirector());
        dvd2.setTitle(oldTilte);
        dvd2.setDirector(oldDirector);
    }
}
