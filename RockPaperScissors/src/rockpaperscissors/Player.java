package rockpaperscissors;

/**
 *
 * @author Bomber
 */
public class Player {

    private final int Chance = 3;
    private int currentChance;
    private String name;

    public Player() {
        this.currentChance = Chance;
    }

    public void setName(String name) {
        if (name.isBlank()) {
            this.name = "Unknown player";
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public int getChance() {
        return Chance;
    }

    public int getCurrentChance() {
        return currentChance;
    }

    public void useOption(int choiceChampion, int choiceChallenger, Player anotherPlayer) {
        if (choiceChampion < 0 || choiceChampion > 2 || choiceChallenger < 0 || choiceChallenger > 2) {
            throw new Error("PLEASE ENTER INDEX 0 TO 2");
        } else {
            switch (choiceChampion) {
                case 0 -> { // 0 is Rock
                    System.out.print(this.getName() + " use " + Option.values()[0]);
                    System.out.println();
                    if (choiceChallenger == 2) { // 2 is Scissors
                        anotherPlayer.currentChance = anotherPlayer.getCurrentChance() - 1; //win
                        System.out.println(anotherPlayer.getName() + " use " + Option.values()[2]);
                    } else if (choiceChallenger == 1) { // 1 is Paper
                        currentChance = getCurrentChance() - 1; //lose
                        System.out.println(anotherPlayer.getName() + " use " + Option.values()[1]);
                    }
                    checkDmg(anotherPlayer);
                    break;
                }
                case 1 -> { // 1 is Paper
                    System.out.print(this.getName() + " use " + Option.values()[1]);
                    System.out.println();
                    if (choiceChallenger == 0) { // 0 is Rock
                        anotherPlayer.currentChance = anotherPlayer.getCurrentChance() - 1; //win
                        System.out.println(anotherPlayer.getName() + " use " + Option.values()[0]);
                    } else if (choiceChallenger == 2) { // 2 is Scissors
                        currentChance = getCurrentChance() - 1; //lose
                        System.out.println(anotherPlayer.getName() + " use " + Option.values()[2]);
                    }
                    checkDmg(anotherPlayer);
                    break;
                }
                case 2 -> { // 2 is Scissors
                    System.out.print(this.getName() + " use " + Option.values()[2]);
                    System.out.println();
                    if (choiceChallenger == 1) { // 1 is Paper
                        anotherPlayer.currentChance = anotherPlayer.getCurrentChance() - 1; //win
                        System.out.println(anotherPlayer.getName() + " use " + Option.values()[1]);
                    } else if (choiceChallenger == 0) { // 0 is Rock
                        currentChance = getCurrentChance() - 1; //lose
                        System.out.println(anotherPlayer.getName() + " use " + Option.values()[0]);
                    }
                    checkDmg(anotherPlayer);

                    break;
                }
            }
        }
    }

    private void checkDmg(Player player) {
        if (player.getCurrentChance() <= 0) {
            player.currentChance = 0;
            System.out.println("---------------------- [ " + player.getName() + " LOSE ]");
        }

    }

    public String option(int choice) {
        return Option.values()[choice].toString();
    }

    @Override
    public String toString() {
        return "Player{" + "Chance=" + Chance + ", currentChance=" + currentChance + ", name=" + name + '}';
    }

}
