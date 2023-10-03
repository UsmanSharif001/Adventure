import java.util.ArrayList;

public class Adventure {

        private Map map;
        private Player player;

        public Adventure(){
                map = new Map();
                map.buildMap();
               player = new Player(map.getStartroom());
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


}





