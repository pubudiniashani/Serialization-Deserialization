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
            Customer deserializedProduct = (Customer) in.readObject();
            System.out.println("Customer has been deserialized: " + deserializedProduct);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
