public class DiscountedProduct extends Product{
    private double discount;
    public DiscountedProduct(String productName, double price,double discount) {
        super(productName, price);
        this.discount = discount;
    }
    public DiscountedProduct(){
        super();
        discount=0;
    }
    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscountedPrice(){
        return getPrice()-getDiscount();
    }

    public String bill(){
        return super.bill()+"Discount : "+discount+"\nDiscounted Price : "+(getPrice()-discount)+"\n";
    }
}
