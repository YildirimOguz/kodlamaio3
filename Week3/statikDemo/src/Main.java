public class Main {
    public static void main(String[] args) {
    ProductManager productManager = new ProductManager();
    Product product = new Product();
    product.id=10;
    product.name="Laptop";
    product.price=10000;
    productManager.add(product);
    }
}
