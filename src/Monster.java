public class Monster {
    String name;
    int damage;

    public Monster(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public static void main(String[] args) {

            Zombie zombie1 = new Zombie("Alice");
            zombie1.attack();
            Zombie zombie2 = new Zombie("Bob");
            zombie2.attack();
    }
    public void growl(){
        System.out.print("Raaaauuughhhh");
        this.growl();
    }
    public void attack(){
        this.attack();
        growl();
    }
}
