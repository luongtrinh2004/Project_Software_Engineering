package project_java_group_5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Login {    
    public static void view() {
        try {
            // Set a modern look and feel
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        JFrame frame = new JFrame("Login");
        JLabel lbl1 = new JLabel("Username : ");
        JLabel lbl2 = new JLabel("Password : ");
        lbl1.setBounds(50, 50, 100, 30);
        lbl2.setBounds(50, 100, 100, 30);
        JTextField username = new JTextField();
        JPasswordField password = new JPasswordField();
        username.setBounds(150, 50, 150, 30);
        password.setBounds(150, 100, 150, 30);
        JButton login = new JButton("Login");
        login.setBounds(100, 150, 80, 30);
        frame.add(lbl1);
        frame.add(lbl2);
        frame.add(username);
        frame.add(password);
        frame.add(login);                
        
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tendangnhap = username.getText();
                String mk = String.valueOf(password.getPassword());

                if (tendangnhap.equals("team7") && mk.equals("123")) {
                    new Menu().setVisible(true);
                    frame.dispose();                    
                }                
                else {
                    JOptionPane.showMessageDialog(frame, "Failed !");
                }
            }
        });               
        
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
    }      
}