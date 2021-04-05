package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        getSum();
    }
    public static void getSum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter countNumber:");
        int number = scanner.nextInt();
        int sum = 0;
        for(int i=0; i<number; i++){
            System.out.println("Enter number #"+(i+1)+":");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int x = scanner.nextInt();
                sum += x;
            }else{
                break;
            }
            scanner.nextLine();
        }
        System.out.println(sum);
        scanner.close();
    }
}
