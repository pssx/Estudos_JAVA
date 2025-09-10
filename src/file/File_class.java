package file;

import java.io.File;

public class File_class {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\vinicius\\Desktop\\Course\\java-1\\Course\\src\\file\\texto.txt");

        if (file.exists()){
            System.out.println("yes,exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.isFile());
            //file.delete();

        }else {
            System.out.println("no");
        }



    }
}
