package com.company;

public class SortedArray {
    private int[] myArray;
    public SortedArray(int[] myArray){
        this.myArray = myArray;
    }
    public int[] sortArray(int[] myArray){
        for(int i=0; i<myArray.length; i++){
            for(int j=i+1; j< myArray.length;j++){
                if(myArray[i]>myArray[j]){
                    int move = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = move;
                }
            }
        }
        return myArray;
    }
}
