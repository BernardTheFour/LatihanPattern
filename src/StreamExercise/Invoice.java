package StreamExercise;

public class Invoice {
    int id;
    Customer customer;
    String customerTitle;
    int amount;

    public Invoice(int id, Customer customer, String title, int amount){
        this.id = id;
        this.customer = customer;
        this.customerTitle = title;
        this.amount = amount;
    }

    public enum Customer{ORACLE, ETERNAL, UBISOFT}

    public int getId() {
        return id;
    }

    public Customer getCustomer(){
        return customer;
    }

    public String getTitle(){
        return customerTitle;
    }

    public int getAmount(){
        return amount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", customer=" + customer +
                ", customerTitle='" + customerTitle + '\'' +
                ", amount=" + amount +
                '}';
    }
}
