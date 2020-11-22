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

            System.out.println("Set champion name : ");
            String playerName1 = sc.nextLine();
            Champion.setName(playerName1);

            System.out.println("Set challenger name : ");
            String playerName2 = sc.nextLine();
            Champion.setName(playerName2);

            while (true) {
                System.out.println(Champion.getName() + "please enter choice 0-2 : ");
                int skillp1 = sc.nextInt();
                if (skillp1 == 2) {
                    System.out.println(Champion.getName() + "use" + Champion.skill(skillp1));
                    Champion.heal();
                    System.out.println();
                    System.out.println(Champion);
                    System.out.println(Challenger);
                    System.out.println();
                } else {
                    Champion.useSkill(skillP1, Challenger);
                    if (Challenger.getCurrentChance() <= 0) {
                        System.out.println();
                        System.out.println(Champion);
                        System.out.println(Challenger);
                        System.out.println();
                        System.out.println(Champion.getName() + "WIN");
                        System.out.println("");
                        break;

                    } else {
                        System.out.println();
                        System.out.println(Champion);
                        System.out.println(Challenger);
                        System.out.println();
                    }

                }
            }
            System.out.println("Try again? (y/n) : ");
            decide = sc.next().charAt(0);
            System.out.println();

        } while (decide == 'y' || decide == 'Y');
    }
}    
