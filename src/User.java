public class User {
    private Integer id;
    private String username;
    private String email;


    public static User getUser(Integer id) {
        return DataBase.getInstance().getUser(id);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setId(Integer id) { this.id = id; }

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