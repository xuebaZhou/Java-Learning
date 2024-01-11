package com.study.python;

public class Date {
    private int day, month, year;

    Date(int i, int j, int k) {
        day = i;
        month = j;
        year = k;
    }

    Date() {
        day = 1;
        month = 1;
        year = 1998;
    }

    Date(Date d) {
        day = d.day;
        month = d.month;
        year = d.year;
    }

    public void printDate() {
        System.out.println(day + "/" + month + "/" + year);
    }

    public Date tomorrow() {
        Date d = new Date(this);
        d.day++;
        if (d.day > d.daysInMonth()) {
            d.day = 1;
            d.month++;
            if (d.month > 12) {
                d.month = 1;
                d.year++;
            }
        }
        return d;
    }

    public int daysInMonth() {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 30;
            default:
                if (year % 100 != 0 && year % 4 == 0) {
                    return 29;
                } else return 28;
        }
    }

    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println("The current date is(dd/mm/yy):");
        d1.printDate();
        System.out.println();
        System.out.print("Its tomorrow is(dd/mm/yy):");
        d1.tomorrow().printDate();
        System.out.println();

        Date d2 = new Date(28, 3, 1964);
        System.out.println("The current date is(dd/mm/yy):");
        d2.printDate();
        System.out.println();
        System.out.print("Its tomorrow is(dd/mm/yy):");
        d2.tomorrow().printDate();
        System.out.println();
    }
}









