public class MeleeWeapon extends Weapon {

    public MeleeWeapon(String itemName, String itemDescription, int dmg) {
        super(itemName, itemDescription, dmg);
    }

    @Override
    public int attack() {
        return getDmg();
    }

    @Override
    public boolean isLoaded() {
        return true;
    }
}
