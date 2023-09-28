public class Adventure {

        private Map map;
        private Player player;


        public Adventure(){
                this.map = new Map();
                map.buildMap(); //TOdo Den her bliver kaldt og ikke den i vores userinterface
                Room initialRoom = map.getStartroom();
                this.player = new Player(initialRoom);

        }

        public void buildMap(){
                map.buildMap();
}


        /*public void moveToNextRoom(String move){
                player.moveToNextRoom(move);
        } */



        public String look(){
                return player.look();
        }

        public void moveRoom(String move){
                player.moveRoom(move);
        }


}





