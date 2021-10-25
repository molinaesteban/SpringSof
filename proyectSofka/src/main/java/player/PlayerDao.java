package player;
import ConnectionDB.Connetc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PlayerDao {

   // private static final String SQL_SELECT = "select player.namep,player.lastnamep from player"; //Definicion de la sentencia sql
    private static final String SQL_INSERT = "insert into player(namep,lastnamep,points) values (?,?,?)";
    //private static final String SQL_DELETE = "DELETE FROM persona where idpersona  = ?";

    private String mensaje="";

    public String insert(Player player) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        //Variable para saber cuatos registros se modifican
        try {
            connection = Connetc.getConnection();
            preparedStatement = connection.prepareStatement(SQL_INSERT);
            preparedStatement.setString(1, player.getNamep());
            preparedStatement.setString(2, player.getLastname());
            preparedStatement.setInt(3, player.getPoints());


            // en caso de que los valores con tengan otro tipo de dato que no sea String se usa el set'Variable' pertinente
           preparedStatement.executeUpdate();//executeUpdate atualiza el estado en la base de datos

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                Connetc.close(preparedStatement);
                Connetc.close(connection);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }

        return mensaje;

    }



}
