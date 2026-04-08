package serilization;  

import java.io.*;

public class Deserialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream(
                new File("D:\\partu\\SEED INFOTECH\\Core Java\\FileDemo\\myfile4.txt"));

        ObjectInputStream ois = new ObjectInputStream(fis);   

        Employee e = (Employee) ois.readObject();
        System.out.println(e);

        ois.close();
    }
}