public class Map {

    private Room startroom;

    public void buildMap() {
        Room room1 = new Room("The dusty room", "The old door creaks open. As you continue to open the door the rusty hinges fall off and the door slams to the ground.\nIf there were anyone else in this god forsakened castle they would surely have heard you.\nThis room has old furbished furniture and set aside neatly to one side the other side there has been evidence of a slaughter.\nWorn out blood testaments to the cruel happenings in this castle");
        Room room2 = new Room("Total Darkness", "You're enshrouded by darkness in this room. Only a faint light is emitting from an extinguishing candle nearby. There's a note laying on the  old worned table");
        Room room3 = new Room("The poison room", "A flowery scent strikes you poisonous. You feel enfeebled by the smell and the longer you linger in the room the more dazy it gets.\nAs you wander about in the room you can sense a silhouette of something laying on the cold hardened floor. A corpse.\nA picture is found of the what you assume the lord of this castle is. She is laughing... hysterically");
        Room room4 = new Room("Dragon room", "In the middle of this room a bronze statue of a grand dragon which emits power and a cunning wisdom stands before you.\nYou're amazed by the creation of this structure - it seems almost as if this thing belongs in the future.\nWalking around the statue you can see the statue is placed on a rail with a lever beside it");
        Room room5 = new Room("The bland room", "You enter a bland room. The old stone floor looks rigid and ready to break at any given moment.\n At the wall to the left you see a fainting picture of whom you assume to be the lord of this castle.\n She stands tall and proud almost as if she would expect nothing but failiure from her subjects... or you?\nIn the room a chest lays open");
        Room room6 = new Room("The entertainment room", "Escaping the poisonus room gasping for air and the feeling of drowsiness you enter a dressing room with all kind of costumes. They look extravagant  ");
        Room room7 = new Room("Trap room", "Entering this room you step onto a platform which activates the walls and lifts the floor towards cold metal spikes.\nThe talisman emits a blue light towards ");
        Room room8 = new Room("Infinit bucket", "The spike looks like the top of a mountain which pierced the castle falling down from the top.\nIn the room there's a bucket which is filled to the brim but it never seems to spill over");
        Room room9 = new Room("room 9", "9");
        //Room 1
        room1.setEast(room2);
        room1.setSouth(room4);
        room1.addItem(new Item("Lamp", ""));
        room1.addItem(new Food("Apple", "A fresh apple", 10));
        room1.addItem(new RangedWeapon("Gun", "Rusty old piece - might backfire", 2, 2));
        room1.addItem(new MeleeWeapon("Sword", "The Sword of a THOUSAND TRUTHS", 5));
        //Våbenobjekt oprettes i enemy's konstruktørkald.
        room1.addEnemy(new Enemy("Troll", "Stinking big troll", 20, new MeleeWeapon("Mace", "Rusty mace", 20)));
        //Set metode til våben
//        MeleeWeapon w1=new MeleeWeapon("Sword", "r",30);
//        Enemy e1 = new Enemy("Troll", "Stinking", 20,null);
//        e1.setCurrentWeapon(w1);
//        room1.addEnemy(e1);
        //Room 2
        room2.setWest(room1);
        room2.setEast(room3);
        room2.addItem(new Food("Ice cream", "my god this is awesome", 20));
        room2.addItem(new Item("Note", "A scribbled note"));
        //Room 3
        room3.setWest(room2);
        room3.setSouth(room6);
        //Room 4
        room4.setNorth(room1);
        room4.setSouth(room7);
        room4.addItem(new Item("Lever", "Lever - can maybe be pushed or pulled?"));
        room4.addItem(new Item("A dragoncrest talisman", "Talisman of Deathwing is descriped on the back-side.\nWearing this necklace makes you see the energy flow in the room giving you the skill to always go the right way when in dire need") {
        });
        room4.addItem(new Item("Mithril armor", "armor made of magical resistance"));
        //Room5
        room5.setSouth(room8);
        room5.addItem(new RangedWeapon("Crusaders Longbow", "Light shines on this bow", 8, 10));
        //Room 6
        room6.setNorth(room3);
        room6.setSouth(room9);
        room6.addItem(new Food("Mysterious ooze", "Alineating looking food - take a chance", -25));
        //Room 7
        room7.setNorth(room4);
        room7.setEast(room8);
        //Room 8
        room8.setWest(room7);
        room8.setNorth(room5);
        room8.setEast(room9);
        room8.addItem(new Item("Water bucket", "A icey spike drips water into a filled bucket - the water seems clean."));
        room8.addItem(new Item("Water", "Drinkable fresh mountainwater - also eatable with the thick freshness. Reminds you of ice."));
        //Room 9
        room9.setWest(room8);
        room9.setNorth(room6);

        startroom = room1;

    }

    public Room getStartroom() {
        return startroom;
    }
}
