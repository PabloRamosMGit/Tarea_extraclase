//Otro ejemplo de Ejemplo de Checked exception el cual lee un archivo txt y se tiene que usar varios try y catch para manejar
// las excepciones de tipo Checked
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
