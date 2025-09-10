package file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderr {
    public static void main(String[] args) {
        // FileReader = read the contents of a file as aa stream of characters. One by one
        //              read() returns an int value which contains the byte value
        //              when read() returns -1, there id no more data to be read

        try {
            FileReader reader = new FileReader("C:\\Users\\vinicius\\Desktop\\Course\\java-1\\Course\\src\\file\\texto.txt");
            int data = reader.read();
            while(data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
