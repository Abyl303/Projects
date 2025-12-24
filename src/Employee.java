public class Employee {
    protected String name;
    protected int baseSalary;

    public Employee(){}
    

    public Employee(String name, int baseSalary){
        this.name=name;
        this.baseSalary=baseSalary;
    }


    //геттеры
    public String getName(){
        return name;
    }

    public int getBaseSalary(){
        return baseSalary;
    }
    //сеттеры

    public void setName(String name){
        this.name=name;
    }

    public void setBaseSalary(int baseSalary){
        this.baseSalary=baseSalary;
    }

    public int calculateSalary(){
        return baseSalary;
    }

    public void info(){
        System.out.println("Name: "+name+". Base salary: "+baseSalary+". Total salary: "+calculateSalary());
    }






}
