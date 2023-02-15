

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

//main class of the program
public class Pet {

    private static JLabel title = new JLabel("Welcome to The PetNest");
    private static JButton b1 = new JButton("Book an appointment");
    private static JButton b2 = new JButton("show appointment details");



    public static void main(String[] args) throws IOException {
//declare the frame and set layouts
        JFrame frame = new JFrame("Pet");
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setLayout(null);
        title.setBounds(120,100,300,80);
        title.setFont(new Font("Times New Roman",Font.BOLD,24));
        frame.add(title);
        b1.setBounds(60,200,180,50);
        frame.add(b1);
        b2.setBounds(250,200,180,50);
        frame.add(b2);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EnterDetails enter = new EnterDetails();
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DisplayDetails display = new DisplayDetails();
            }
        });
    }
}
