package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter number of tickets:");
        int firstticket = scanner.nextInt();

        System.out.print("How many round-trip tickets:");
        int seconedticket = scanner.nextInt();

        Ticket ticketmoney = new Ticket(firstticket,seconedticket);

        System.out.println("Total tickets:" + ticketmoney.ticket);
        System.out.println("Round-trip:"+ ticketmoney.twoticket);
        System.out.println("Total:"+ ticketmoney.paymoney());
    }
}
