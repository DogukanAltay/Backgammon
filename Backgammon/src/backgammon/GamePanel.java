
package backgammon;

import java.util.ArrayList;
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
        b = new backgammon.Board();

        setPreferredSize(new java.awt.Dimension(1500, 1000));

        lp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lp.setMaximumSize(new java.awt.Dimension(1024, 804));
        lp.setMinimumSize(new java.awt.Dimension(1024, 804));
        b.initSlots();
        b.initCheckers();
        ArrayList<Slot> slotSet1 = b.getSlotSet1();

        Checker chc = new Checker(100,100);
        //chc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checkerBlack.jpg")));

        for(int i = 0; i<slotSet1.size(); i++){
            lp.add(slotSet1.get(i), new Integer(1), 0);
        }

        lp.add(chc, new Integer(0), 0);

        lp.add(b.getCheckerSet1().getChecker(0),new Integer(2), 0);

        lp.setLayer(b, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpLayout = new javax.swing.GroupLayout(lp);
        lp.setLayout(lpLayout);
        lpLayout.setHorizontalGroup(
            lpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(b, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
        );
        lpLayout.setVerticalGroup(
            lpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(b, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(lp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(376, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private backgammon.Board b;
    private javax.swing.JLayeredPane lp;
    // End of variables declaration//GEN-END:variables
}
