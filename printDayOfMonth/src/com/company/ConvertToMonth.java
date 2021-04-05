package com.company;

import java.util.Locale;

public class ConvertToMonth {
    private String month;
    public ConvertToMonth(String month){
        this.month = month.toLowerCase();
    }
    public int covertMonth(){
        if(this.month.contains("jan"))
            return 1;
        if(this.month.contains("feb"))
            return 2;
        if(this.month.contains("mar"))
            return 3;
        if(this.month.contains("apr"))
            return 4;
        if(this.month.contains("may"))
            return 5;
        if(this.month.contains("jun"))
            return 6;
        if(this.month.contains("jul"))
            return 7;
        if(this.month.contains("aug"))
            return 8;
        if(this.month.contains("sep"))
            return 9;
        if(this.month.contains("oct"))
            return 10;
        if(this.month.contains("nov"))
            return 11;
        if(this.month.contains("dec"))
            return 12;
        return -1;
    }
}
