package project_java_group_5;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ViewCauThu {  
    
    //Setup
    private static Object[][] data, data0;   
    private static JFrame frame;
    private static JTable table;
    private static DefaultTableModel model;
    private static JScrollPane scrollPane;
    private static JPanel buttonPanel;
    private static JButton addButton, changeButton, deleteButton, in4, backButton, saveButton;    
    
    public static void view() {     
        data0 = null;
        
        data = ControllerCauThu.loadData(data0);        
       
        frame = new JFrame("Footballer");

        String[] col = { "Name", "Nationality", "Gender", "Date of Birth", "Date of Joining", "Position",
                "Matches", "Goals", "Agreed Salary", "Points from Last 5 Matches" };

        model = new DefaultTableModel(data, col);
        table = new JTable(model);
        table.setFillsViewportHeight(true);
        scrollPane = new JScrollPane(table);
        frame.add(scrollPane);
        frame.setLayout(new BorderLayout());
        frame.add(scrollPane, BorderLayout.CENTER);

        // Use FlowLayout for the button panel with horizontal spacing
        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 50, 10));
        
        //Button
        addButton = new JButton("Add");
        changeButton = new JButton("Edit");
        deleteButton = new JButton("Delete");
        saveButton = new JButton("Save");        
        backButton = new JButton("Back");
        in4 = new JButton("Salary and Bonus Details"); 
             
        buttonPanel.add(addButton);
        buttonPanel.add(changeButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(saveButton);
        buttonPanel.add(in4);
        buttonPanel.add(backButton);        
        changeButton.addActionListener(e -> {

        });                     

        saveButton.addActionListener(e -> {
            

        });

        deleteButton.addActionListener(e -> {
            
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {

            }
        });        

        backButton.addActionListener(e -> {
                                                     
        });                                                    
                            
        // Frame display code not shown
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setSize(1200, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);              
    }
}