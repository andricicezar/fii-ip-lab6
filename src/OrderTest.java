import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class OrderTest {

    @Test
    public void getId() {
    }

    @Test
    public void getUserId() {
    }

    @Test
    public void getProductsId() {
    }

    @Test
    public void setProductsId(List<Integer> products_id) {
        assert(products_id.size()==0 || products_id.size()>100);
        for(int i=0; i<products_id.size();i++) {
            assert (products_id.get(i) >= 0);
        }
    }

    @Test
    public void setUserId(Integer user_id) {
        assert(user_id>=0);
    }

    @Test
    public void getOrder() {
    }

    @Test
    public void create() {
        try {
            Order.create(201, 100, 101, 105);
            Assert.fail("User neexistent");
        } catch (Exception e) {

        }

        try {
            Order.create(200, 100, 101, 105);
            Assert.fail("Produs neexistent");
        } catch (Exception e) {

        }


        try {
            Order.create(200,);
            Assert.fail("Produs nedat");
        } catch (Exception e) {

        }

        try {
            Order.create(200, 1);
        } catch (Exception e) {
            Assert.fail("Create failed");
        }
    }
}