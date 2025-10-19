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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Account{" +
                "userName='" + userName + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", student=" + student +
                '}';
    }
}
