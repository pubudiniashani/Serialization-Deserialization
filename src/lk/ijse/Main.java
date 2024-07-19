package lk.ijse;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("ashu",24);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("customer.ser"))) {
            out.writeObject(customer);
            System.out.println("Customer has been serialized: " + customer);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("customer.ser"))) {
            Customer deserializedCustomer = (Customer) in.readObject();
            System.out.println("Customer has been deserialized: " + deserializedCustomer);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
