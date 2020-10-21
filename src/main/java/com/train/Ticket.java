package com.train;

public class Ticket {
    int ticket;
    int twoticket;
    public Ticket(int ticket,int twoticket){
        this.twoticket=twoticket;
        this.ticket=ticket;
    }

    public int paymoney() {
        int oneticket;
        int money;
        oneticket = ticket - twoticket;
        money = (oneticket*1000)+((twoticket*2000*9)/10);
        return money;
    }
}
