package BesantTech;

import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {
        try {
            FileWriter ref = new FileWriter("D:/testing/test1.txt");
            ref.write("Salmeera");
            ref.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}