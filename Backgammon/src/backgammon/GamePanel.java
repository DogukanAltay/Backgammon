
package backgammon;

/**
 *
 * @author mertarmagan
 */
public class GamePanel extends javax.swing.JPanel {

    public GamePanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(1200, 600));
        Slot slot1 = new Slot();
        Slot slot2 = new Slot();
        Slot slot3 = new Slot();
        Slot slot4 = new Slot();
        Slot slot5 = new Slot();
        Slot slot6 = new Slot();

        slot1.setBounds(20, 380, 50, 200);
        slot1.setOpaque(true);
        slot2.setBounds(80, 380, 50, 200);
        slot2.setOpaque(true);
        slot3.setBounds(140, 380, 50, 200);
        slot3.setOpaque(true);
        slot4.setBounds(200, 380, 50, 200);
        slot4.setOpaque(true);
        slot5.setBounds(260, 380, 50, 200);
        slot5.setOpaque(true);
        slot6.setBounds(320, 380, 50, 200);
        slot6.setOpaque(true);

        jLayeredPane1.add(slot1, new Integer(1), 0);
        jLayeredPane1.add(slot2, new Integer(1), 0);
        jLayeredPane1.add(slot3, new Integer(1), 0);
        jLayeredPane1.add(slot4, new Integer(1), 0);
        jLayeredPane1.add(slot5, new Integer(1), 0);
        jLayeredPane1.add(slot6, new Integer(1), 0);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/board.jpg"))); // NOI18N

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(278, 278, 278))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(222, 222, 222))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 188, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
