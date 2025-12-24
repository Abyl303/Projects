public class Employer {
    public static void main(String[] args){
        Employee worker=new Employee("David", 150);
        worker.info();

        Employee worker1=new Manager("David", 150, 200);
        worker1.info();

        Employee worker2=new Developer("David", 150, 5);
        worker2.info();

    }
}
