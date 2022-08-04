package sqlInjection;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager
                .getConnection
                        ("jdbc:mysql:// localhost:3306/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "");
        System.out.printf("fechar conexao");
        connection.close();

    }

}
