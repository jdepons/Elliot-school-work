public class Pokemon {
    private String name;
    private int level;

    public Pokemon(){
    }

    public Pokemon(String name, int level){
        this.name = name;
        this.level = level;

    }

    public Pokemon(String bob, double level){
        this.name = bob;
        this.level = (int) level ;

    }


    public void setName(String Pname){
        name = Pname;
    }
    public String getName(){
        return name;
    }
        public void setLevel(int plevel){
        level = plevel;
}
        public int getLevel(){
        return level;
}

    public void attack() {
        System.out.println(name + "(" + level + ") attack!");
    }

}

