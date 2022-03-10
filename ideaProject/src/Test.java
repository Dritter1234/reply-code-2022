import java.io.*;
import java.util.Scanner;

public class Test {

    public static void main(String args[]) throws IOException {

        Test javaClassExample = new Test();
        javaClassExample.readFromInputStream();
    }

    private void readFromInputStream()
            throws IOException {
        try {
            String folder = "src/inputs/";
            String filename = "00-example.txt";
            File file = new File(folder+filename);
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
