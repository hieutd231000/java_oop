package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int count = scanner.nextInt();
        int[] myArray = getIntegers(count);
        printArray(sortIntegers(myArray));
    }
    private static int[] getIntegers(int num){
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[num];
        for(int i=0 ; i<num; i++){
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }
    private static void printArray(int[] myArray){
        for(int i=0 ; i< myArray.length; i++){
            System.out.println("Element " + i + " contents " + myArray[i]);
        }
    }
    private static int[] sortIntegers(int[] myArray){
        for(int i=0 ; i<myArray.length; i++){
            for(int j=i+1; j<myArray.length; j++){
                if(myArray[i]<myArray[j]){
                    int move = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = move;
                }
            }
        }
        return myArray;
    }
}
