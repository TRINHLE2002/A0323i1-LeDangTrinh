package codegym.ungdungquanlykhunghiduongfurama.model;

public class CustomerType {
    private String customer_type;

    public CustomerType() {
    }

    public CustomerType(String customer_type) {
        this.customer_type = customer_type;
    }

    public String getCustomer_type() {
        return customer_type;
    }

    public void setCustomer_type(String customer_type) {
        this.customer_type = customer_type;
    }

    @Override
    public String toString() {
        return "CustomerType{" +
                "customer_type='" + customer_type + '\'' +
                '}';
    }
}
