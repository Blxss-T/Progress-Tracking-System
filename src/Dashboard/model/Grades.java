package Dashboard.model;

public class Grade {
 private String name;
 private String description;
 private int score;
 public Grade (){};

    public Grade(String name, String description, int score) {
        this.name = name;
        this.description = description;
        this.score = score;
    }
    public Grade(String name ,int score,String description){
        this.name=name;
        this.description= description;
        this.score=score;
    }

    public Grade(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public Grade(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
