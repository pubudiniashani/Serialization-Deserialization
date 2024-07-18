# Serialization and Deserialization in Java

The mechanism of converting the state of an object into a byte stream is known as Serialization. Deserialization is the reverse of serialization and converts the byte stream back to the original object.
ObjectOutputStream and ObjectInputStream classes help to serialize and deserialize an object respectively.

## Serialization
Serialization is the process of converting an object's state into a byte stream.So it can easily save to a file , send through a network or stored in a database.

### Advantages of serialization

1) Ensures that the state of an object is preserved, making it easy to store and reload.

2) Platform independent.

3) Simplifies the exchange of data between systems and applications

4) Easy to understand and customize.

5) Provide secure method to handle data in java applications.

### Mechanism of serialization

 1] First implement the **Serializable** interface.This is a marker interface.

 2] Use an ObjectOutputStream to create a stream where the serialized object will be written.

 3] Use the writeObject method of ObjectOutputStream to convert the object into a byte stream and write it to the output stream.

## Deserialization 

 Deserialization is the opposite of serialization. Deserialization is the process of converting a byte stream back into a copy of the original object. 
 This allows the reconstruction of the object from the serialized form.

### Advantages of deserialization

 1. It helps to reconstruct the object from the byte stream.

 2. Simple to customize.

 3. Built-in feature of Java, no third-party tool is required.  

### Mechanism of deserialization

 1] Create an Input Stream.
 
 2] Use an ObjectInputStream connected to an underlying FileInputStream or another input stream.
 
 3] Use ObjectInputStream is used to convert the byte stream back into an object.
  

