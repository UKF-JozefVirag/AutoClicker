package com.jv;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class mainForm {
    private JPanel panel1;
    private JTextField textField1;
    private JButton submitButton;
    private JTextField timeBetweenClicksTextField;
    private JLabel CountDown;



    public mainForm() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    
                    if(textField1.getText().isEmpty()|| timeBetweenClicksTextField.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Input is empty");
                    }
                    int x = Integer.parseInt(textField1.getText());
                    int y = Integer.parseInt(timeBetweenClicksTextField.getText());

                    BotClick bott = new BotClick(x,y);
                }catch (Exception exc){
                    System.out.println("Chyba " + exc);
                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new mainForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setMinimumSize(new Dimension(400,500));
        frame.setResizable(false);

        frame.setFocusable(false);
        frame.pack();
        frame.setVisible(true);
    }


}
