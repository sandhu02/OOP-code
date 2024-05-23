public class Shop {
    public static void main(String[] args) {
        Product p1 = new Product("shampoo", 2300);
        Product p2 = new Product("soap ", 100);

        DiscountedProduct p3 = new DiscountedProduct("snack", 50, 10);
        DiscountedProduct p4 = new DiscountedProduct("sweet",100,20);

        CustomerCart c1 = new CustomerCart();
        c1.addProduct(p1);
        c1.addProduct(p2);
        c1.addProduct(p3);
        c1.addProduct(p4);

        c1.displayTotalBill();
    }
    
}
