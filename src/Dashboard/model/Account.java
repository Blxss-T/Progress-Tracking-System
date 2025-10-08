package Dashboard.model;

public class Account {
    private String userName;
    private String passwordHash;
    private Student student;
    public Account (){}
    public Account (String name,String pw){
        this.userName=name;
        this.passwordHash=pw;

    }

}
