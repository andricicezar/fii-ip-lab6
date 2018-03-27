public class Application {

    getProduct(int idProduct) {
        return Product.getProduct(idProduct);
    }

    getUser(int idUser) {
        return User.getUser(idUser);
    }

    createOrder(int idOrder) {
        return Order.getOrder(idOrder);
    }
}
