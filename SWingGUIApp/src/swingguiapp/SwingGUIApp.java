package swingguiapp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Muhammad Tayyab Sheikh <cstayyab@gmail.com>
 * @version 3.0
 */
public class SwingGUIApp {

    public static void main(String[] args) {
        JFrame myWindow = new JFrame("This is the title of JFrame");
        myWindow.setSize(600, 400);
        myWindow.setVisible(true);
        FlowLayout myLayout = new FlowLayout();
        Container myContentPane = myWindow.getContentPane();
        myContentPane.setLayout(myLayout);
        JButton button1 = new JButton("Button 1");
        myContentPane.add(button1);
        JButton button2 = new JButton("Button 2");
        myContentPane.add(button2);
        JButton button3 = new JButton("Button 3");
        myContentPane.add(button3);
    }
}
