/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.groupid.helloworld;
import javax.swing.*;

/**
 *
 * @author YASEEN
 */
public class HelloWorld extends JFrame{
    
    JButton btn; JLabel lbl;
    JPanel panel;
    public HelloWorld(){
        btn = new JButton();
        lbl = new JLabel();
        btn.setText("Click me!");
        setTitle("Hello world from Swing");
        panel = new JPanel();
        btn.setToolTipText("Click the button!");
        
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        panel.add(btn);
        panel.add(lbl);
        add(panel);
        
        btn.addMouseListener(new java.awt.event.MouseAdapter(){
            @Override
            public void mouseClicked(java.awt.event.MouseEvent ae){
                btnMouseClicked(ae);
            }
        });
    }
    
    private void btnMouseClicked(java.awt.event.MouseEvent ae){
        lbl.setText("Hello World!");
    }
    
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new HelloWorld();
            }
        });
        
    }
    
}
