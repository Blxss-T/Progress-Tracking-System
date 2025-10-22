package Dashboard.UserAuth;

import java.time.LocalDate;

public class user {
private String names;
private String email;
private String password;
private LocalDate dob;

public user(){}
    public user(String name, String gmail,String password,LocalDate date){
    this.names=name;
    this.email=gmail;
    this.password=password;
    this.dob=date;
    }
    public void setNames(String names){
    this.names=names;
    }
    public String getNames(){
    return this.names;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
