public class CustomerCart {
    private Product[] products; 
    private int top;
    public CustomerCart(){
        products=new Product[1];
        top=-1;
    }
    
    public void addProduct(Product product){
        if (top==products.length-1){
            Product[] newArr=new Product[(products.length)*2];
            for (int i=0;i<products.length;i++){
                newArr[i] = products[i];
            }
            products=newArr;
        }
        products[++top]=product;
    }

    public void displayTotalBill(){
        for (Product i : products){
            System.out.println(i.bill());
        }
        numberOfProducts();
        System.out.println();
        numberOfDiscounted();
        double Totalprice=0;
        for (Product i : products){
            if (i instanceof DiscountedProduct){
                DiscountedProduct j = (DiscountedProduct) i;
                Totalprice += j.getDiscountedPrice();
            }
            else {
                Totalprice+=i.getPrice();
            }
        }
        System.out.println("Total price : "+Totalprice);
    }

    public void numberOfProducts(){
        if (products.length==0){
            System.out.println("No Product in cart");
            return;
        }
        System.out.println("Number of Products is : "+products.length);
    }

    public void numberOfDiscounted(){
        if (products.length==0){
            System.out.println("No Product in cart");
            return;
        }
        int count=0;
        for (Product i : products){
            if (i instanceof DiscountedProduct){
                count++;
            }
        }
        System.out.println("Number of discounted products is  : "+count);
    }
}
