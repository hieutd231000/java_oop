package com.company;

public class secondDegree {
    private int a;
    private int b;
    private int c;
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
    public void setC(int c) {
        this.c = c;
    }
    public int getC() {
        return c;
    }
    public String result(){
        if(a==0){
            if(b==0){
                if(c==0)
                    return "Phuong trinh vo so nghiem";
                else return "Phuong trinh vo nghiem";
            }
            else return "Phuong trinh co nghiem duy nhat la: " + (double) -c/b;
        }
        else{
            if(b*b-4*a*c>0)
                return "Phuong trinh co 2 nghiem la: " + (double) (-b+Math.sqrt(b*b-4*a*c))/(2*a) + "va " + (double) (-b-Math.sqrt(b*b-4*a*c))/(2*a);
            else if(b*b-4*a*c==0)
                return "Phuong trinh co nghiem duy nhat la: " + (double) -b/(2*a);
            else
                return "Phuong trinh vo nghiem";
        }
    }
}
