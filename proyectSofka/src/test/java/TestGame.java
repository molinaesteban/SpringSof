import player.Player;
import player.PlayerDao;
import questions.QuestionDao;
import questions.Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestGame {
    public static void main(String[] args) {



        Player player = new Player();
        Scanner read = new Scanner(System.in);
        PlayerDao playerDao = new PlayerDao();


        int pointsforquestion = 10;
        int points = 0;
        boolean answer=true;
        String answeruser;
        String continu = null;

        System.out.println("Hola Bienvenido:");
        System.out.println("Quien quiere ser millonario");


        System.out.println("Digite el nombre: ");
        String playerName = read.next();
        System.out.println("Digite el apellido: ");

        String playerLastname = read.next();
        player.setNamep(playerName);
        player.setLastname(playerLastname);
        playerDao.insert(player);

        while (answer = true) {
            String ans ="";
            System.out.println("pregunta: ");
            QuestionDao questionDao = new QuestionDao();
            List<Questions> questionsList = questionDao.shearchrquestion();
            System.out.println("pregunta = " + questionsList.toString());
            System.out.println("responda la pregunta: ");
            answeruser = read.next();
            if (answeruser.equals("")) {
                System.out.println("respuesta Correta");
                System.out.println("Desea continuar: ");
                answer= read.nextBoolean();
                if (answer=false){
                    System.out.println(player.toString());
                    break;

                }


            } else {
                System.out.println("respuesta incorreta");
                System.out.println(player.toString());
                break;
            }

        }
             System.out.println("Segunda pregunta: ");
                    QuestionDao questionDao1= new QuestionDao();
                    List<Questions>questionsList1=questionDao1.shearchrquestion();

                    System.out.println("pregunta = " + questionsList1.toString());
                    System.out.println("responda la pregunta: ");
                    answeruser =read.next();
                    if(answeruser.equals("")){
                        System.out.println("respuesta Correta");
                        System.out.println("Desea continuar: ");



                    }
                    else {
                        System.out.println("respuesta incorreta");

                    }

                    answeruser = read.next();
            }




    }




