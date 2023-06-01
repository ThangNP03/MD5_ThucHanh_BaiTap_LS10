package ra.model;

import javax.validation.constraints.NotEmpty;

public class User {
    @NotEmpty(message = "username không được để trống ")
    private  String username;
    @NotEmpty(message = "password không được để trống ")
    public  String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
