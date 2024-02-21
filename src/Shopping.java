public class Shopping {
    public static void main(String[] args) {
        Customer premiumCustomer = new Customer("Premium", "Gold");
        Sale sale1 = new Sale(premiumCustomer, "2024-02-21", 100, 200);
        System.out.println("Total service expense after discount: $" + sale1.getTotalServiceExpense());
        System.out.println("Total product expense after discount: $" + sale1.getTotalProductExpense());
    }
}
