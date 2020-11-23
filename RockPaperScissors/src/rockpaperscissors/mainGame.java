package rockpaperscissors;

import java.util.Scanner;

/**
 *
 * @author Bomber
 */
public class mainGame {

    public static void main(String[] args) {
        char decide;
        do {
            Player Champion = new Player();
            Player Challenger = new Player();
            Scanner sc = new Scanner(System.in);

            System.out.print("Set champion name : ");
            String championName = sc.nextLine();
            Champion.setName(championName);

            System.out.print("Set challenger name : ");
            String challengerName = sc.nextLine();
            Challenger.setName(challengerName);

            while (true) {
                System.out.println("--------------------------------------------");
                System.out.println("0 - Rock");
                System.out.println("1 - Paper");
                System.out.println("2 - Scissors");
                System.out.println("--------------------------------------------");
                System.out.print(Champion.getName() + " please enter choice 0-2 : ");
                int optionChampion = sc.nextInt();

                System.out.println("\n \n \n \n \n \n \n \n \n");

                System.out.println("--------------------------------------------");
                System.out.println("0 - Rock");
                System.out.println("1 - Paper");
                System.out.println("2 - Scissors");
                System.out.println("--------------------------------------------");
                System.out.print(Challenger.getName() + " please enter choice 0-2 : ");
                int optionChallenger = sc.nextInt();

                Champion.useOption(optionChampion, optionChallenger, Challenger); //player class useOption
//                Challenger.useOption(optionChallenger, Champion);
                if (Challenger.getCurrentChance() <= 0) {
                    System.out.println();
                    System.out.println(Champion);
                    System.out.println(Challenger);
                    System.out.println();
                    System.out.println("---------------------- [ " + Champion.getName() + " WIN ]");
                    System.out.println("");
                    break;

                } 
                else if (Champion.getCurrentChance() <= 0) {
                    System.out.println();
                    System.out.println(Champion);
                    System.out.println(Challenger);
                    System.out.println();
                    System.out.println("---------------------- [ " + Challenger.getName() + " WIN ]");
                    System.out.println("");
                    break;

                }
                else {
                    System.out.println();
                    System.out.println(Champion);
                    System.out.println(Challenger);
                    System.out.println();
                }

            }
            System.out.print("Try again? (y/n) : ");
            decide = sc.next().charAt(0);
            System.out.println();

        } while (decide == 'y' || decide == 'Y');
    }
}
