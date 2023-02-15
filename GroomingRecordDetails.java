import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GroomingRecordDetails {
    //declare frames and tables for showing service records
    JFrame frame1 = new JFrame("Grooming records");
    DefaultTableModel dtm = new DefaultTableModel();
    JTable table = new JTable(dtm);
    JScrollPane sp = new JScrollPane(table);

    GroomingRecordDetails(){
        //display grooming records table
        frame1.setSize(500,500);
        frame1.setLayout(null);

        sp.setBounds(0,50,500,300);
        String arr[] = {"Grooming No"," Date","Cost in $'","Reviews"};
        for(int i=0;i<arr.length;i++){
            dtm.addColumn(arr[i]);
        }
        for(int i=0;i<GroomingRecords.list.size();i++){
            String values[] = {String.valueOf(GroomingRecords.list.get(i).groomingNumber),String.valueOf(GroomingRecords.list.get(i).date),
                    String.valueOf(GroomingRecords.list.get(i).cost),String.valueOf(GroomingRecords.list.get(i).reviews)};
            dtm.addRow(values);
        }

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBounds(150,400,150,30);
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame1.dispose();
            }
        });

        frame1.add(sp);
        frame1.add(cancelButton);
        frame1.setVisible(true);
    }
}
