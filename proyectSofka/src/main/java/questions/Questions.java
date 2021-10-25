package questions;

public class Questions {

    private String Category;
    private String Question;
    private String Answer;

    public Questions(String question,String Answer) {
        Question=question;
        this.Answer=Answer;
    }



    public Questions(String category, String question, String answer) {
        Category = category;
        Question = question;
        Answer = answer;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "Question='" + Question + '\'' +
                '}';
    }
}
