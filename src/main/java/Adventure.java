public class Adventure {

        private Map map;
        private Player player;

        public  Adventure(){
                this.map = new Map();
                this.map.initializeStartRoom();
                this.player = new Player(map.getStartroom());
        }

        public void buildMap(){
                map.buildMap();
        }

        public void moveRoom(String move){
                player.moveRoom(move);
        }


        public Room currenRoom() {
             return map.getStartroom();
        }

        public String look(){
                return player.look();
        }

}





