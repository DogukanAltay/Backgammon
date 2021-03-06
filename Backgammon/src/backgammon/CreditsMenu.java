
package backgammon;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CreditsMenu extends javax.swing.JPanel {

    private JPanel mainPanel;
    private JFrame mainFrame;  
    
    public CreditsMenu() {
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

        back = new javax.swing.JButton();
        armagan = new javax.swing.JLabel();
        dogukan = new javax.swing.JLabel();
        omer = new javax.swing.JLabel();
        berkalp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        back.setText("Back");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.setFocusPainted(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        armagan.setFont(new java.awt.Font("Segoe UI Semilight", 0, 30)); // NOI18N
        armagan.setText("--> Mert Armağan SARI");

        dogukan.setFont(new java.awt.Font("Segoe UI Semilight", 0, 30)); // NOI18N
        dogukan.setText("--> Doğukan Altay");

        omer.setFont(new java.awt.Font("Segoe UI Semilight", 0, 30)); // NOI18N
        omer.setText("--> Ömer Sakarya");

        berkalp.setFont(new java.awt.Font("Segoe UI Semilight", 0, 30)); // NOI18N
        berkalp.setText("--> Berkalp Yılmaz");

        jLabel1.setFont(new java.awt.Font("Lithos Pro Regular", 0, 50)); // NOI18N
        jLabel1.setText("DEVELOPERS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(back)
                .addGap(251, 251, 251)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(armagan)
                        .addComponent(dogukan, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(omer, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(berkalp, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel1))
                .addContainerGap(343, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(back))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)))
                .addGap(48, 48, 48)
                .addComponent(armagan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dogukan)
                .addGap(18, 18, 18)
                .addComponent(omer)
                .addGap(18, 18, 18)
                .addComponent(berkalp)
                .addContainerGap(171, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        mainFrame.setContentPane(mainPanel);
        
        mainFrame.invalidate();
        mainFrame.validate();
    }//GEN-LAST:event_backActionPerformed
    
    public void setMainMenu(JPanel mainPanel){      
       this.mainPanel =  mainPanel;
    }
    
    public void setMainFrame(JFrame mainFrame){
        this.mainFrame = mainFrame;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel armagan;
    private javax.swing.JButton back;
    private javax.swing.JLabel berkalp;
    private javax.swing.JLabel dogukan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel omer;
    // End of variables declaration//GEN-END:variables
}
