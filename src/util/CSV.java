package util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSV {

    /*
     * Read data, then return list of input
     */
    public static List<String[]> get(String fileName) {
        List<String[]> data = new ArrayList<String[]>();

        String testRow;
        try {

            // Open and read
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            // Read data (if it is not empty)
            // Parse by comma with .split()
            // Place into temporary array, then add to list
            while ((testRow = br.readLine()) != null) {
                String[] line = testRow.split(",");
                data.add(line);
            }

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found " + fileName);
        } catch (IOException e) {
            System.out.println("ERROR: Could not read " + fileName);
        }

        return data;
    }
}
