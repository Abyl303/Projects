public class Library {
    public static void main(String[] args){
        Book info=new Book("Harry Potter", "Dorian Grey", 2002, true);
        System.out.println(info.getValue());
        System.out.println(info.borrow());
        System.out.println(info.returnBook());
    }
}
