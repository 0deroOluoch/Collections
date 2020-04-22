package com.appnetics;

public class Main {

    public static void main(String[] args) {
	Theatre theatre = new Theatre("Old something",8,12);
	//theatre.getSeats();
	if(theatre.reserveSeat("H11")){
        System.out.println("Please pay for your seat to complete reservation");
    }else {
        System.out.println("Sorry, this seat is taken");
    }
        if(theatre.reserveSeat("H11")){
            System.out.println("Please pay for your seat to complete reservation");
        }else {
            System.out.println("Sorry, this seat is taken");
        }


    }
}
