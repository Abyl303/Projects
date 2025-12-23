public class Person extends Character{
    protected int level;
    public Person(String name, int health, int attackPower, int level){
        super(name, health, attackPower);
        this.level=level;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Уровень: " + level);
    }






}
