import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayDetails  {
    DisplayDetails(){

        //declaration of frames and panels and set layouts
        JFrame frame = new JFrame("Display details");
        frame.setSize(500,500);

        JLabel l1 = new JLabel("The PetNest");
        l1.setFont(new Font("Times New Roman",Font.BOLD,24));
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
        frame.setLayout(flow);
        flow.setVgap(10);
        flow.setHgap(50);
        frame.setLayout(new GridLayout(10,1));
        JPanel panel = new JPanel(new GridLayout());
        JPanel panel1 = new JPanel(new GridLayout());
        JPanel panel2 = new JPanel(new GridLayout());
        JPanel panel3 = new JPanel(new GridLayout());
        JPanel panel4 = new JPanel(new GridLayout());
        JPanel panel5 = new JPanel(new GridLayout());
        JPanel panel6 = new JPanel(new GridLayout());
        JPanel panel7 = new JPanel(new GridLayout());
        JPanel panel8 = new JPanel(new GridLayout());
        JPanel panel9 = new JPanel();

        JLabel petTypeLabel = new JLabel("Pet type:-");
        JLabel petTypeName = new JLabel(EnterDetails.petTypeField.getText());

        JLabel breedLabel = new JLabel("breed:-");
        JLabel breedName = new JLabel(EnterDetails.breedField.getText());

        JLabel genderLabel = new JLabel("gender:-");
        JLabel gender = new JLabel(EnterDetails.genderField.getText());

        JLabel sizeLabel = new JLabel("size:-");
        JLabel size = new JLabel(EnterDetails.sizeField.getText());
        //cost declaration of different pet
        int sdCost = 15;
        int mdCost = 22;
        int ldCost = 30;
        int scCost = 12;
        int mcCost = 28;
        int lcCost = 25;

        JLabel costLabel = new JLabel("cost in $:-");



        JLabel ageLabel = new JLabel("age:-");
        JLabel age = new JLabel(EnterDetails.ageField.getText());

        JLabel petNameLabel = new JLabel("pet name:-");
        JLabel petName = new JLabel(EnterDetails.petNameField.getText());

        JLabel ownerNameLabel = new JLabel("owner name:-");
        JLabel ownerName = new JLabel(EnterDetails.ownerNameField.getText());

        JLabel mobileNumberLabel = new JLabel("mobile number:-");
        JLabel mobileNumber = new JLabel(EnterDetails.mobileNumberField.getText());

        JLabel cityLabel = new JLabel("city:-");
        JLabel city = new JLabel(EnterDetails.cityField.getText());

        JLabel emailLabel = new JLabel("Email:-");
        JLabel email = new JLabel(EnterDetails.emailField.getText());

        JLabel descriptionLabel = new JLabel("special description:-");
        JLabel description = new JLabel(EnterDetails.descriptionField.getText());

//        JLabel serviceTypeLabel = new JLabel("service type:-");
//        JLabel serviceType = new JLabel(EnterDetails.serviceTypeField.getText());



        JLabel carImageLabel = new JLabel("Pet Image:-");
        JLabel carImage = new JLabel(EnterDetails.imageLabel.getIcon());
        carImage.setSize(150,150);
        JButton serviceButton = new JButton("Display all previous recorsd");
        serviceButton.setSize(50,50);
        serviceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GroomingRecordDetails groomingRecorddetails = new GroomingRecordDetails();
            }
        });
        JButton cancelButton = new JButton("Cancel");

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });



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
// add labels to the panel
        panel.add(l1);
        panel1.add(petTypeLabel);
        panel1.add(petTypeName);
        panel1.add(breedLabel);
        panel1.add(breedName);
        panel2.add(genderLabel);
        panel2.add(gender);
        panel2.add(sizeLabel);
        panel2.add(size);
        panel3.add(ageLabel);
        panel3.add(age);
        panel3.add(petNameLabel);
        panel3.add(petName);
        panel4.add(ownerNameLabel);
        panel4.add(ownerName);
        panel4.add(mobileNumberLabel);
        panel4.add(mobileNumber);
        panel5.add(cityLabel);
        panel5.add(city);
        panel5.add(emailLabel);
        panel5.add(email);
        panel6.add(descriptionLabel);
        panel6.add(description);
        panel8.add(carImageLabel);
        panel8.add(carImage);
        panel8.add(costLabel);

// if else loop for the cost
        if(EnterDetails.sizeField.getText().equals("s")){
            if(EnterDetails.petTypeField.getText().equalsIgnoreCase("cat")) {
                JLabel cost = new JLabel(String.valueOf(scCost));
                panel8.add(cost);
            }else if(EnterDetails.petTypeField.getText().equalsIgnoreCase("dog")){
                JLabel cost = new JLabel(String.valueOf(sdCost));
                panel8.add(cost);
            }
        }else if(EnterDetails.sizeField.getText().equals("m")){
            if(EnterDetails.petTypeField.getText().equalsIgnoreCase("cat")) {
                JLabel cost = new JLabel(String.valueOf(mcCost));
                panel8.add(cost);
            }else if(EnterDetails.petTypeField.getText().equalsIgnoreCase("dog")){
                JLabel cost = new JLabel(String.valueOf(mdCost));
                panel8.add(cost);
            }
        }else if(EnterDetails.sizeField.getText().equals("l")){
            if(EnterDetails.petTypeField.getText().equalsIgnoreCase("cat")) {
                JLabel cost = new JLabel(String.valueOf(lcCost));
                panel8.add(cost);
            }else if(EnterDetails.petTypeField.getText().equalsIgnoreCase("dog")){
                JLabel cost = new JLabel(String.valueOf(ldCost));
                panel8.add(cost);
            }
        }
        panel9.add(serviceButton);
        panel9.add(cancelButton);
        frame.setVisible(true);
    }
}





