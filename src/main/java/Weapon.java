public abstract class Weapon extends Item {

    private int dmg;

    public Weapon(String itemName, String itemDescription, int dmg){
        super(itemName,itemDescription);
        this.dmg= dmg;
    }
    public int getDmg(){
        return dmg;
    }

    public abstract int attack();

    public abstract boolean isLoaded();
    //public abstract
}
