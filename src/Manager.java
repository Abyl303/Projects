public class Manager extends Employee{
    private int bonus;
    Manager(String name, int baseSalary, int bonus){
        super(name, baseSalary);
        this.bonus=bonus;
    }
    @Override
    public int calculateSalary() {
        return baseSalary+bonus;
    }
}
