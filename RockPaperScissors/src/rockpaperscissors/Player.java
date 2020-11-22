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
        
    }
    private void checkDmg(Player player){
        if(player.getCurrentChance() <= 0){
            player.currentChance = 0 ;
            System.out.println(player.getName() + "fainnted");
        }
    }
    public void heal(){
        currentChance = getCurrentChance() + 10;
        if(getCurrentChance() > getChance()){
            currentChance = getChance();
        }
    }
    public String option(int choice){
        return Option.values()[choice].toString();
    }

    void useSkill(int skillP1, Player Challenger) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
