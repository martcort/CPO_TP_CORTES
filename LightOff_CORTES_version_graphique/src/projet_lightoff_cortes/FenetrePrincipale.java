package projet_lightoff_cortes;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author marti
 */
public class FenetrePrincipale extends javax.swing.JFrame {

    /**
     * Creates new form FenetrePrincipale
     */
    GrilleDeCellules grille;
    int nbCoups = 0;
    
    static int abs = 10;
    static int ord = 10;
    static int diff = 5;
    
    int i;
    
    String textecoups;
    
    public void victoire()
    {
        nbCoups++;
        textecoups = ""+(nbCoups);
        texteCoups.setText(textecoups);
        if (grille.cellulesToutesEteintes()==true){
            FenetreVictoire f = new FenetreVictoire(nbCoups) ;
            f.setVisible(true) ;
            initialiserPartie(diff);
            abs++;
            ord++;
            diff++;
            nbCoups = 0;
            textecoups = ""+(nbCoups);
            texteCoups.setText(textecoups);
        }
            
    }
     public void initialiserPartie(int n) {
        grille.eteindreToutesLesCellules();
        grille.melangerMatriceAleatoirement(n);
    }
    
    public FenetrePrincipale(int nbLignes, int nbColonnes, int d) {
        initComponents();
        // On reprend les attributs de la classe Partie
        ord = nbLignes;
        abs = nbColonnes;
        diff = d;
        
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90,
        abs*45, ord*45));
        this.pack();
        this.revalidate();

        // Paramétrage des boutons des diagonales
        DiagDescendanteGauche.setLayout(new GridLayout(1,1));
        getContentPane().add(DiagDescendanteGauche, new
        org.netbeans.lib.awtextra.AbsoluteConstraints(45, 45, 45, 45));
        
        DiagMontanteGauche.setLayout(new GridLayout(1,1));
        getContentPane().add(DiagMontanteGauche, new
        org.netbeans.lib.awtextra.AbsoluteConstraints(45, 45*(ord+2), 45, 45));
        
        DiagDescendanteDroite.setLayout(new GridLayout(1,1));
        getContentPane().add(DiagDescendanteDroite, new
        org.netbeans.lib.awtextra.AbsoluteConstraints(45*(abs+2), 45, 45, 45));
        
        DiagMontanteDroite.setLayout(new GridLayout(1,1));
        getContentPane().add(DiagMontanteDroite, new
        org.netbeans.lib.awtextra.AbsoluteConstraints(45*(abs+2), 45*(ord+2), 45, 45));
        
        
        
        
        
        
        // Paramètrage du rectangle de gauche pour acceullir les boutons
        PanneauBoutonsVerticaux.setLayout(new GridLayout(ord, 1));
            getContentPane().add(PanneauBoutonsVerticaux, new
        org.netbeans.lib.awtextra.AbsoluteConstraints(45, 90, 1 * 45, ord * 45));
            this.pack();
            this.revalidate();
            
        // Création du panneau de boutons verticaux (pour les lignes)
        for ( i = 0; i < ord; i++) {
            JButton bouton_ligne = new JButton("→");
            
            ActionListener ecouteurClick;
            ecouteurClick = new ActionListener() {
                final int j = i;
                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerLigneDeCellules(j);
                    repaint();
                    victoire();
                }
            };
            bouton_ligne.addActionListener(ecouteurClick);
            PanneauBoutonsVerticaux.add(bouton_ligne);
        }
        
        
        // Paramètrage du rectangle du haut pour acceullir les boutons
        PanneauBoutonsHorizontaux.setLayout(new GridLayout(1, abs));
            getContentPane().add(PanneauBoutonsHorizontaux, new
        org.netbeans.lib.awtextra.AbsoluteConstraints(90, 45, abs* 45,45));
            this.pack();
            this.revalidate();
        
        // Création du panneau de boutons horizontaux (pour activer les colonnes)
        for ( i = 0; i < abs; i++) {
            final int j = i;
            JButton bouton_colonne = new JButton("↓");
            
            ActionListener ecouteurClick;
            ecouteurClick = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerColonneDeCellules(j);
                    repaint();
                    victoire();
                }
            };
            bouton_colonne.addActionListener(ecouteurClick);
            PanneauBoutonsHorizontaux.add(bouton_colonne);
        }
        
        
        // Création d'une grille de nbColonnes colonnes et de nbLignes lignes.
        this.grille = new GrilleDeCellules(abs, ord);
        PanneauGrille.setLayout(new GridLayout(ord, abs));
        
        for (int i=0; i < nbLignes; i++) {        

            for (int j=0; j < nbColonnes; j++ ) {
                CelluleGraphique bouton_cellule = new CelluleGraphique(grille.grille[i][j],50,50); // création d'un bouton
                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
            }
        }
        
        // Mélange de la grille
        initialiserPartie(diff);
        
    }
   


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        PanneauBoutonsVerticaux = new javax.swing.JPanel();
        PanneauBoutonsHorizontaux = new javax.swing.JPanel();
        DiagDescendanteGauche = new javax.swing.JPanel();
        BtnDiagDescendanteGauche = new javax.swing.JButton();
        DiagMontanteDroite = new javax.swing.JPanel();
        BtnDiagMontanteDroite = new javax.swing.JButton();
        DiagMontanteGauche = new javax.swing.JPanel();
        BtnDiagMontanteGauche = new javax.swing.JButton();
        DiagDescendanteDroite = new javax.swing.JPanel();
        BtnDiagDescendanteDroite = new javax.swing.JButton();
        texteCoups = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(2000, 2000));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setPreferredSize(new java.awt.Dimension(800, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(2, 2, 200));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 430, 410));

        javax.swing.GroupLayout PanneauBoutonsVerticauxLayout = new javax.swing.GroupLayout(PanneauBoutonsVerticaux);
        PanneauBoutonsVerticaux.setLayout(PanneauBoutonsVerticauxLayout);
        PanneauBoutonsVerticauxLayout.setHorizontalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        PanneauBoutonsVerticauxLayout.setVerticalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 60, 430));

        javax.swing.GroupLayout PanneauBoutonsHorizontauxLayout = new javax.swing.GroupLayout(PanneauBoutonsHorizontaux);
        PanneauBoutonsHorizontaux.setLayout(PanneauBoutonsHorizontauxLayout);
        PanneauBoutonsHorizontauxLayout.setHorizontalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        PanneauBoutonsHorizontauxLayout.setVerticalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 430, 40));

        BtnDiagDescendanteGauche.setText("↘");
        BtnDiagDescendanteGauche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDiagDescendanteGaucheActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DiagDescendanteGaucheLayout = new javax.swing.GroupLayout(DiagDescendanteGauche);
        DiagDescendanteGauche.setLayout(DiagDescendanteGaucheLayout);
        DiagDescendanteGaucheLayout.setHorizontalGroup(
            DiagDescendanteGaucheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DiagDescendanteGaucheLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnDiagDescendanteGauche)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DiagDescendanteGaucheLayout.setVerticalGroup(
            DiagDescendanteGaucheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DiagDescendanteGaucheLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnDiagDescendanteGauche)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(DiagDescendanteGauche, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 50));

        BtnDiagMontanteDroite.setText("↖");
        BtnDiagMontanteDroite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDiagMontanteDroiteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DiagMontanteDroiteLayout = new javax.swing.GroupLayout(DiagMontanteDroite);
        DiagMontanteDroite.setLayout(DiagMontanteDroiteLayout);
        DiagMontanteDroiteLayout.setHorizontalGroup(
            DiagMontanteDroiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DiagMontanteDroiteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnDiagMontanteDroite)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DiagMontanteDroiteLayout.setVerticalGroup(
            DiagMontanteDroiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DiagMontanteDroiteLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(BtnDiagMontanteDroite)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(DiagMontanteDroite, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, -1, -1));

        BtnDiagMontanteGauche.setText("↗");
        BtnDiagMontanteGauche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDiagMontanteGaucheActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DiagMontanteGaucheLayout = new javax.swing.GroupLayout(DiagMontanteGauche);
        DiagMontanteGauche.setLayout(DiagMontanteGaucheLayout);
        DiagMontanteGaucheLayout.setHorizontalGroup(
            DiagMontanteGaucheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DiagMontanteGaucheLayout.createSequentialGroup()
                .addComponent(BtnDiagMontanteGauche)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        DiagMontanteGaucheLayout.setVerticalGroup(
            DiagMontanteGaucheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DiagMontanteGaucheLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnDiagMontanteGauche)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(DiagMontanteGauche, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, -1, -1));

        BtnDiagDescendanteDroite.setText("↙");
        BtnDiagDescendanteDroite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDiagDescendanteDroiteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DiagDescendanteDroiteLayout = new javax.swing.GroupLayout(DiagDescendanteDroite);
        DiagDescendanteDroite.setLayout(DiagDescendanteDroiteLayout);
        DiagDescendanteDroiteLayout.setHorizontalGroup(
            DiagDescendanteDroiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DiagDescendanteDroiteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnDiagDescendanteDroite)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DiagDescendanteDroiteLayout.setVerticalGroup(
            DiagDescendanteDroiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DiagDescendanteDroiteLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(BtnDiagDescendanteDroite)
                .addGap(22, 22, 22))
        );

        getContentPane().add(DiagDescendanteDroite, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 80, 70));

        texteCoups.setText("0");
        getContentPane().add(texteCoups, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 40, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDiagDescendanteGaucheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDiagDescendanteGaucheActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleDescendanteGauche();
        repaint();
        victoire();
    }//GEN-LAST:event_BtnDiagDescendanteGaucheActionPerformed

    private void BtnDiagMontanteGaucheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDiagMontanteGaucheActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleMontanteGauche();
        repaint();
        victoire();
    }//GEN-LAST:event_BtnDiagMontanteGaucheActionPerformed

    private void BtnDiagDescendanteDroiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDiagDescendanteDroiteActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleDescendanteDroite();
        repaint();
        victoire();
    }//GEN-LAST:event_BtnDiagDescendanteDroiteActionPerformed

    private void BtnDiagMontanteDroiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDiagMontanteDroiteActionPerformed
        // TODO add your handling code here:
        grille.activerDiagonaleMontanteDroite();
        repaint();
        victoire();
    }//GEN-LAST:event_BtnDiagMontanteDroiteActionPerformed

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
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale(ord,abs, diff).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDiagDescendanteDroite;
    private javax.swing.JButton BtnDiagDescendanteGauche;
    private javax.swing.JButton BtnDiagMontanteDroite;
    private javax.swing.JButton BtnDiagMontanteGauche;
    private javax.swing.JPanel DiagDescendanteDroite;
    private javax.swing.JPanel DiagDescendanteGauche;
    private javax.swing.JPanel DiagMontanteDroite;
    private javax.swing.JPanel DiagMontanteGauche;
    private javax.swing.JPanel PanneauBoutonsHorizontaux;
    private javax.swing.JPanel PanneauBoutonsVerticaux;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JLabel texteCoups;
    // End of variables declaration//GEN-END:variables
}
