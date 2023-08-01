public class Customer {
    public static void main(String[] args) {

        // reference types
        Customer k3, k4;
        k3 = new Customer();
        k4 = k3;
        boolean e8 = k3 == k4;
        System.out.println(e8);

    }
}