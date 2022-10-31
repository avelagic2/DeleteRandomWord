package hr.unizg.fer.oop;


import java.util.Scanner;

public class DeleteRandomWord {
    public static void main(String[] args) {
        // ucitavamo tekst
        Scanner sc = new Scanner(System.in);
        System.out.println("Ucitajte recenicu teksta: ");
        String tekst = sc.nextLine();

        // dijelimo tekst na rijeci
        String[] rijeci = tekst.split(" ");

        // ispis rijeci
        System.out.println("Ucitane rijeci");
        for (int i = 0; i < rijeci.length; i++) {
            System.out.println(rijeci[i] + ", ");
        }

        // random izbacivanje neke rijeci
        int izbaci = (int) (Math.random() * rijeci.length);
        System.out.println("\nIzbacujem rijec: " + rijeci[izbaci]);

        // stvaranje novog teksta bez izbacene rijeci
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rijeci.length; i++) {
            if (i != izbaci) sb.append(rijeci[i] + " ");
        }

        // ispis novog teksta
        System.out.println("Novi tekst : " + sb.toString());
    }
}