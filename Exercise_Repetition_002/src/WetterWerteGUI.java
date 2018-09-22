
import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.AbstractListModel;
import javax.swing.JFileChooser;

public class WetterWerteGUI extends javax.swing.JFrame {
        private WetterModell wm = new WetterModell();
    /**
     * Creates new form WetterWerteGUI
     */
    public WetterWerteGUI() {
        initComponents();
        liAnzeige.setModel(wm);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbTemperatur = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        liAnzeige = new javax.swing.JList<>();
        jsTemperatur = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        lbLuftfeuchtigkeit = new javax.swing.JLabel();
        jsLuftfeuchtigkeit = new javax.swing.JSlider();
        btEinfügen = new javax.swing.JButton();
        mbDatei = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miLaden = new javax.swing.JMenuItem();
        miSpeichern = new javax.swing.JMenuItem();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Eingabe");

        jLabel2.setText("Anzeige");

        jLabel3.setText("Temperatur:");

        jScrollPane1.setViewportView(liAnzeige);

        jsTemperatur.setMinimum(-20);
        jsTemperatur.setMaximum(40);
        jsTemperatur.setValue(10);
        jsTemperatur.createStandardLabels(1);
        jsTemperatur.setPaintTicks(true);
        jsTemperatur.setPaintLabels(true);

        jsTemperatur.setMajorTickSpacing(10);
        jsTemperatur.setMinorTickSpacing(5);
        jsTemperatur.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsTemperaturStateChanged(evt);
            }
        });

        jLabel4.setText("Luftfeuchtigkeit:");

        jsLuftfeuchtigkeit.setMinimum(0);
        jsLuftfeuchtigkeit.setMaximum(100);
        jsLuftfeuchtigkeit.setValue(50);
        jsLuftfeuchtigkeit.createStandardLabels(1);
        jsLuftfeuchtigkeit.setPaintTicks(true);
        jsLuftfeuchtigkeit.setPaintLabels(true);

        jsLuftfeuchtigkeit.setMajorTickSpacing(20);
        jsLuftfeuchtigkeit.setMinorTickSpacing(10);
        jsLuftfeuchtigkeit.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsLuftfeuchtigkeitStateChanged(evt);
            }
        });

        btEinfügen.setText("Einfügen");
        btEinfügen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEinfügenActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        miLaden.setText("Datei-laden");
        miLaden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLadenActionPerformed(evt);
            }
        });
        jMenu1.add(miLaden);

        miSpeichern.setText("Datei-speichern");
        miSpeichern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSpeichernActionPerformed(evt);
            }
        });
        jMenu1.add(miSpeichern);

        mbDatei.add(jMenu1);

        setJMenuBar(mbDatei);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbTemperatur, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jsTemperatur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lbLuftfeuchtigkeit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jsLuftfeuchtigkeit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEinfügen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 133, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(lbTemperatur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jsTemperatur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbLuftfeuchtigkeit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jsLuftfeuchtigkeit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btEinfügen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEinfügenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEinfügenActionPerformed
       int temperatur = jsTemperatur.getValue();
       int luftfeuchtigkeit = jsLuftfeuchtigkeit.getValue();
       LocalDateTime ldt = LocalDateTime.now();
      
       WetterWert ww = new WetterWert(temperatur, luftfeuchtigkeit, ldt);
       wm.add(ww);  
    }//GEN-LAST:event_btEinfügenActionPerformed

    private void jsTemperaturStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsTemperaturStateChanged
       int temperatur = jsTemperatur.getValue();
       
       lbTemperatur.setText(temperatur +"°");
    }//GEN-LAST:event_jsTemperaturStateChanged

    private void jsLuftfeuchtigkeitStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsLuftfeuchtigkeitStateChanged
        int luftfeuchtigkeit = jsLuftfeuchtigkeit.getValue();
        
        lbLuftfeuchtigkeit.setText(luftfeuchtigkeit +"%");
    }//GEN-LAST:event_jsLuftfeuchtigkeitStateChanged

    private void miLadenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLadenActionPerformed
        WetterModell.load();
    }//GEN-LAST:event_miLadenActionPerformed

    private void miSpeichernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSpeichernActionPerformed
        JFileChooser chooser = new JFileChooser();
        int res = chooser.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            File f = chooser.getSelectedFile();
            wm.save(f);
        }
        
    }//GEN-LAST:event_miSpeichernActionPerformed
   
  
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(WetterWerteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WetterWerteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WetterWerteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WetterWerteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WetterWerteGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEinfügen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jsLuftfeuchtigkeit;
    private javax.swing.JSlider jsTemperatur;
    private javax.swing.JLabel lbLuftfeuchtigkeit;
    private javax.swing.JLabel lbTemperatur;
    private javax.swing.JList<String> liAnzeige;
    private javax.swing.JMenuBar mbDatei;
    private javax.swing.JMenuItem miLaden;
    private javax.swing.JMenuItem miSpeichern;
    // End of variables declaration//GEN-END:variables
}
