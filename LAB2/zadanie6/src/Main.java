class Invoice {
    private String product_number;
    private int quantity;
    private double pricePerItem;
    private String product_description;

    public Invoice(String product_number, String product_description, int quantity, double pricePerItem) {
        this.product_number = product_number;
        this.product_description = product_description;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getProduct_number() {
        return product_number;
    }

    public void setProduct_number(String product_number) {
        this.product_number = product_number;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public double amount() {
        if (pricePerItem < 0 || quantity < 0) return 0;
        return quantity * pricePerItem;
    }

    public static void main(String[] args) {
        Invoice invoice = new Invoice("12093123321", "Bread", 12, 3);
        Invoice invoice2 = new Invoice("12093123321", "Bread", -1, 3);
        Invoice invoice3 = new Invoice("12093123321", "Bread", 12, -23);
        System.out.println("product_number: "+invoice.product_number+",product_description: "+invoice.product_description+", quantity: "+invoice.quantity+", price_per_item"+invoice.pricePerItem);
        System.out.println("product_number: "+invoice2.product_number+",product_description: "+invoice2.product_description+", quantity: "+invoice2.quantity+", price_per_item"+invoice2.pricePerItem);
        System.out.println("product_number: "+invoice3.product_number+",product_description: "+invoice3.product_description+", quantity: "+invoice3.quantity+", price_per_item"+invoice3.pricePerItem);

    }
}