package com.dev.serialization;

import java.io.*;

public class SerializableObject {

    public static void main(String[] args) {
        try {
            // Create object
            Person person = new Person("John", 30);

            // Serialize the object to a file
            FileOutputStream fileOut = new FileOutputStream("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);
            out.close();
            fileOut.close();

            System.out.println("Object serialized successfully!");
        } catch (IOException i) {
            i.printStackTrace();
        }

    }


}
