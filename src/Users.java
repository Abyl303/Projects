import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Users {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = sc.nextLine();

        System.out.print("Введите возраст: ");
        int age = sc.nextInt();

        // Параметры подключения
        String url = "jdbc:postgresql://localhost:5432/testdb"; // имя базы
        String user = "postgres"; // логин
        String password = "root"; // пароль

        String sql = "INSERT INTO users(name, age) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, name);
            stmt.setInt(2, age);

            stmt.executeUpdate();

            System.out.println("Данные успешно добавлены!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
