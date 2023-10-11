public class Enemy {
    private String name;
    private String nameDescription;
    private int health;
    private Weapon weapon;



    public Enemy (String name, String nameDescription, int health, Weapon weapon){
        this.name=name;
        this.nameDescription=nameDescription;
        this.health=health;
        this.weapon=weapon;

    }
    public String getName(){
        return name;
    }
    public String getNameDescription(){
        return nameDescription;
    }
    public int getHealth(){
        return health;
    }
    public Weapon getWeapon(){
        return weapon;
    }


    public void attackPlayer(Player player){
        weapon.useWeapon();
        player.hit(weapon);
    }

    public void hit(Weapon weapon){
        health -= weapon.getDmg();

    }



}
