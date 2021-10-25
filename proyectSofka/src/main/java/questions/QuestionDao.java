package questions;

import ConnectionDB.Connetc;
import player.Player;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QuestionDao {
    private static final String SQL_SELECT ="SELECT Question,Answer FROM questions ORDER BY RAND() limit 1 ";



    private String mensaje="";

    public List<Questions>shearchrquestion (){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Questions question=null;
        List<Questions> questions=new ArrayList<>();

        try {
            connection = Connetc.getConnection();
            preparedStatement = connection.prepareStatement(SQL_SELECT);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()) {
                String Question=resultSet.getString("Question");
                String Answer=resultSet.getString("Answer");

                question = new Questions(Question,Answer);
                questions.add(question);

            }

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

        return questions ;
    }

}
