public class CarItem {
    private int id;
    private int quantity;
    // associação todo-parte
    // Product é o objeto parte
    // CarItem é o objeto todo
    private Product product;

    public CarItem() {
    }
    // agregação - Product não depende do CarItem para ser criado
    public CarItem(int id, int quantity, Product product) {
        this.setId(id);
        this.setQuantity(quantity);
        this.setProduct(product);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    // agregação - Product não depende do CarItem para ser criado
    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "CarItem{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", product=" + product +
                '}';
    }
}
