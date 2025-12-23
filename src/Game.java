public class Game {
    public static void main(String[] args) {

        Character pudge = new Character("Pudge", 100, 150);

        pudge.info();
        pudge.attack();

        pudge.takeDamage(30);
        pudge.setAttackPower(180);

        pudge.info();
        System.out.println();
        System.out.println();

        Character c = new Person("Hero", 100, 50, 10);
        c.info();
    }
}
