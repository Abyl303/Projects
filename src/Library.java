import java.util.Scanner;

public class Library {
    public static void main(String[] args){

        Book info = new Book("Harry Potter", "Dorian Grey", 2002, true);//первая книга
        Book info1 = new Book("Математика", "И.Верещагин", 2002, false);//вторая книга

        System.out.println("1. Посмотреть все книги");
        System.out.println("2. Взять книгу");
        System.out.println("3. Вернуть книгу");
        System.out.println("4. Зарегистрировать пользователя");
        System.out.println("0. Выход");
        Scanner sc=new Scanner(System.in);

        while (true) {
            int n= sc.nextInt();
            if(n==0){
                System.out.println("Выход из программы");
                break;
            }
            if(n==1) {
                System.out.println("1."+info.getValue());
                //System.out.println(info.borrow());
                //System.out.println(info.returnBook());

                System.out.println("2."+info1.getValue());
                //System.out.println(info1.borrow());
                //System.out.println(info1.returnBook());
            }

            else if(n==2) {
                System.out.println("Какую книгу взять? (1 или 2)");
                int choice= sc.nextInt();
                if(choice==1){
                    System.out.println(info.borrow());
                }
                else if(choice==2){
                    System.out.println(info1.borrow());
                }
                else System.out.println("Неверные данные");

                //System.out.println(info.getValue());
                //System.out.println(info.borrow());
                //System.out.println(info.returnBook());

                //System.out.println(info1.getValue());
                //System.out.println(info1.borrow());
                //System.out.println(info1.returnBook());
            }

            else if(n==3) {
                System.out.println("Какую книгу вернуть? (1 или 2)");
                int choice1= sc.nextInt();
                if(choice1==1){
                    System.out.println(info.returnBook());
                }
                else if(choice1==2){
                    System.out.println(info1.returnBook());
                }
                else System.out.println("Неверные данные");
                //System.out.println(info.getValue());
                //System.out.println(info.borrow());
                //System.out.println(info.returnBook());

                //System.out.println(info1.getValue());
                //System.out.println(info1.borrow());
                //System.out.println(info1.returnBook());
            }

            else if(n==4) {
                String name1= sc.next();
                int age1= sc.nextInt();
                User uuser=new User(name1, age1);
                System.out.println("Пользователь зарегистрирован: " + uuser.getValue());
            }
            else System.out.println("Выход");
        }
        sc.close();
    }
}
