public class Gryffindor extends Houses implements Magicable{
    //constructor
    public Gryffindor(){
        super("Gryffindor", "RED");
    }
    
    //methods
    public void attackSpell(Player player, Player target, Spell spell){
        target.setHP(target.getHP()-(spell.getDamage() + player.getAttackDamage()));
        if (spell instanceof Expelliarmus){
            player.setMana(player.getMana()-3);
        }
        else{
            player.setMana(player.getMana()-4);
        }
        System.out.println("[" + player.getName() + "]" + ": use spell (" + spell.getName() + ")!");
    }
    public void defense(Player player, Player damager){
        player.setHP(player.getHP()+3);
        player.setMana(player.getMana()+4);
        System.out.println("[" + player.getName() + "]: Protego !");
    }
}
