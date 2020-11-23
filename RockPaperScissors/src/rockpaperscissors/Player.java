package rockpaperscissors;

/**
 *
 * @author Bomber
 */
public class Player {

    private final int hp = 3;
    private int currentHp;
    private String name;
    private int pointWin = 0;

    public Player() {
        this.currentHp = hp;
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

    public int getHp() {
        return hp;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public int getPointWin() {
        return pointWin;
    }

    public void useOption(int choiceChampion, int choiceChallenger, Player anotherPlayer) {
        if (choiceChampion < 0 || choiceChampion > 2 || choiceChallenger < 0 || choiceChallenger > 2) {
            throw new Error("PLEASE ENTER INDEX 0 TO 2");
        } else {
            switch (choiceChampion) {
                case 0 -> { // 0 is Rock
                    System.out.println(this.getName() + " use " + Option.values()[0]);
                    if (choiceChallenger == 2) { // 2 is Scissors
                        anotherPlayer.currentHp = anotherPlayer.getCurrentHp() - 1; //win
                        this.pointWin = this.getPointWin() + 1;
                        System.out.println(anotherPlayer.getName() + " use " + Option.values()[2]);

                    } else if (choiceChallenger == 1) { // 1 is Paper
                        currentHp = getCurrentHp() - 1; //lose
                        System.out.println(anotherPlayer.getName() + " use " + Option.values()[1]);
                        anotherPlayer.pointWin = anotherPlayer.getPointWin() + 1;
                    } else if (choiceChallenger == 0) { // 0 is Rock
                        currentHp = getCurrentHp(); //draw
                        System.out.println(anotherPlayer.getName() + " use " + Option.values()[0]);
                        System.out.println("----- DRAW -----");
                    }
                    checkDmg(anotherPlayer);
                    checkDmg(this);
                    break;
                }
                case 1 -> { // 1 is Paper
                    System.out.println(this.getName() + " use " + Option.values()[1]);
                    if (choiceChallenger == 0) { // 0 is Rock
                        anotherPlayer.currentHp = anotherPlayer.getCurrentHp() - 1; //win
                        this.pointWin = this.getPointWin() + 1;
                        System.out.println(anotherPlayer.getName() + " use " + Option.values()[0]);

                    } else if (choiceChallenger == 2) { // 2 is Scissors
                        currentHp = getCurrentHp() - 1; //lose
                        System.out.println(anotherPlayer.getName() + " use " + Option.values()[2]);
                        anotherPlayer.pointWin = anotherPlayer.getPointWin() + 1;
                    } else if (choiceChallenger == 1) { // 1 is Paper
                        currentHp = getCurrentHp(); //draw
                        System.out.println(anotherPlayer.getName() + " use " + Option.values()[1]);
                        System.out.println("----- DRAW -----");
                    }
                    checkDmg(anotherPlayer);
                    checkDmg(this);
                    break;
                }
                case 2 -> { // 2 is Scissors
                    System.out.println(this.getName() + " use " + Option.values()[2]);
                    if (choiceChallenger == 1) { // 1 is Paper
                        anotherPlayer.currentHp = anotherPlayer.getCurrentHp() - 1; //win
                        this.pointWin = this.getPointWin() + 1;
                        System.out.println(anotherPlayer.getName() + " use " + Option.values()[1]);

                    } else if (choiceChallenger == 0) { // 0 is Rock
                        currentHp = getCurrentHp() - 1; //lose
                        System.out.println(anotherPlayer.getName() + " use " + Option.values()[0]);
                        anotherPlayer.pointWin = anotherPlayer.getPointWin() + 1;
                    } else if (choiceChallenger == 2) { // 2 is Scissors
                        currentHp = getCurrentHp(); //draw
                        System.out.println(anotherPlayer.getName() + " use " + Option.values()[2]);
                        System.out.println("----- DRAW -----");
                    }
                    checkDmg(anotherPlayer);
                    checkDmg(this);
                    break;
                }
            }
        }
    }

    private void checkDmg(Player player) {
        if (player.getCurrentHp() <= 0) {
            player.currentHp = 0;
            System.out.println("---------------------- [ " + player.getName() + " LOSE ]");
        }

    }

    public String option(int choice) {
        return Option.values()[choice].toString();
    }

    @Override
    public String toString() {
        return "STATUS " + name + " : " + "Point = " + pointWin ;
    }

}
