package playstation;

public class Playstation {

    private PS5Disk loadedDisk = null;


    public Playstation() {
        System.out.println("In constructor");
    }

    public void startGame() {
            if (loadedDisk != null ) {
                System.out.println("\n\nYou are playing " + loadedDisk.getDiskName());
            } else {
                System.out.println("\n\nDisk is not loaded");

            }
    }


    public void loadDisk(PS5Disk disk){
        if (loadedDisk != null) {
            System.out.println("Cant load! "  + " already have a disk");
        }else {
            loadedDisk = disk;
        }
    }

    public PS5Disk ejectDisk() {
        PS5Disk thisDisk = loadedDisk;
        loadedDisk = null;
        return thisDisk;
    }


}
