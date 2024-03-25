import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class Users {

    private Integer userid;
    private  String fullname;
    private  String email;
    private  String password;


    //if u have different columns name u have to define it using annotation - @Column(name="Column_name")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
