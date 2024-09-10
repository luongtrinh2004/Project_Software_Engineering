package project_java_group_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

public class ControllerCauThu {
    public static void saveTableModelToFile(DefaultTableModel model, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (int row = 0; row < model.getRowCount(); row++) {
                for (int col = 0; col < model.getColumnCount(); col++) {
                    writer.write(model.getValueAt(row, col).toString());
                    if (col < model.getColumnCount() - 1) {
                        
                    }
                }

                writer.write("\n");
            }
        } catch (IOException e) {
            
        }
    }       

    public static Object[][] loadData(Object[][] data) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Data.csv"));
            String line = br.readLine();
            int rowCount = 0;

            // Count the number of lines in the file to determine the array size
            while (line != null) {
                rowCount++;
                line = br.readLine();
            }

            br.close();
            br = new BufferedReader(new FileReader("Data.csv"));

            // Initialize the data array with the determined size
            data = new Object[rowCount][10];

            int rowIndex = 0;

            // Read data from the file and populate the array
            while ((line = br.readLine()) != null) {
                String[] value = line.split(",");
                for (int i = 0; i < value.length; i++) {
                    data[rowIndex][i] = value[i];
                }
                rowIndex++;
            }

            br.close();
        } catch (Exception e) {
            
        }
        return data;
    }    
}
