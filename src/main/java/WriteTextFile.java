import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
    public static void main(String[] args) {
        String filePath = "D:\\project\\excelsheet\\WriteTextFile.txt";  // Specify the file to write to

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            // Writing lines to the file
            bw.write("This is the first line of the text file.");
            bw.newLine();  // Adds a new line
            bw.write("Java is great for file handling!");
            bw.newLine();
            bw.write("This file will be read by our Java program.");

            System.out.println("Text file written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
