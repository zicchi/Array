/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanArray;

/**
 *
 * @author Evolved
 */
public class PemilihanDokter extends javax.swing.JFrame {

    /**
     * Creates new form PemilihanDokter
     */
    public PemilihanDokter() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        alamat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        usia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jenis = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        gol = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        status = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        kewar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        spesial = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        waktu = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("PEMILIHAN DOKTER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 10, 160, 17);

        jLabel2.setText("Pilih Dokter");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 80, 70, 14);

        jLabel3.setText("Nama");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 120, 50, 14);

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        getContentPane().add(nama);
        nama.setBounds(150, 120, 180, 30);

        jLabel4.setText("Alamat");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 150, 60, 14);

        alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatActionPerformed(evt);
            }
        });
        getContentPane().add(alamat);
        alamat.setBounds(150, 150, 180, 30);

        jLabel5.setText("Usia");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 180, 40, 14);

        usia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usiaActionPerformed(evt);
            }
        });
        getContentPane().add(usia);
        usia.setBounds(150, 180, 180, 30);

        jLabel6.setText("Jenis Kelamin");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 210, 90, 14);

        jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisActionPerformed(evt);
            }
        });
        getContentPane().add(jenis);
        jenis.setBounds(150, 210, 180, 30);

        jLabel7.setText("Golongan Darah");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 240, 100, 14);
        getContentPane().add(gol);
        gol.setBounds(150, 240, 180, 30);

        jLabel8.setText("Status");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 270, 60, 14);
        getContentPane().add(status);
        status.setBounds(150, 270, 180, 30);

        jLabel9.setText("Kewarganegaraan");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 300, 110, 14);
        getContentPane().add(kewar);
        kewar.setBounds(150, 300, 180, 30);

        jLabel10.setText("Waktu Praktek");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 330, 90, 14);
        getContentPane().add(spesial);
        spesial.setBounds(150, 330, 180, 30);

        jLabel11.setText("Dokter Spesialis");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 360, 100, 14);
        getContentPane().add(waktu);
        waktu.setBounds(150, 360, 180, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "~Pilih Salah Satu~", "DR. Farras Yassar", "DR. Dian Sikahita", "DR. Harun Ulum Fajar" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(150, 80, 180, 20);

        setBounds(0, 0, 416, 456);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
       
        if(jComboBox2.getSelectedItem().equals("DR. Farras Yassar")){
            nama.setText("DR. Farras Yassar ");
            alamat.setText("Jl. Surabaya 16, Malang");
            usia.setText("20 Tahun");
            jenis.setText("Laki-Laki");
            gol.setText("A");
            status.setText("Belum Menikah ");
            kewar.setText("Indonesia");
            spesial.setText("Dokter Umum");
            waktu.setText(" Pagi (07.00-15.00)");
        }
        else
        if(jComboBox2.getSelectedItem().equals("DR. Dian Sikahita")){
            nama.setText("DR. Dian Sikahita");
            alamat.setText("Jl. Veteran 3, Malang");
            usia.setText("20 Tahun");
            jenis.setText("Perempuan");
            gol.setText("O");
            status.setText("Belum Menikah");
            kewar.setText("Indonesia");
            spesial.setText("Dokter Gigi");
            waktu.setText(" Sore (16.00-22.00)");
        }
        else
        if(jComboBox2.getSelectedItem().equals("DR. Harun Ulum Fajar")){
            nama.setText("DR. Harun Ulum Fajar");
            alamat.setText("Jl. Bandung 9, Malang");
            usia.setText("20 Tahun");
            jenis.setText("Laki-Laki");
            gol.setText("B");
            status.setText("Belum Menikah");
            kewar.setText("Indonesia");
            spesial.setText("Dokter Gizi");
            waktu.setText(" Malam (22.00-06.00)");
        }
    
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void usiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usiaActionPerformed

    private void alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenisActionPerformed

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
            java.util.logging.Logger.getLogger(PemilihanDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PemilihanDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PemilihanDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PemilihanDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PemilihanDokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JTextField gol;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jenis;
    private javax.swing.JTextField kewar;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField spesial;
    private javax.swing.JTextField status;
    private javax.swing.JTextField usia;
    private javax.swing.JTextField waktu;
    // End of variables declaration//GEN-END:variables
}
