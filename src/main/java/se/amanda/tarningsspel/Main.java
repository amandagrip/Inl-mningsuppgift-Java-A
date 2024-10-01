package se.amanda.tarningsspel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Spelare 1 namn: ");
        String player1Name = scanner.nextLine();
        Player1 player1 = new Player1(player1Name);

        System.out.println("Spelare 2 namn: ");
        String player2Name = scanner.nextLine();
        Player2 player2 = new Player2(player2Name);

        System.out.println(player1.getName() + " kastar: " );
        player1.dice();

        System.out.println(player2.getName() + " kastar: " );
        player2.dice();

        System.out.println("Resultat: ");
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " vinner med: " + player1.getScore() + " poäng!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getName() + " vinner med: " + player2.getScore());
        } else{
            System.out.println("Det är oavgjort.");
        }

        scanner.close();

    }

}




