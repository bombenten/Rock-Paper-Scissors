package rockpaperscissors;

import java.util.Random;

/**
 *
 * @author Bomber
 */
public class Player {
    private final int Chance = 3;
    private int currentChance;
    private String name;
    
    public Player(){
        this.currentChance = Chance;
    }
    
    public void setName(String name) {
        if(name.isBlank()){
            this.name = "PLAYER_NAME";
        } else {
            this.name = name ;
        }
    }
    public String getName(){
        return name;
    }
    public int getChance(){
        return Chance;
    }
    public int getCurrentChance(){
        return currentChance;
    }
    public void useOption(int choice, Player anotherPlayer){
        if (choice < 0 || choice > 2) {
            throw new Error("PLEASE ENTER INDEX 0 TO 2");
        } else {
            Random random = new Random();
            switch (choice) {
                case 0 -> {
                    int crit1 = random.nextInt(10);
                    int crit2 = random.nextInt(10);
                    System.out.print(this.getName() + " use " + Option.values()[choice] + " to " + anotherPlayer.getName());
                    if (crit1 == crit2) {
                        System.out.println(" CRITICAL HIT!");
                        anotherPlayer.currentChance = anotherPlayer.getCurrentChance() - (1 * 2);
                        checkDmg(anotherPlayer);
                    } else {
                        System.out.println();
                        anotherPlayer.currentChance = anotherPlayer.getCurrentChance() - 1;
                        checkDmg(anotherPlayer);
                    }
                    break;
                }
                case 1 -> {
                    int crit1 = random.nextInt(1);
                    int crit2 = random.nextInt(1);
                    System.out.print(this.getName() + " use " + Option.values()[choice] + " to " + anotherPlayer.getName());
                    if (crit1 == crit2) {
                        System.out.println(" CRITICAL HIT!");
                        anotherPlayer.currentChance = anotherPlayer.getCurrentChance() - (2 * 2);
                        checkDmg(anotherPlayer);
                    } else {
                        System.out.println();
                        anotherPlayer.currentChance = anotherPlayer.getCurrentChance() - 2;
                        checkDmg(anotherPlayer);
                    }
                    break;
                }
            }
        }
    }
    private void checkDmg(Player player){
        if(player.getCurrentChance() <= 0){
            player.currentChance = 0 ;
            System.out.println(player.getName() + "fainnted");
        }
    }
    public void heal(){
        currentChance = getCurrentChance() + 1;
        if(getCurrentChance() > getChance()){
            currentChance = getChance();
        }
    }
    public String option(int choice){
        return Option.values()[choice].toString();
    }


    @Override
    public String toString() {
        return "Player{" + "Chance=" + Chance + ", currentChance=" + currentChance + ", name=" + name + '}';
    }
    
    
    
}
