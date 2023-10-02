import java.util.ArrayList;

public class Adventure {

        private Map map;
        private Player player;


        public Adventure(){
                this.map = new Map();
                map.buildMap();
                Room initialRoom = map.getStartroom();
                this.player = new Player(initialRoom);
        }


        public String look(){
                return player.look();
        }

        public boolean moveRoom(char move){
             return player.moveRoom(move);
        }

        public Player getPlayer(){
                return player;
        }


}





