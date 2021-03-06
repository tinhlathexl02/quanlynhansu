/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Dao.HopDongDao;
import Model.HopDong;
import Model.NhanVien;
import java.text.DateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author TheLuie
 */
public class ThemHdJdalog extends javax.swing.JDialog {

    /**
     * Creates new form ThemHdJdalog
     */
    private String gioitinh;
    private   HopDong hopDong= new HopDong();
    private HopDongDao tt=new HopDongDao();
       
    public ThemHdJdalog() {
       
        initComponents();
        loadcomboxMaNV();
        jtfMaHD.setText("HD00#");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfMaHD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jdNghi = new javax.swing.JRadioButton();
        jdCon = new javax.swing.JRadioButton();
        jtfNgayBD = new javax.swing.JTextField();
        jtfNgayKt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jcom2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jCom = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 153));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Mã HD:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Mã Nhân Viên:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Loại Hợp Đồng");

        jtfMaHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMaHDActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Ngày Bắt Đầu:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Tình Trạng");

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setForeground(new java.awt.Color(255, 102, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-insert-page-32.png"))); // NOI18N
        jButton1.setText("Thêm");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jdNghi);
        jdNghi.setText("Nghĩ");
        jdNghi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdNghiActionPerformed(evt);
            }
        });

        buttonGroup1.add(jdCon);
        jdCon.setSelected(true);
        jdCon.setText("Còn");
        jdCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdConActionPerformed(evt);
            }
        });

        jtfNgayBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNgayBDActionPerformed(evt);
            }
        });

        jtfNgayKt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNgayKtActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Ngày Kết Thúc");

        jcom2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dài Hạn", "Ngắn Hạn" }));
        jcom2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcom2ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 153));
        jLabel5.setText("Thêm Hợp Đồng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jLabel1)))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcom2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jtfMaHD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                        .addComponent(jCom, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(21, 21, 21))
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(15, 15, 15)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jdCon)
                                                .addGap(18, 18, 18)
                                                .addComponent(jdNghi))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jtfNgayKt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jtfNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfNgayKt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jdCon)
                    .addComponent(jdNghi)
                    .addComponent(jcom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(tt.kiemtramatontai(jtfMaHD.getText()))
        {
            JOptionPane.showMessageDialog(null, "Trùng mã");
        }
        else
        {
            if(jtfMaHD.getText().length()>0)
            {
            hopDong.setMAHD(jtfMaHD.getText());
                hopDong.setMaNV(jCom.getSelectedItem()+"");
                hopDong.setLoaiHD((String) jcom2.getSelectedItem());
                hopDong.setNgayBD(jtfNgayBD.getText());
                hopDong.setNgayKT(jtfNgayKt.getText());
                hopDong.setTinhTrang(jdCon.isSelected());
           
         
             
//                jtfMapb.setText("PB00#");
        
        
        int n=JOptionPane.showConfirmDialog(null, "ban muon them k","them",JOptionPane.YES_OPTION);
                if(n==JOptionPane.YES_OPTION)
                        {
                            tt.Themhopdong(hopDong);
                            JOptionPane.showMessageDialog(null, "thêm thành công");
                        }
             
        }
        
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jdNghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdNghiActionPerformed
        // TODO add your handling code here:
        gioitinh="Nghĩ";
    }//GEN-LAST:event_jdNghiActionPerformed

    private void jdConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdConActionPerformed
        gioitinh="Còn";        
        // TODO add your handling code here:
    }//GEN-LAST:event_jdConActionPerformed

    private void jcom2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcom2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcom2ActionPerformed

    private void jtfMaHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMaHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMaHDActionPerformed

    private void jtfNgayBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNgayBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNgayBDActionPerformed

    private void jtfNgayKtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNgayKtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNgayKtActionPerformed

    /**
     * @param args the command line arguments
     */
   public void loadcomboxMaNV()
   {
       jcom2.removeAll();
       ArrayList<NhanVien> dsnv=HopDongDao.loadcombox();
       for(NhanVien nv:dsnv)
       {
           jCom.addItem(nv);
       }
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<NhanVien> jCom;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcom2;
    private javax.swing.JRadioButton jdCon;
    private javax.swing.JRadioButton jdNghi;
    private javax.swing.JTextField jtfMaHD;
    private javax.swing.JTextField jtfNgayBD;
    private javax.swing.JTextField jtfNgayKt;
    // End of variables declaration//GEN-END:variables
}
