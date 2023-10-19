package org.example;

import javax.swing.*;
import java.awt.*;

public class ModTeamGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
    private static void createAndShowGUI(){
        JFrame frame = new JFrame("Mod Team");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);


        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JLabel titleLabel = new JLabel("Mod Team");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));

    }


}