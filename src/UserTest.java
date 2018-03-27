import org.junit.Assert;
import org.testng.annotations.Test;

public class UserTest {

    @org.junit.Test
    public void getUser() {

    }

    @org.junit.Test
    public void setEmail() {
        User user = new User();
        user.setEmail("asdfasdfdsa");
        if (user.getEmail() == "asdfasdfdsa")
            Assert.fail("Nu s-a setat email-ul.");
        if (!user.getEmail().contains(".") || !user.getEmail().contains("@"))
            Assert.fail("Email invalid");
    }

    @org.junit.Test
    public void setUsername() {
        User user = new User();
        user.setUsername("asdfasdfdsa");
        if (user.getUsername() == "asdfasdfdsa")
            Assert.fail("Nu s-a setat numele.");
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