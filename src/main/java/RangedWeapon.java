public class RangedWeapon extends Weapon {

    private int ammunition;

    public RangedWeapon (String itemName, String itemDescribtion, int dmg, int ammunition){
        super(itemName, itemDescribtion, dmg);
        this.ammunition=ammunition;
    }

    @Override
    public int remainingAmmo(int usedAmmunition) {
        usedAmmunition = -1;
        return ammunition += usedAmmunition;

    }
}
