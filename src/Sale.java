public class Sale {
    private Customer customer;
    String date;
    double serviceExpense;
    double productExpense;

    public Sale(Customer customer, String date, double serviceExpense, double productExpense) {
        this.customer = customer;
        this.date = date;
        this.serviceExpense = serviceExpense;
        this.productExpense = productExpense;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }
    public double getTotalServiceExpense() {
        double discountRate = customer.getServiceMemberDis();
        return serviceExpense * (1 - discountRate);
    }

    public double getTotalProductExpense() {
        double discountRate = customer.getProductMemberDis();
        return productExpense * (1 - discountRate);
    }


}
