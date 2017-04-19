
package backgammon;

import javax.swing.JLayeredPane;

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

        lp = new JLayeredPane();
        board1 = new backgammon.Board();

        setPreferredSize(new java.awt.Dimension(1500, 1000));

        lp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lp.setMaximumSize(new java.awt.Dimension(1024, 804));
        lp.setMinimumSize(new java.awt.Dimension(1024, 804));
        Slot slot1 = new Slot();
        Slot slot2 = new Slot();
        Slot slot3 = new Slot();
        Slot slot4 = new Slot();
        Slot slot5 = new Slot();
        Slot slot6 = new Slot();

        slot1.setBounds(118, 30, 56, 200);
        slot1.setOpaque(true);
        slot2.setBounds(175, 30, 56, 200);
        slot2.setOpaque(true);
        slot3.setBounds(232, 30, 56, 200);
        slot3.setOpaque(true);
        slot4.setBounds(289, 30, 56, 200);
        slot4.setOpaque(true);
        slot5.setBounds(346, 30, 56, 200);
        slot5.setOpaque(true);
        slot6.setBounds(403, 30, 56, 200);
        slot6.setOpaque(true);

        lp.add(slot1, new Integer(1), 0);
        lp.add(slot2, new Integer(1), 0);
        lp.add(slot3, new Integer(1), 0);
        lp.add(slot4, new Integer(1), 0);
        lp.add(slot5, new Integer(1), 0);
        lp.add(slot6, new Integer(1), 0);

        Slot slot7 = new Slot();
        Slot slot8 = new Slot();
        Slot slot9 = new Slot();
        Slot slot10 = new Slot();
        Slot slot11 = new Slot();
        Slot slot12 = new Slot();

        slot7.setBounds(578, 30, 56, 200);
        slot7.setOpaque(true);
        slot8.setBounds(635, 30, 56, 200);
        slot8.setOpaque(true);
        slot9.setBounds(692, 30, 56, 200);
        slot9.setOpaque(true);
        slot10.setBounds(749, 30, 56, 200);
        slot10.setOpaque(true);
        slot11.setBounds(806, 30, 56, 200);
        slot11.setOpaque(true);
        slot12.setBounds(863, 30, 56, 200);
        slot12.setOpaque(true);

        lp.add(slot7, new Integer(1), 0);
        lp.add(slot8, new Integer(1), 0);
        lp.add(slot9, new Integer(1), 0);
        lp.add(slot10, new Integer(1), 0);
        lp.add(slot11, new Integer(1), 0);
        lp.add(slot12, new Integer(1), 0);

        board1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/board.jpg"))); // NOI18N

        lp.setLayer(board1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpLayout = new javax.swing.GroupLayout(lp);
        lp.setLayout(lpLayout);
        lpLayout.setHorizontalGroup(
            lpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(board1, javax.swing.GroupLayout.PREFERRED_SIZE, 1022, Short.MAX_VALUE)
        );
        lpLayout.setVerticalGroup(
            lpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(board1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(lp, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(376, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lp, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 196, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private backgammon.Board board1;
    private javax.swing.JLayeredPane lp;
    // End of variables declaration//GEN-END:variables
}
