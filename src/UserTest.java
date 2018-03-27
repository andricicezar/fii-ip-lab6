import org.testng.annotations.Test;

public class UserTest {

    @org.junit.Test
    public void getUser() {

    }

    @org.junit.Test
    public void setEmail(String email) {
        assert(email.contains("."));
        assert(email.contains("@"));
        assert(email.contentEquals(""));
        assert(email.length()==0 || email.length()>100);
    }

    @org.junit.Test
    public void setUsername(String username) {
        assert(username.contentEquals(""));
        assert(username.length()==0 || username.length()>100);
    }

    @org.junit.Test
    public void getEmail() {
    }

    @Test
    public void getUsername() {
    }

    @org.junit.Test
    public void getId() {
    }
}