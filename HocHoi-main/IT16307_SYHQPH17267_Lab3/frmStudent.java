/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class frmStudent extends javax.swing.JFrame {

    ArrayList<student> list = new ArrayList<>();

    /**
     * Creates new form frmStudent
     */
    public frmStudent() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txthocluc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbbnganh = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtmark = new javax.swing.JTextField();
        chkphanthuong = new javax.swing.JCheckBox();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnnhapmoi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblstudent = new javax.swing.JTable();
        btnsxten = new javax.swing.JButton();
        btnsxmark = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Quản lý sinh viên");

        jLabel1.setText("Họ tên");

        jLabel3.setText("Điểm");

        txthocluc.setEditable(false);

        jLabel4.setText("Ngành");

        cbbnganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ứng dụng phần mềm", "Lập trình máy tính", "Lập trình web", " " }));

        jLabel5.setText("Học lực");

        chkphanthuong.setText("Có phần thưởng ?");

        btnthem.setText("thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setText("sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setText("xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnnhapmoi.setText("nhập mới");
        btnnhapmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnhapmoiActionPerformed(evt);
            }
        });

        tblstudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Họ Tên", "Điểm", "Ngành", "Học lực", "Thưởng"
            }
        ));
        tblstudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblstudentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblstudent);

        btnsxten.setText("Sắp xếp theo tên");
        btnsxten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsxtenActionPerformed(evt);
            }
        });

        btnsxmark.setText("Sắp xếp theo điểm");
        btnsxmark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsxmarkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(97, 97, 97))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmark, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txthocluc, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbnganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkphanthuong))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnthem)
                        .addGap(18, 18, 18)
                        .addComponent(btnsua)
                        .addGap(18, 18, 18)
                        .addComponent(btnxoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnnhapmoi))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnsxten)
                .addGap(28, 28, 28)
                .addComponent(btnsxmark)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtmark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbbnganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txthocluc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chkphanthuong)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthem)
                    .addComponent(btnsua)
                    .addComponent(btnxoa)
                    .addComponent(btnnhapmoi))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsxten)
                    .addComponent(btnsxmark))
                .addContainerGap(235, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        this.addstudent();
        this.filltable();
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        this.updatestudent();
        this.filltable();
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        this.removestudent();
        filltable();
    }//GEN-LAST:event_btnxoaActionPerformed

    private void tblstudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblstudentMouseClicked
        this.showdetail();
    }//GEN-LAST:event_tblstudentMouseClicked

    private void btnnhapmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnhapmoiActionPerformed
        this.nhapmoi();

    }//GEN-LAST:event_btnnhapmoiActionPerformed

    private void btnsxtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsxtenActionPerformed
        Collections.sort(list);
        filltable();
    }//GEN-LAST:event_btnsxtenActionPerformed

    private void btnsxmarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsxmarkActionPerformed
        Comparator< student> st = new Comparator<student>() {
            @Override
            public int compare(student t, student t1) {
                return Double.compare(t1.getMark(), t.getMark());
            }
        };
        Collections.sort(list, st);
        filltable();
    }//GEN-LAST:event_btnsxmarkActionPerformed

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
            java.util.logging.Logger.getLogger(frmStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmStudent().setVisible(true);
            }
        });
    }

    public void addstudent() {
        student sv = new student();
        sv.name = txtname.getText();
        sv.mark = Double.parseDouble(txtmark.getText());
        sv.major = (String) cbbnganh.getSelectedItem();
        list.add(sv);
        txthocluc.setText(sv.getGrade());
        chkphanthuong.setSelected(sv.isbonus());
    }

    public void removestudent() {

        int index = tblstudent.getSelectedRow();
        list.remove(index);

    }

    public void updatestudent() {
        int index = tblstudent.getSelectedRow();
        student sv = list.get(index);
        sv.name = txtname.getText();
        sv.mark = Double.parseDouble(txtmark.getText());
        sv.major = (String) cbbnganh.getSelectedItem();
        txthocluc.setText(sv.getGrade());
        chkphanthuong.setSelected(sv.isbonus());

    }

    public void filltable() {
        DefaultTableModel model = (DefaultTableModel) tblstudent.getModel();
        model.setRowCount(0);
        for (student sv : list) {
            Object[] row = new Object[]{
                sv.name, sv.mark, sv.major, sv.getGrade(), sv.isbonus()
            };
            model.addRow(row);
        }

    }

    public void showdetail() {
        DefaultTableModel model = (DefaultTableModel) tblstudent.getModel();
        String ten = model.getValueAt(tblstudent.getSelectedRow(), 0).toString();
        String diem = model.getValueAt(tblstudent.getSelectedRow(), 1).toString();
        String hocluc = model.getValueAt(tblstudent.getSelectedRow(), 3).toString();
        boolean thuong = model.getValueAt(tblstudent.getSelectedRow(), 4).toString()=="true";
        String nganh = model.getValueAt(tblstudent.getSelectedRow(), 2).toString();
        txtname.setText(ten);
        txtmark.setText(diem);
        txthocluc.setText(hocluc);
        chkphanthuong.setSelected(thuong);
        cbbnganh.setSelectedItem(nganh);
        
        
    }

    public void nhapmoi() {
        txtname.setText("");
        txtmark.setText("");
        txthocluc.setText("");
        chkphanthuong.setSelected(false);
        cbbnganh.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnnhapmoi;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnsxmark;
    private javax.swing.JButton btnsxten;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JComboBox<String> cbbnganh;
    private javax.swing.JCheckBox chkphanthuong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblstudent;
    private javax.swing.JTextField txthocluc;
    private javax.swing.JTextField txtmark;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}