package com.company;

public class FirstDegree {
    private int a;
    private int b;
    public void setA(int a){
        this.a = a;
    }
    public int getA() {
        return a;
    }
    public void setB(int b){
        this.b = b;
    }
    public int getB() {
        return b;
    }
    public String result(){
        if(a==0){
            if(b==0)
                return "Phuong trinh vo so nghiem";
            else return "Phuong trinh vo nghiem";
        }
        else return "Phuong trinh co nghiem la: " + (double) -b/a;
    }
}
