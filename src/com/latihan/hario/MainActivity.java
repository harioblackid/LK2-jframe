package com.latihan.hario;

import javax.swing.*;
import java.awt.Container;
import java.awt.BorderLayout;

public class MainActivity extends JFrame {

    private Container button = new Container();
    private JLabel label1;
    private JButton button1, button2, button3, button4, button5;
    
    //Load Variable Image
    
    public MainActivity(String title){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle(title);
        this.setSize(400, 300);
        this.setLocation(200,150);
        this.setVisible(true);
        
        ImageIcon gambar = new ImageIcon(getClass().getResource("MyImage.jpg"));
        
        button = getContentPane();
        label1 = new JLabel("Hario Saloko");
        button2 = new JButton("Tombol 2");
        button3 = new JButton("", gambar);
        button4 = new JButton("Tombol 4");
        button5 = new JButton("Tombol 5");
        
        
        add(label1, BorderLayout.PAGE_START);
        add(button2, BorderLayout.LINE_START);
        add(button3, BorderLayout.CENTER);
        add(button4, BorderLayout.PAGE_END);
        add(button5, BorderLayout.LINE_END);
        
    }
    
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        MainActivity mWindow = new MainActivity("Jendela Utama");
        
    }
}