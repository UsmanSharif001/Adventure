public class MeleeWeapon extends Weapon{

    public MeleeWeapon(String itemName, String itemDescription, int dmg){
        super(itemName,itemDescription,dmg);

    }

    public int remainingAmmo(int usedAmmunition){
        return 0;
    }
}
