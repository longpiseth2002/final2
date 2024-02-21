public class Customer implements DiscountRate {
    String customerName;
    String productType;

    public Customer() {
    }

    public Customer(String customerName, String productType) {
        this.customerName = customerName;
        this.productType = productType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Override
    public double getServiceMemberDis() {
        switch (productType) {
            case "Premium":
                return 0.20; // 20% discount
            case "Gold":
                return 0.15; // 15% discount
            case "Silver":
                return 0.10; // 10% discount
            default:
                return 0; // 0% discount for Normal
        }
    }

    @Override
    public double getProductMemberDis() {
        switch (productType) {
            case "Premium":
            case "Gold":
            case "Silver":
                return 0.10; // 10% discount for Premium, Gold, and Silver
            default:
                return 0; // 0% discount for Normal
        }
    }
}
