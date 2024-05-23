public class Product{
    private String productName;
    private double price;
    public Product(){
        productName="";
        price=0;
    }
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public String getProductName() {
        return productName;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String bill(){
        return "Product Name : "+productName+"\nPrice : "+price+"\n";
    }
}