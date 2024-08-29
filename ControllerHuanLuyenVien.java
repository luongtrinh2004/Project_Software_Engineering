package project_java_group_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControllerHuanLuyenVien {    
    public static void saveData(DefaultTableModel model) {
        File file = new File("coach.csv");
        try (FileWriter fw = new FileWriter(file); BufferedWriter bw = new BufferedWriter(fw)) {
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    bw.write(model.getValueAt(i, j).toString());
                    if (j < model.getColumnCount() - 1) { // Avoid adding comma at the end of the line
                        
                    }
                }
                bw.newLine(); // Move to the next line after writing all columns of the current row
            }
            JOptionPane.showMessageDialog(null, "Data successfully saved to " + file.getAbsolutePath(),
                    "Information", JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException e) {
        }
    }

    public static void loadData(JTable table) {
        try (BufferedReader br = new BufferedReader(new FileReader("coach.csv"))) {
            String line;
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0); // Clear existing data
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                model.addRow(data);
            }
            JOptionPane.showMessageDialog(null, "Data successfully displayed!", "Success",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException e) {
        }
    }
}
