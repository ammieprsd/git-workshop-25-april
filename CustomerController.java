public class CustomerController {

    private String firstName;
    private String lastName;
    private String age;
    private String address;

    public CustomerController(String firstName, String lastName, String age, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }
}
