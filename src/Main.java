import java.util.Scanner;

public class Main {
    public static void main(){

        Transport bmw= new Transport();
        bmw.speed=250.5f;
        bmw.weght=2500;
        bmw.color="White";
        bmw.coordinate=new int[] {0,0,0};

        Transport truck=new Transport();
        truck.speed=140.5f;
        truck.weght =5600;
        truck.color="red";
        truck.coordinate=new int[] {100,0,10};

        System.out.println("Truck speed: "+truck.speed+"Transport speed: "+bmw.speed);
    }
}