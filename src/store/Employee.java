
package store;

import javax.swing.UIManager;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Employee extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ResultSet rs;
    int id=0;
    
    public Employee() {
        initComponents();
        try {
           UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println(e);
        }
        connect();
        showData();
    }

    private void connect()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmeasy","root","root");
            stmt = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    public void showData()
    {
        try {
            String sql = "select * from employee";
            rs = stmt.executeQuery(sql);
            
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setRowCount(0);
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString("id"),rs.getString("name"),rs.getString("email"),rs.getString("password"),rs.getString("contact"),rs.getString("city"),rs.getString("salary")});
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ename = new javax.swing.JTextField();
        eemail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        econtact = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ecity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        epassword = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        esalary = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        searchTxt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        searchBy = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(37, 31, 80, 22);

        ename.setBackground(new java.awt.Color(204, 255, 204));
        ename.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(ename);
        ename.setBounds(37, 59, 192, 30);

        eemail.setBackground(new java.awt.Color(204, 255, 204));
        eemail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(eemail);
        eemail.setBounds(283, 59, 190, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Email");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(283, 31, 80, 22);

        econtact.setBackground(new java.awt.Color(204, 255, 204));
        econtact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(econtact);
        econtact.setBounds(783, 59, 192, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contact");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(783, 31, 102, 22);

        ecity.setBackground(new java.awt.Color(204, 255, 204));
        ecity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(ecity);
        ecity.setBounds(1034, 59, 192, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("City");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1034, 31, 80, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Password");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(540, 30, 110, 22);

        epassword.setBackground(new java.awt.Color(204, 255, 204));
        epassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(epassword);
        epassword.setBounds(540, 60, 192, 30);

        jButton1.setBackground(new java.awt.Color(0, 51, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(540, 120, 192, 38);

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(1034, 123, 192, 38);

        jButton4.setBackground(new java.awt.Color(51, 153, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Submit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(283, 123, 192, 38);

        jButton5.setBackground(new java.awt.Color(204, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(780, 120, 192, 38);

        esalary.setBackground(new java.awt.Color(204, 255, 204));
        esalary.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(esalary);
        esalary.setBounds(37, 123, 192, 37);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Salary");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(37, 95, 80, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1270, 200);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setLayout(null);

        searchTxt.setBackground(new java.awt.Color(204, 255, 204));
        searchTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(searchTxt);
        searchTxt.setBounds(282, 13, 194, 34);

        jButton2.setBackground(new java.awt.Color(0, 51, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(780, 10, 192, 34);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Search By");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(39, 19, 115, 22);

        searchBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Name", "Email", "Contact", " " }));
        jPanel3.add(searchBy);
        searchBy.setBounds(540, 10, 190, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 200, 1270, 60);

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Email", "Password", "Contact", "City", "Salary"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(30);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 260, 1270, 540);

        setBounds(265, 50, 1284, 837);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // insert employee data
        try {
            String sql = "insert into employee(name,email,password,contact,city,salary) values('"+ename.getText()+"','"+eemail.getText()+"','"+epassword.getText()+"','"+econtact.getText()+"','"+ecity.getText()+"','"+esalary.getText()+"')";
            System.out.println(sql);
            int a = stmt.executeUpdate(sql);
            if(a==1)
            {
                JOptionPane.showMessageDialog(this, a+" record insert succesfully");
                showData();
                
            }
            else{
                JOptionPane.showMessageDialog(this, "Something Went Wrong!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "delete from employee where id = '"+id+"'";
            int a = stmt.executeUpdate(sql);
            if(a==1)
            {
                JOptionPane.showMessageDialog(this, a+" record delete succesfully");
                showData();
            }
            else{
                JOptionPane.showMessageDialog(this, "Something Went Wrong!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        ename.setText("");
        eemail.setText("");
        epassword.setText("");
        esalary.setText("");
        econtact.setText("");
        ecity.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        id = Integer.parseInt(model.getValueAt(jTable1.getSelectedRow(), 0).toString());
        System.out.println(id);
        ename.setText(model.getValueAt(jTable1.getSelectedRow(), 1).toString());
        eemail.setText(model.getValueAt(jTable1.getSelectedRow(), 2).toString());
        epassword.setText(model.getValueAt(jTable1.getSelectedRow(), 3).toString());
        econtact.setText(model.getValueAt(jTable1.getSelectedRow(), 4).toString());
        esalary.setText(model.getValueAt(jTable1.getSelectedRow(), 6).toString());
        ecity.setText(model.getValueAt(jTable1.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "update employee set name = '"+ename.getText()+"', email = '"+eemail.getText()+"',password = '"+epassword.getText()+"',contact = '"+econtact.getText()+"',city = '"+ecity.getText()+"',salary = '"+esalary.getText()+"' where id = '"+id+"'";
            int a = stmt.executeUpdate(sql);
            if(a==1)
            {
                JOptionPane.showMessageDialog(this, a+" record update succesfully");
                showData();
            }
            else{
                JOptionPane.showMessageDialog(this, "Something Went Wrong!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /*    */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            if(searchBy.getSelectedItem().equals("Select"))
            {
                JOptionPane.showMessageDialog(this, "Select Serach By Option");
            }
            // select * from employee where id like ''
            
            else if(searchTxt.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Search input should be required");
            }
            else{
                String sql = "select * from employee where "+searchBy.getSelectedItem()+" like '%"+searchTxt.getText()+"%'";
                
                rs = stmt.executeQuery(sql);
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.setRowCount(0);
                while(rs.next())
                {
                    model.addRow(new Object[]{rs.getString("id"),rs.getString("name"),rs.getString("email"),rs.getString("password"),rs.getString("contact"),rs.getString("city"),rs.getString("salary")});
                }
            }   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ecity;
    private javax.swing.JTextField econtact;
    private javax.swing.JTextField eemail;
    private javax.swing.JTextField ename;
    private javax.swing.JTextField epassword;
    private javax.swing.JTextField esalary;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> searchBy;
    private javax.swing.JTextField searchTxt;
    // End of variables declaration//GEN-END:variables
}
