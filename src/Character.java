public class Character {

    private String name;
    private int health;
    private int attackPower;

    public Character(){}

    // Конструктор — ТОЛЬКО инициализация
    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    // ====== ГЕТТЕРЫ ======

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    // ====== СЕТТЕРЫ ======

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    // ====== ПОВЕДЕНИЕ ОБЪЕКТА ======

    public void attack() {
        System.out.println("Персонаж " + name + " атакует с силой " + attackPower);
    }

    public void takeDamage(int damage) {
        setHealth(health - damage);
        System.out.println(name + " получил урон: " + damage +
                ". Текущее здоровье: " + health);
    }

    public void info() {
        System.out.println(
                "Name: " + name +
                        ", Health: " + health +
                        ", Attack Power: " + attackPower
        );
    }
}
