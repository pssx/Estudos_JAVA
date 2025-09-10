package file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterr {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("C:\\Users\\vinicius\\Desktop\\Course\\java-1\\Course\\src\\file\\texto.txt");
            writer.write("Roses are red \nViolets are blue \nBooty booty booty booty \nRockin' everywhere!");
            writer.append("\n(A poem by Bro)");
            writer.close();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
