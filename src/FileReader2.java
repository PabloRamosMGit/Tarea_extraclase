//Otro ejemplo de Ejemplo de Checked exception
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FileReader2 {
    public void FileReader() {
        File ExampleFIle= new File("C:src\\Text.txt");
        FileReader fr=null;
        try {
            fr=new FileReader(ExampleFIle);
            int cont;
            while((cont=fr.read())!=-1){
                System.out.print((char) cont);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
