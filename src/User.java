public class User {
    private Integer id;
    private String username;
    private String email;


    public static User getUser(Integer id) {
        return BD.getUser(id);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public Integer getId() {
        return id;
    }
}