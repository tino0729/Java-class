import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class FileOut {
    public static void main(String[] args) {
        Path file = Paths.get("C:\\Java\\Chapter.11\\Grades.txt");
        String s = "ABCDF";
        byte[] data = s.getBytes();

        try (OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE))) {
            output.write(data);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
