/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Dao.DBConnect;
import Dao.LuongDao;
import Dao.PhongBanDao;
import Model.ChucVu;
import Model.HopDong;
import Model.Luong;
import Model.NhanVien;
import Model.PhongBan;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author TVD
 */
public class LuongNV extends javax.swing.JPanel {
    private TableRowSorter<TableModel> rowSorter = null;
 DefaultTableModel dtmpb;
  DefaultTableModel dtml; 
 
    /**
     * Creates new form KhoaHocJPanel
     */ 
 DefaultTableModel dtmluong;
    public LuongNV() {
        initComponents();
               dtmpb=(DefaultTableModel) this.tblLuong.getModel();
                 rowSorter = new TableRowSorter<>(tblLuong.getModel());
        tblLuong.setRowSorter(rowSorter);
        tblLuong.getColumnModel().getColumn(0).setMinWidth(140);
        tblLuong.getColumnModel().getColumn(0).setMaxWidth(140);
        tblLuong.getColumnModel().getColumn(0).setPreferredWidth(140);
        
        tblLuong.getColumnModel().getColumn(1).setMinWidth(140);
        tblLuong.getColumnModel().getColumn(1).setMaxWidth(140);
        tblLuong.getColumnModel().getColumn(1).setPreferredWidth(140);
        
         tblLuong.getTableHeader().setFont(new Font("Arrial", Font.BOLD, 14));
        tblLuong.getTableHeader().setPreferredSize(new Dimension(100, 50));
        tblLuong.setRowHeight(50);
        tblLuong.validate();
        tblLuong.repaint();  
      hienthi1();
//      hienthiluongtable2();
    
       
                        
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLuong = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        Jtftim = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnthem = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 255, 0));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });

        tblLuong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Nhân Viên", "Họ Tên Nhân Viên", "Chức Vụ", "Giới Tính", "Số Điện Thoại", "Địa Chỉ", "Lương"
            }
        ));
        tblLuong.setToolTipText("");
        tblLuong.setDropMode(javax.swing.DropMode.ON);
        tblLuong.getTableHeader().setResizingAllowed(false);
        tblLuong.getTableHeader().setReorderingAllowed(false);
        tblLuong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLuongMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblLuong);

        Jtftim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtftimActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 204, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-eye-35.png"))); // NOI18N
        jButton1.setText("Hiển Thị Lương Nhân Viên");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnthem.setBackground(new java.awt.Color(255, 153, 153));
        btnthem.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnthem.setForeground(new java.awt.Color(0, 204, 204));
        btnthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-zoom-in-34.png"))); // NOI18N
        btnthem.setText("Tìm Lương Theo MÃ NV ");
        btnthem.setBorder(null);
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 255, 204));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Xuất File Excel");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-zoom-in-34.png"))); // NOI18N
        jButton3.setText("Chi Tiet Luong");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1065, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(Jtftim, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthem)
                    .addComponent(Jtftim, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dach Sách Lương NV", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

    }//GEN-LAST:event_formComponentShown

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        // TODO add your handling code her:

    }//GEN-LAST:event_jPanel1ComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        if(Jtftim.getText().length()>0)
        {
            String manv=Jtftim.getText();
            hienthiluong(manv);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "bạn chưa nhập dữ liệu cần tim");
        }
    }//GEN-LAST:event_btnthemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Jtftim.setText("");
        //        String manv=Jtftim.getText();
        //         hienthiluong(manv);
        hienthi1();;

        //        hienthiluong(manv);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JtftimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtftimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtftimActionPerformed

    private void tblLuongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLuongMouseClicked

        //        this.txtMa.setText((String) tblql.getValueAt(row, 0));
        //        this.txtTieude.setText((String) tblql.getValueAt(row, 1));
        //        this.jcomloainhomSelected = (nhomKhachHang)cbox_nhomKH.getSelectedItem();
    }//GEN-LAST:event_tblLuongMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        LuongCT tt=new LuongCT();
        tt.setVisible(true);
        tt.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Jtftim;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblLuong;
    // End of variables declaration//GEN-END:variables

   
   public void hienthiluong(String manv)
   {
      
       
     try {
          String  sqlselect="select distinct MANV,HOTEN,TenCV,GIOITINH,SODT,DIACHI, (Luong.HSL*LuongCB) as'Luong' "
                  + "from ChucVu,NhanVien,Luong where NhanVien.MACV=ChucVu.MACV and Luong.HSL=ChucVu.HSL "
                  + "and NhanVien.MANV like '%"+manv+"%'"+ "or HOTEN like '%"+manv+"%'" ;
           Connection con=DBConnect.getConnection();
           Statement statement=con.createStatement();
           ResultSet rs=statement.executeQuery(sqlselect);
           dtmpb.setRowCount(0);
           while(rs.next())
           {
               String ma=rs.getString("MANV");
               String hoten=rs.getString("HOTEN");
               String tencv=rs.getString("TenCV");
               boolean Gioitinh=rs.getBoolean("GIOITINH");
               String sodt=rs.getString("SODT");
               String diachi=rs.getString("DIACHI");
               float luong=rs.getFloat("Luong");
                 Vector<Object>  vec=new Vector<Object>();
                 vec.add(ma);
                 vec.add(hoten);
                 vec.add(tencv);
                 vec.add(Gioitinh == true ? "Nam" : "Nữ");
                 vec.add(sodt);
                 vec.add(diachi);
                 vec.add(luong);
                 
                 dtmpb.addRow(vec);
           }
            
        
        } catch (Exception ex) {
            ex.printStackTrace();
        }
     
   }
    
   
       public void hienthi1()
       {
          
 
     try {
          String  sqlselect="select MANV,HOTEN,TenCV,GIOITINH,SODT,DIACHI, (Luong.HSL*LuongCB) as'Luong' "
                  + "from ChucVu,NhanVien,Luong where NhanVien.MACV=ChucVu.MACV and Luong.HSL=ChucVu.HSL ";
                 
           Connection con=DBConnect.getConnection();
           Statement statement=con.createStatement();
           ResultSet rs=statement.executeQuery(sqlselect);
           dtmpb.setRowCount(0);
           while(rs.next())
           {
               String ma=rs.getString("MANV");
               String hoten=rs.getString("HOTEN");
               String tencv=rs.getString("TenCV");
               boolean Gioitinh=rs.getBoolean("GIOITINH");
               String sodt=rs.getString("SODT");
               String diachi=rs.getString("DIACHI");
               float luong=rs.getFloat("Luong");
                 Vector<Object>  vec=new Vector<Object>();
                 vec.add(ma);
                 vec.add(hoten);
                 vec.add(tencv);
                 vec.add(Gioitinh == true ? "Nam" : "Nữ");
                 vec.add(sodt);
                 vec.add(diachi);
                 vec.add(luong);
                 
                 dtmpb.addRow(vec);
           }
            
        
        } catch (Exception ex) {
            ex.printStackTrace();
        }
     
   }
//       public void hienthiluongtable2()
//       {
//          ArrayList<Luong> dsl=LuongDao.hienthiluong();
//             dtml=(DefaultTableModel) tblluong2.getModel();
//        dtml.setRowCount(0);
//       
//        for(Luong luong:dsl)
//        {
//            Vector<Object>vec=new Vector<>();
//                vec.add(luong.getLcb());
//            vec.add(luong.getHsl());
//            dtml.addRow(vec);
//        }
//
//        tblLuong.setModel(dtml);
//
//   }
          
       

}
