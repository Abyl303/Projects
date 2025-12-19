import java.util.Scanner;
public class Tema {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Выбери команду:");
            System.out.println("1 - Конвертер валют");
            System.out.println("2 - Работа со временем");
            System.out.println("3 - Проверка високосного года");
            System.out.println("4 - Проверка простого числа");
            System.out.println("5 - Работа с массивами");
            System.out.println("Выход");
            System.out.println();
            String kom= sc.next();
            if(kom.equals("1")){
                System.out.println("vvedi chislo");
                double val= sc.nextDouble();
                System.out.println("vvedi valutu");
                String valuta=sc.next();
                if(valuta.equals("USD")){
                    System.out.println(val*470);
                }
                else if(valuta.equals("EUR")){
                    System.out.println(val*500);
                }
                else if(valuta.equals("RUB")){
                    System.out.println(val*5.5);
                }
                else System.out.println("invalid currency");
            }
            else if(kom.equals("2")){
                System.out.println("nichego");
            }
            else if(kom.equals("3")){
                System.out.println("vvedi god");
                int vis= sc.nextInt();
                if(vis%400==0 || (vis%4==0 && vis%100!=0)){
                    System.out.println("god visokosnyi");
                }
                else System.out.println("not");

            }
            else if(kom.equals("4")){
                System.out.println("vvedi chislo");
                int chislo= sc.nextInt();
                boolean boo = true;  // считаем число простым по умолчанию
                if (chislo < 2) {
                    boo = false;    // числа меньше 2 не простые
                } else {
                    for (int i = 2; i <= Math.sqrt(chislo); i++) {
                        if (chislo % i == 0) {
                            boo = false;  // нашли делитель — число не простое
                            break;
                        }
                    }
                }
                if (boo) {
                    System.out.println("prostoe");
                } else {
                    System.out.println("net");
                }
            }
            else if(kom.equals("5")){
                System.out.println("vvedi chislo");
                int n= sc.nextInt();
                System.out.println("vvedi massiv");
                int[] arr=new int[n];
                for(int i=0; i<n; i++){
                    arr[i]= sc.nextInt();
                }
                for(int i=0; i<n; i++){
                    if(arr[i]%2==0){
                        System.out.println(arr[i]);
                    }
                }

            }
            else System.out.println("sgl");

        }
    }


