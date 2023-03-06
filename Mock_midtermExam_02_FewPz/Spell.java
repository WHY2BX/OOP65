public class Spell {
    private final String name;
    private int damage;
    
    //constructor
    public Spell(){
        this("");
    }
    public Spell(String name){
        this.name = name;
    }
    
    //setter, getter
    public String getName(){
        return this.name;
    }
    public void setDamage(int damage){
        this.damage = damage;
    }
    public int getDamage(){
        return this.damage;
    }
}
