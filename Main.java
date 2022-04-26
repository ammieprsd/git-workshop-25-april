public class Main {
    public static void main(String[] args) {

        CustomerController customerController = new CustomerController("Martijn", "De Vries", 65, "The Hague");
        customerController.setFirstName("Ammie");
        System.out.println(customerController.getFirstName());

    }
}
