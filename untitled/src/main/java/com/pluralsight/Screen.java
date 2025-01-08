package com.pluralsight;
import javax.swing.*;
import java.awt.*;

public class Screen {
    public static void  gameScreen(){
        JFrame frame = new JFrame();
        frame.setTitle("Journey");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(0x0));
    }

}
