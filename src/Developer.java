public class Developer extends Employee{
    private int overtimeHours;
    Developer(String name, int baseSalary, int overtimeHours){
        super(name, baseSalary);
        this.overtimeHours=overtimeHours;
    }
    @Override
    public int calculateSalary() {
        return (500*overtimeHours)+baseSalary;
    }

}
