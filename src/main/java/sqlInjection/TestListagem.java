package sqlInjection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestListagem {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager
                .getConnection
                        ("jdbc:mysql:// localhost:3306/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "");
        System.out.printf("fechar conexao");

        // statement são
        Statement stm = connection.createStatement();



        connection.close();
    }
}
