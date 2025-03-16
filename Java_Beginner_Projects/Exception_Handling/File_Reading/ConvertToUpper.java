package Exception_Handling.File_Reading;

import java.io.*;

public class ConvertToUpper {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new FileReader("input.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("Out.txt"))
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line.toUpperCase());
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

