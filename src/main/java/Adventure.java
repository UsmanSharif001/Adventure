public class Adventure {

        private Map map;
        private Player player;

        public Adventure(){
                map = new Map();
                map.buildMap();
               player = new Player(map.getStartroom(),50);
        }

        public String look(){
                return player.look();
        }

        public boolean moveRoom(char move){
             return player.moveRoom(move);
        }

        public boolean takeItem (String itemName){
                return player.takeItem(itemName);
        }

        public boolean dropItem (String itemName){
                return player.dropItem(itemName);
        }

        public String showInventory(){
                return player.showInventory();
        }

        public int showHealth(){
                return player.getHealth();
        }

        public ReturnMessage eat(String itemName){
                return player.eat(itemName);
        }
        public ReturnMessage equip(String itemName){
                return player.equip(itemName);
        }
}

