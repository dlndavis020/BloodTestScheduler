/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dylan.projects.bloodtestscheduler;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/**
 *
 * @author dlnda
 */
public class GUI extends javax.swing.JFrame {
    private nextPatientPQ patientPQ;
    private NoShowQueue showQueue;
    /**
     * Creates new form GUI
     */
    //Constructor to initialize the GUI
    public GUI() {
        //Initialize Both the priority queue and queue
        patientPQ = new nextPatientPQ();
        showQueue = new NoShowQueue();
        //Initialize GUI Components
        initComponents();
        //Create the Title of the window
        setTitle("Blood Test Scheduler");
        //Set the size of the window
        setSize(900, 680);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        gpField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        gpAddressField = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        urgencyLow = new javax.swing.JRadioButton();
        urgencyMedium = new javax.swing.JRadioButton();
        urgencyUrgent = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        hospitalNo = new javax.swing.JRadioButton();
        hospitalYes = new javax.swing.JRadioButton();
        confirm = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        allPatientsArea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        priorityPatient = new javax.swing.JButton();
        noShow = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        nextPatientArea = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        noShowArea = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("New Patients");

        jLabel2.setText("Name: ");

        nameField.setPreferredSize(new java.awt.Dimension(64, 22));

        jLabel3.setText("Age:");

        ageField.setPreferredSize(new java.awt.Dimension(40, 22));

        jLabel4.setText("GP Name:");

        jLabel5.setText("GP Address:");

        gpField.setPreferredSize(new java.awt.Dimension(100, 22));

        gpAddressField.setColumns(20);
        gpAddressField.setRows(5);
        jScrollPane1.setViewportView(gpAddressField);

        jLabel6.setText("Urgency of Illness:");

        urgencyLow.setText("Low");

        urgencyMedium.setText("Medium");

        urgencyUrgent.setText("Urgent");

        jLabel7.setText("Coming From Hospital:");

        hospitalNo.setText("No");

        hospitalYes.setText("Yes");

        confirm.setText("Confirm");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        allPatientsArea.setEditable(false);
        allPatientsArea.setColumns(20);
        allPatientsArea.setRows(5);
        jScrollPane2.setViewportView(allPatientsArea);

        jLabel8.setText("All Patients");

        priorityPatient.setText("Priority Patient");
        priorityPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priorityPatientActionPerformed(evt);
            }
        });

        noShow.setText("No Show List");
        noShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noShowActionPerformed(evt);
            }
        });

        nextPatientArea.setEditable(false);
        nextPatientArea.setColumns(20);
        nextPatientArea.setRows(5);
        jScrollPane3.setViewportView(nextPatientArea);

        jLabel9.setText("Priority Patients");

        noShowArea.setEditable(false);
        noShowArea.setColumns(20);
        noShowArea.setRows(5);
        jScrollPane4.setViewportView(noShowArea);

        jLabel10.setText("Current No Shows");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(urgencyLow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(urgencyMedium)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(urgencyUrgent))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gpField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hospitalNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hospitalYes))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(83, 83, 83)
                        .addComponent(confirm))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(priorityPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(noShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(49, 49, 49))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(gpField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(urgencyLow)
                            .addComponent(urgencyMedium)
                            .addComponent(urgencyUrgent)))
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(hospitalNo)
                    .addComponent(hospitalYes))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(confirm)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(5, 5, 5)))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(priorityPatient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noShow))
                    .addComponent(jScrollPane4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        // TODO add your handling code here:
                //Take user input
        String name = nameField.getText();
        String age = ageField.getText();
        String gpName = gpField.getText();
        String gpAddress = gpAddressField.getText();

        //Parse Age from String to Integer
        int iAge = Integer.parseInt(age);

        //Create new patient object
        Patients p = new Patients();
        p.setName(name);
        p.setGpName(gpName);
        p.setGpAddress(gpAddress);
        p.setAge(String.valueOf(iAge));

        //Create an instance of PriorityAssignment
        PriorityAssignment pa = new PriorityAssignment();

        //Get the urgency, hospital priority and age priority of each patient
        int urgency = pa.urgencyLevel(urgencyLow.isSelected(), urgencyMedium.isSelected(), urgencyUrgent.isSelected());
        int hospitalPriority = pa.hospitalRequirement(hospitalYes.isSelected(), hospitalNo.isSelected());
        int agePriority = pa.agePriority(iAge);

        // Calculate the overall priority
        int priority = pa.priorityLevel(urgency, hospitalPriority, agePriority);

        // Enqueue the patient with the calculated priority
        patientPQ.enqueue(priority, p);

        //Display the patient in the all Patient Area
        allPatientsArea.setText("");
        allPatientsArea.append(patientPQ.printPQueue());

        //Clears New Patient fields
        nameField.setText("");
        ageField.setText("");
        gpField.setText("");
        gpAddressField.setText("");
        urgencyLow.setSelected(false);
        urgencyMedium.setSelected(false);
        urgencyUrgent.setSelected(false);
        hospitalYes.setSelected(false);
        hospitalNo.setSelected(false);

        //Informs user that the New Patient info has been saved
        JOptionPane.showMessageDialog(null, "Patient information has been saved");
    }//GEN-LAST:event_confirmActionPerformed

    private void priorityPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priorityPatientActionPerformed
        // TODO add your handling code here:
        //Will check if the PQ is not empty
        if(!patientPQ.isEmpty()) {
            //Will dequeue the next patient
            PQElement pqElement = (PQElement) patientPQ.dequeue();
            Patients p1 = (Patients)pqElement.getElement();
            
            //Set the Next Patient Area text to blank
            nextPatientArea.setText("");
            
            //Will display the next patients information
            nextPatientArea.append("The next patient is: " + p1.getName() + "\n");
            nextPatientArea.append("Patients age: " + p1.getAge() + "\n");
            nextPatientArea.append("Patients GP name: " + p1.getGpName() + "\n");
            nextPatientArea.append("Patients GP address:\n " + p1.getGpAddress() + "\n");
            
            //This sets the All Patients area back to blank then updates it with the most current PQ List
            allPatientsArea.setText("");
            allPatientsArea.append(patientPQ.printPQueue());

        }else
            //This will clear the Next Patient Area and inform the user there are no more patients
            if(patientPQ.isEmpty()) {
                nextPatientArea.setText("");
                nextPatientArea.append("There is no patient in the queue\n");
            }
    }//GEN-LAST:event_priorityPatientActionPerformed

    private void noShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noShowActionPerformed
        // TODO add your handling code here:
        if(!patientPQ.isEmpty()) {
            //This will dequeue Current patient from the priority Queue
            PQElement pqElement = (PQElement) patientPQ.dequeue();
            Patients p =  (Patients)pqElement.getElement();

            //This will add the patient to the no show Queue
            showQueue.enqueue(p);
            //This will remove the patient that is longest in the no show list if there are already 5 patients
            showQueue.dequeue();

            //The No Show Part of the GUI will be updated with the patient info
            JOptionPane.showMessageDialog(null, "Patient has been moved to the no show list");
            noShowArea.setText("");
            String noShowList = showQueue.printQueue();
            noShowArea.append(noShowList);

            //This sets the All Patients area back to blank then updates it with the most current PQ List
            allPatientsArea.setText("");
            allPatientsArea.append(patientPQ.printPQueue());
        }
    }//GEN-LAST:event_noShowActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JTextArea allPatientsArea;
    private javax.swing.JButton confirm;
    private javax.swing.JTextArea gpAddressField;
    private javax.swing.JTextField gpField;
    private javax.swing.JRadioButton hospitalNo;
    private javax.swing.JRadioButton hospitalYes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextArea nextPatientArea;
    private javax.swing.JButton noShow;
    private javax.swing.JTextArea noShowArea;
    private javax.swing.JButton priorityPatient;
    private javax.swing.JRadioButton urgencyLow;
    private javax.swing.JRadioButton urgencyMedium;
    private javax.swing.JRadioButton urgencyUrgent;
    // End of variables declaration//GEN-END:variables
}
