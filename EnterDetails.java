import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

public class EnterDetails {
    //Declare textfilelds
    static JTextField petTypeField;
    static JTextField breedField;
    static JTextField genderField;
    static JTextField sizeField;
    static JTextField ageField;
    static JTextField petNameField;
    static JTextField ownerNameField;
    static JTextField mobileNumberField;
    static JTextField cityField;
    static JTextField emailField;
    static JTextField descriptionField;

// declare label for image
    static JLabel uploadImageLabel = new JLabel("upload Image of pet");
    static JFileChooser browseImageFile = new JFileChooser();
    static JLabel imageLabel = new JLabel();

    public EnterDetails(){
//declare frame and set layout
        JFrame frame = new JFrame("enter details");
        frame.setSize(600,600);
        frame.setVisible(true);

        JLabel l1 = new JLabel("The PetNest");
        l1.setFont(new Font("Times New Roman",Font.BOLD,24));
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
        frame.setLayout(flow);
        flow.setVgap(20);
        flow.setHgap(20);
        JPanel panel = new JPanel(new GridLayout());
        JPanel panel1 = new JPanel(new GridLayout(1,5,10,10));
        JPanel panel2 = new JPanel(new GridLayout(1,5,10,10));
        JPanel panel3 = new JPanel(new GridLayout(1,5,10,10));
        JPanel panel4 = new JPanel(new GridLayout(1,5,10,10));
        JPanel panel5 = new JPanel(new GridLayout(1,5,10,10));
        JPanel panel6 = new JPanel(new GridLayout(1,5,10,10));
        JPanel panel7 = new JPanel(new GridLayout(1,5,10,10));
        JPanel panel8 = new JPanel(new GridLayout(1,5,10,10));
        JPanel panel9 = new JPanel(new GridLayout(1,5,10,10));


        //insert image labels and text fields for the input entries
        JLabel petTypeLabel = new JLabel("Pet type");
        petTypeField = new JTextField(10);

        JLabel breedLabel = new JLabel("Breed");
        breedField = new JTextField(10);

        JLabel genderLabel = new JLabel("Gender");
        genderField = new JTextField(10);

        JLabel sizeLabel = new JLabel("Size(s/m/l)");
        sizeField = new JTextField(10);

        JLabel ageLabel = new JLabel("Age");
        ageField = new JTextField(10);

        JLabel petNameLabel = new JLabel("Pet Name");
        petNameField = new JTextField(10);

        JLabel ownerNameLabel = new JLabel("Owner Name");
        ownerNameField = new JTextField(10);

        JLabel mobileNumberLabel = new JLabel("Mobile Number");
        mobileNumberField = new JTextField(10);

        JLabel cityLabel = new JLabel("City");
        cityField = new JTextField(10);

        JLabel emailLabel = new JLabel("Email");
        emailField = new JTextField(10);

        JLabel descriptionLabel = new JLabel("Special description");
        descriptionField = new JTextField(10);



        JLabel uploadImageLabel = new JLabel("upload Image of Pet");

        JButton button = new JButton("Upload");
        button.setSize(100,50);

        //button for browse and image upload
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            //add image to the frame
                FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES","png","jpg","jpeg");
                browseImageFile.addChoosableFileFilter(fnef);
                int showOpenDialogue = browseImageFile.showOpenDialog(null);

                if(showOpenDialogue == JFileChooser.APPROVE_OPTION){
                    File selectedImageFile = browseImageFile.getSelectedFile();
                    String selectedImagePath =  selectedImageFile.getAbsolutePath();
                    JOptionPane.showMessageDialog(null,"Image has been uploaded successfully");
                    ImageIcon ii = new ImageIcon(selectedImagePath);
                    Image image = ii.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
                    imageLabel.setIcon(new ImageIcon(image));

                }
            }
        });

        JButton serviceButton = new JButton("Enter previous records");
        serviceButton.setSize(50,50);
        serviceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GroomingRecords serviceRecords = new GroomingRecords();
            }
        });

        JButton submit = new JButton("Submit");
        //add aaction listener to button
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //checks for validation
                if(petTypeField.getText().compareTo("")==0){
                    JOptionPane.showMessageDialog(frame,"You must enter the pet type ","The PetNest",JOptionPane.ERROR_MESSAGE);
                    petTypeField.requestFocus();
                    return;
                }
                else if(!petTypeField.getText().equals("cat") && !petTypeField.getText().equals("dog")){
                    JOptionPane.showMessageDialog(frame,"The pet type must be cat and dog ","The PetNest",JOptionPane.ERROR_MESSAGE);
                    sizeField.requestFocus();
                    return;
                }
                if(breedField.getText().compareTo("")==0){
                    JOptionPane.showMessageDialog(frame,"You must enter the breed name","The PetNest",JOptionPane.ERROR_MESSAGE);
                    breedField.requestFocus();
                    return;
                }
                if(genderField.getText().compareTo("")==0){
                    JOptionPane.showMessageDialog(frame,"You must enter the gender","The PetNest",JOptionPane.ERROR_MESSAGE);
                    genderField.requestFocus();
                    return;
                }
                if(sizeField.getText().compareTo("")==0){
                    JOptionPane.showMessageDialog(frame,"You must enter the size ","The PetNest",JOptionPane.ERROR_MESSAGE);
                    sizeField.requestFocus();
                    return;
                }

                //conditional statement for size of pet must be s/m/l
                else if(!sizeField.getText().equals("s") && !sizeField.getText().equals("m") && !sizeField.getText().equals("l")){
                    JOptionPane.showMessageDialog(frame,"The size must be s/m/l ","The PetNest",JOptionPane.ERROR_MESSAGE);
                    sizeField.requestFocus();
                    return;
                }
                if(ageField.getText().compareTo("")==0){
                    JOptionPane.showMessageDialog(frame,"You must enter the age ","The PetNest",JOptionPane.ERROR_MESSAGE);
                    ageField.requestFocus();
                    return;
                }
                if(petNameField.getText().compareTo("")==0){
                    JOptionPane.showMessageDialog(frame,"You must enter the pet name","The PetNest",JOptionPane.ERROR_MESSAGE);
                    petNameField.requestFocus();
                    return;
                }
                if(ownerNameField.getText().compareTo("")==0){
                    JOptionPane.showMessageDialog(frame,"You must enter the owner name ","The PetNest",JOptionPane.ERROR_MESSAGE);
                    ownerNameField.requestFocus();
                    return;
                }
                if(mobileNumberField.getText().compareTo("")==0){
                    JOptionPane.showMessageDialog(frame,"You must enter the mobile number","The PetNest",JOptionPane.ERROR_MESSAGE);
                    mobileNumberField.requestFocus();
                    return;
                }
                if(cityField.getText().compareTo("")==0){
                    JOptionPane.showMessageDialog(frame,"You must enter the city ","The PetNest",JOptionPane.ERROR_MESSAGE);
                    cityField.requestFocus();
                    return;
                }
                if(emailField.getText().compareTo("")==0){
                    JOptionPane.showMessageDialog(frame,"You must enter the email","The PetNest",JOptionPane.ERROR_MESSAGE);
                    emailField.requestFocus();
                    return;
                }
                if(descriptionField.getText().compareTo("")==0){
                    JOptionPane.showMessageDialog(frame,"You must enter the description","The PetNest",JOptionPane.ERROR_MESSAGE);
                    descriptionField.requestFocus();
                    return;
                }

                if(imageLabel.getIcon()==null){
                    JOptionPane.showMessageDialog(frame,"You must upload the image ","The PetNest",JOptionPane.ERROR_MESSAGE);
                    return;
                }


                JOptionPane.showMessageDialog(frame,"Congratulations!!! your appointment is booked","submitted",JOptionPane.INFORMATION_MESSAGE);
                frame.dispose();
            }
        });

        //add the panels and entries to the frame
        panel.add(l1);
        frame.add(panel);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel5);
        frame.add(panel6);
        frame.add(panel7);
        frame.add(panel8);
        frame.add(panel9);

        panel1.add(petTypeLabel);
        panel1.add(petTypeField);
        panel1.add(breedLabel);
        panel1.add(breedField);
        panel2.add(genderLabel);
        panel2.add(genderField);
        panel2.add(sizeLabel);
        panel2.add(sizeField);
        panel3.add(ageLabel);
        panel3.add(ageField);
        panel3.add(petNameLabel);
        panel3.add(petNameField);
        panel4.add(ownerNameLabel);
        panel4.add(ownerNameField);
        panel4.add(mobileNumberLabel);
        panel4.add(mobileNumberField);
        panel5.add(cityLabel);
        panel5.add(cityField);
        panel5.add(emailLabel);
        panel5.add(emailField);
        panel6.add(descriptionLabel);
        panel6.add(descriptionField);

        panel8.add(uploadImageLabel);
        panel8.add(button);
        panel8.add(imageLabel);
        panel9.add(serviceButton);
        panel9.add(submit);
    }
}
