import java.util.List;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class FileReader {
//Clase para leer los archivos
    public static List<String> readExpressions(String filePath) {
        List<String> expresiones = new ArrayList<>();
        try {
            expresiones = Files.readAllLines(Paths.get(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return expresiones;
    }
}
