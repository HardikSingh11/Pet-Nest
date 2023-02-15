import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GroomingRecords  {
    public static ArrayList<GroomingRecordsEntries> list = new ArrayList<>();

    JFrame frame1 = new JFrame("previous records");
    JLabel l1 = new JLabel("Please enter the previous grooming records");
    JPanel panel1 = new JPanel(new GridLayout());
    JPanel panel2 = new JPanel(new GridLayout());
    JPanel panel3 = new JPanel(new GridLayout());
    JPanel panel4 = new JPanel(new GridLayout());
    JPanel panel5 = new JPanel(new GridLayout());
    JPanel panel6 = new JPanel(new GridLayout(1,1,50,10));

    JLabel groomingNumberLabel = new JLabel("Grooming number");
    JTextField groomingNumberField = new JTextField(15);

    JLabel dateLabel = new JLabel("date");
    JTextField dateField = new JTextField(15);

    JLabel costLabel = new JLabel(" Cost in '$'");
    JTextField costField = new JTextField(15);

    JLabel reviewsLabel = new JLabel("reviews");
    JTextField reviewsField = new JTextField(15);

    JButton submitButton = new JButton("Submit");
    JButton cancelButton = new JButton("Cancel");

    GroomingRecords(){
        frame1.setSize(500,500);
        FlowLayout flow = new FlowLayout();
        frame1.setLayout(flow);
        flow.setVgap(20);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //check entries validation
                if(groomingNumberField.getText().compareTo("")==0){
                    JOptionPane.showMessageDialog(frame1,"You must enter the service no ","The PetNest",JOptionPane.ERROR_MESSAGE);
                    groomingNumberField.requestFocus();
                    return;
                }
                if(dateField.getText().compareTo("")==0){
                    JOptionPane.showMessageDialog(frame1,"You must enter the date ","The PetNest",JOptionPane.ERROR_MESSAGE);
                    dateField.requestFocus();
                    return;
                }
                if(costField.getText().compareTo("")==0){
                    JOptionPane.showMessageDialog(frame1,"You must enter the cost ","The PetNest",JOptionPane.ERROR_MESSAGE);
                    costField.requestFocus();
                    return;
                }
                if(reviewsField.getText().compareTo("")==0){
                    JOptionPane.showMessageDialog(frame1,"You must enter the reviews ","The PetNest",JOptionPane.ERROR_MESSAGE);
                    reviewsField.requestFocus();
                    return;
                }
                //store service records
                GroomingRecordsEntries groomingRecordsEntries = new GroomingRecordsEntries(
                        Integer.parseInt(groomingNumberField.getText()),
                        dateField.getText(),Integer.parseInt(costField.getText()),
                        reviewsField.getText());
                list.add(groomingRecordsEntries);

                JOptionPane.showMessageDialog(frame1,"your details have been saved \n you can add more ","submitted",JOptionPane.INFORMATION_MESSAGE);
                //empty the entries column
                groomingNumberField.setText("");
                dateField.setText("");
                costField.setText("");
                reviewsField.setText("");
                groomingNumberField.requestFocus();


            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame1.dispose();
            }
        });
        //add panels and entries to frame
        frame1.add(panel1);
        frame1.add(panel2);
        frame1.add(panel3);
        frame1.add(panel4);
        frame1.add(panel5);
        frame1.add(panel6);

        panel1.add(l1);
        panel2.add(groomingNumberLabel);
        panel2.add(groomingNumberField);
        panel3.add(dateLabel);
        panel3.add(dateField);
        panel4.add(costLabel);
        panel4.add(costField);
        panel5.add(reviewsLabel);
        panel5.add(reviewsField);
        panel6.add(submitButton);
        panel6.add(cancelButton);
        frame1.setVisible(true);

    }
}
