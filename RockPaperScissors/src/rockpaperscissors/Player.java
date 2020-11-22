package rockpaperscissors;

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
        
    }
    private void checkDmg(Player player){
        
    }
    public void heal(){
        
    }
    public String option(int choice){
        return 0;
    }
    
}
