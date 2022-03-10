import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test {

    //main method will be called first when program is executed
    public static void main(String args[]){
    /*
    Syntax of java object creation is,
    <class-name> object-name = new <class-constructor>;
    */
      /*  JavaClassExample javaClassExample = new JavaClassExample();
        //set name member of this object
        javaClassExample.setName("Visitor");
        // print the name
        System.out.println("Hello " + javaClassExample.getName()); */
    }

    private String readFromInputStream(InputStream inputStream)
            throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br
                     = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();
    }
}
