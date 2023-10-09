import java.util.ArrayList;

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
    public void setCurrentWeapon(Weapon weapon){
        this.weapon= weapon;

    }

    public void adjustHealth(int amount) {
        health += amount;
    }




//    public boolean isEnemyDead(){
//       // if ()
//    //}


//    public boolean dropWeaponIfDead(String itemName) {
//        Item weapon = currentWeapon;
//        {
//            if (weapon.getItemName().toLowerCase().contains(itemName.toLowerCase())) {
//
//                return true;
//            }
//        }
//        return false;
//    }

}