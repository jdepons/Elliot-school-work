package playstation;

public class PlayStationStarter {

    public static void main(String[] args) {
        PS5Disk disk = new PS5Disk("NBA2k 22");
        Playstation PS = new Playstation();
        PS.loadDisk(disk);
        PS.startGame();
        PS.ejectDisk();



    }


}

