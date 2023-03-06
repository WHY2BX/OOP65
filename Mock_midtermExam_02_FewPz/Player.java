public class Player {
    private final String name;
    private final int attackDamage = 2;
    private Houses houses;
    private int hp = 20;
    private int mana = 50;
    
    //constructor
    public Player(){
        this("", 20);
    }
    public Player(String name){
        this(name, 20);
    }
    public Player(String name, int hp){
        this.name = name;
        this.hp = hp;
    }
    
    //methods
    public void attack(Player target, Spell spell){
        if (houses instanceof Gryffindor){
            ((Gryffindor)this.houses).attackSpell(this, target, spell);
        }
        else{
            ((Hufflepuff)this.houses).attackSpell(this, target, spell);
        }
        if (target.getHP() <= 0){
            System.out.println("[DEAD]: " + target.getName() + " was killed by " + this.getName());
        }
    }
    public void protectFromPlayer(Player target){
        if (houses instanceof Gryffindor){
            ((Gryffindor)this.houses).defense(this, target);
        }
        else{
            ((Hufflepuff)this.houses).defense(this, target);
        }
    }
    
    public String toString(){
        return ("[Player] : " + this.name + " HP: " + this.hp + " Mana: " + this.mana + " || " + this.houses);
    }
    public boolean equals(Player player){
        return (this.name == player.name && this.houses == player.houses);
    }
    
    
    //setter, getter
    public String getName(){
        return this.name;
    }
    public int getAttackDamage(){
        return this.attackDamage;
    }
    public void setHouses(Houses houses){
        this.houses = houses;
    }
    public Houses getHouses(){
        return this.houses;
    }
    public void setHP(int hp){
        if (hp <= 0){
            this.hp = 0;
        }
        else if (hp >= 20){
            this.hp = 20;
        }
        else{
            this.hp = hp;
        }
    }
    public int getHP(){
        return this.hp;
    }
    public void setMana(int mana){
        if (mana <= 0){
            this.mana = 0;
        }
        else if (mana >= 50){
            this.mana = 50;
        }
        else{
            this.mana = mana;
        }
    }
    public int getMana(){
        return this.mana;
    }
}
