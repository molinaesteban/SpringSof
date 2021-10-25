package player;

public class Player {
    private String namep;
    private String lastname;
    private int points;

    public Player() {
    }

    public Player(String namep, String lastname,int points) {
        this.namep = namep;
        this.lastname = lastname;
        this.points=points;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getNamep() {
        return namep;
    }

    public void setNamep(String namep) {
        this.namep = namep;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }



    @Override
    public String toString() {
        return "Player{" +
                "namep='" + namep + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
