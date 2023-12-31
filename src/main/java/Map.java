public class Map {

    private Room startroom;

    public void buildMap() {
        Room room1 = new Room("The dusty room", "The old door creaks open. As you continue to open the door the rusty hinges fall off and the door slams to the ground.\nIf there were anyone else in this god forsakened castle they would surely have heard you.\nThis room has old furbished furniture and set aside neatly to one side the other side there has been evidence of a slaughter.\nWorn out blood testaments to the cruel happenings in this castle");
        Room room2 = new Room("Total Darkness", "You're enshrouded by darkness in this room. Only a faint light is emitting from an extinguishing candle nearby. There's a note laying on the  old worned table");
        Room room3 = new Room("The poison room", "A flowery scent strikes you poisonous. You feel enfeebled by the smell and the longer you linger in the room the more dazy it gets.\nAs you wander about in the room you can sense a silhouette of something laying on the cold hardened floor. A corpse.\nA picture is found of the what you assume the lord of this castle is. He is laughing... hysterically");
        Room room4 = new Room("Dragon room", "In the middle of this room a bronze statue of a grand dragon which emits power and a cunning wisdom stands before you.\nYou're amazed by the creation of this structure - it seems almost as if this thing belongs in the future.\nWalking around the statue you can see the statue is placed on a rail with a lever beside it");
        Room room5 = new Room("The bland room", "You enter a bland room. The old stone floor looks rigid and ready to break at any given moment.\n At the wall to the left of you, you see a fainting picture of whom you assume to be the lord of this castle.\n She stands tall and proud almost as if she would expect nothing but failiure from her subjects... or you?\nA bow lies underneath the picture sparkling light It calls to you.");
        Room room6 = new Room("The entertainment room", "Escaping the poisonus room gasping for air and the feeling of drowsiness you enter a dressing room with all kind of costumes. They look extravagant.\n Hidden amongst the costumes your sight almost escapes what you thought was a prop. A bow. Beside it some ooze lays.");
        Room room7 = new Room("Trap room", "Entering this room you step onto a stony platform which activates the walls and lifts the floor towards cold metal spikes.\nThe talisman emits a blue light towards east");
        Room room8 = new Room("Infinit bucket", "The top of an spikey iceberg has pierced the castle falling down.\nIn the room underneath the spikey iceberg there's a bucket which is filled to the brim but it never seems to spill over. It gives you an eerily feeling.");
        Room room9 = new Room("The Chess room", "You enter a huge room, you are standing on top of a staircase, you can see chandeleirs hanging from the roof.\n When you look down at the main floor in front of you, it looks like a big chess game. \n The floor is in black and white squares, and 3 meter high chess pieces are standing there. \n you hear a noice, and can see how the king from the white pieces turns, and stares at you. ");

        //Room 1
        room1.setEast(room2);
        room1.setSouth(room4);
        room1.addItem(new Item("Lamp", "Shines bright like a diamond... Sometimes"));
        room1.addItem(new Food("Apple", "A fresh apple", 10));
        room1.addItem(new RangedWeapon("Gun", "Rusty old piece - might backfire", 2, 2));

        //Room 2
        room2.setWest(room1);
        room2.setEast(room3);
        room2.addItem(new Item("Note", "A scribbled note - be carefull... It might turn in to dust"));
        room2.addItem(new MeleeWeapon("Dagger", "tiny blade, might be good for cutting apples", 4));

        //Room 3
        room3.setWest(room2);
        room3.setSouth(room6);
        room3.addItem(new Food("Mushroom", "do you dare eat me?", 15));
        room3.addEnemy(new Enemy("Lasher", "Long thorns are sticking out of its roots, when its slow walking towards you", 9, new MeleeWeapon("Thorn:", "Long and pointy might be good to shank enemies with", 6)));

        //Room 4
        room4.setNorth(room1);
        room4.setSouth(room7);
        room4.addItem(new MeleeWeapon("Sword", "THE sword of a THOUSAND TRUTHS", 16));
        room4.addItem(new Item("A dragoncrest talisman", "Talisman of Deathwing is descriped on the back-side.\nWearing this necklace makes you see the energy flow in the room giving you the skill to always go the right way when in dire need") {
        });
        room4.addEnemy(new Enemy("Baby Dragon", "The small creature with black eyes, is it old enough to breath fire yet? who knows!", 10, new MeleeWeapon("Claw", "sharp but fairly short", 5)));
        //Room5
        room5.setSouth(room8);
        room5.addItem(new Item("Treasure", " Gold lots of gold!, diamonds everywhere!, you hear a distant sound... \"my precious..\" "));
        room5.addItem(new Food("Chocolate gold coin", "you remember these from when you were a kid, you grandmom always had some of these", 25));
        //Room 6
        room6.setNorth(room3);
        room6.setSouth(room9);
        room6.addItem(new Food("Ooze", "Alineating and mysterius looking food - take a chance eat it!", -25));
        room6.addItem(new RangedWeapon("Bow", "A crusaders longbow. Inscribed on the bow you read:For the chosen for which my enemies shall perish!", 17, 1000));
        room6.addEnemy(new Enemy("Clown Ghoul", "A decaying ghoul stands with it's back turned against you overlooking a shiney bow", 13, new MeleeWeapon("Limb", "Torned limb from a corpse, not the ghouls", 6)));
        //Room 7
        room7.setNorth(room4);
        room7.setEast(room8);
        room7.addEnemy(new Enemy("The gnome with the mighty metal fist", "A gnome blacksmith which instead of honing weapons with a hammer uses his hand", 21, new RangedWeapon("gloves", "Iron gloves that would fit the smallest of creatures or be used as a projectile weapon", 15, 7)));
        //Room 8
        room8.setWest(room7);
        room8.setNorth(room5);
        room8.setEast(room9);
        room8.addItem(new Food("Ice", "Drinkable fresh mountain water - also eatable with the thick freshness.", 22));
        room8.addItem(new Food("A Magic Ice cream", "my god this is awesome, it never melts and tastes like home", 20));
        //Room 9
        room9.setWest(room8);
        room9.setNorth(room6);
        room9.addEnemy(new Enemy("The King", "A majestic 3 meter high king made of granite, he has a sword in his hand and his eyes glow red", 50, new MeleeWeapon("Sword", "The mighty sword! might this actually be excalibur", 15)));

        startroom = room1;

    }

    public Room getStartroom() {
        return startroom;
    }
}
//Våbenobjekt oprettes i enemy's konstruktørkald. Bliver ikke brugt.
//Set metode til våben
//        MeleeWeapon w1=new MeleeWeapon("Sword", "r",30);
//        Enemy e1 = new Enemy("Troll", "Stinking", 20,null);
//        e1.setCurrentWeapon(w1);
//        room1.addEnemy(e1);