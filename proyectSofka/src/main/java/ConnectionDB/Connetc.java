package ConnectionDB;

import java.sql.*;
public class Connetc {
        private static final String JDBC_URL ="jdbc:mysql://localhost:3306/game?useSSL=false&useTimezon=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        private static final String JDBC_USER = "root";
        private static final String JDBC_PASSWORD = "jmju17";

        public static java.sql.Connection getConnection() throws SQLException {
            return  DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);

        }
        public static void close(ResultSet rs) throws SQLException {
            rs.close();

        }

        public static void close (Statement statement){

        }

        public static void close(PreparedStatement statement) throws SQLException {
            statement.close();
        }
        public static void close (java.sql.Connection connection) throws SQLException {
            connection.close();

        }

}
