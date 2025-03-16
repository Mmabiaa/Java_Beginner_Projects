package Exception_Handling.File_Reading;

import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadUMaTWebsite {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.umat.edu.gh/");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error fetching website: " + e.getMessage());
        }
    }
}
