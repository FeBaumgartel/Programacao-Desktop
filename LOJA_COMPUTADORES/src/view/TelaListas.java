/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author felipe_baumgartel
 */
public class TelaListas extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public TelaListas() {
        initComponents();
        setTitle("Selecione a Listagem");
        setLocationRelativeTo(null);
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
        btVoltar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btSoftwares = new javax.swing.JButton();
        btServicos = new javax.swing.JButton();
        btPecas = new javax.swing.JButton();
        btNotebook = new javax.swing.JButton();
        btDesktop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btVoltar.setBackground(new java.awt.Color(0, 204, 204));
        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 57, Short.MAX_VALUE)
                .addComponent(btVoltar))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(btVoltar))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        btSoftwares.setBackground(new java.awt.Color(0, 204, 204));
        btSoftwares.setText("Softwares");
        btSoftwares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSoftwaresActionPerformed(evt);
            }
        });

        btServicos.setBackground(new java.awt.Color(0, 204, 204));
        btServicos.setText("Servi??os");
        btServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btServicosActionPerformed(evt);
            }
        });

        btPecas.setBackground(new java.awt.Color(0, 204, 204));
        btPecas.setText("Pe??as");
        btPecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPecasActionPerformed(evt);
            }
        });

        btNotebook.setBackground(new java.awt.Color(0, 204, 204));
        btNotebook.setText("Notebook");
        btNotebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNotebookActionPerformed(evt);
            }
        });

        btDesktop.setBackground(new java.awt.Color(0, 204, 204));
        btDesktop.setText("Desktop");
        btDesktop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDesktopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btSoftwares, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btServicos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btNotebook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btPecas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btDesktop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btDesktop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btNotebook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btPecas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btServicos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSoftwares)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btDesktopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDesktopActionPerformed
        new TabelaDesktop().setVisible(true);
    }//GEN-LAST:event_btDesktopActionPerformed

    private void btNotebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNotebookActionPerformed
        new TabelaNotebook().setVisible(true);
    }//GEN-LAST:event_btNotebookActionPerformed

    private void btPecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPecasActionPerformed
        new TabelaPeca().setVisible(true);
    }//GEN-LAST:event_btPecasActionPerformed

    private void btServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btServicosActionPerformed
        new TabelaServico().setVisible(true);
    }//GEN-LAST:event_btServicosActionPerformed

    private void btSoftwaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSoftwaresActionPerformed
        new TabelaSoftware().setVisible(true);
    }//GEN-LAST:event_btSoftwaresActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDesktop;
    private javax.swing.JButton btNotebook;
    private javax.swing.JButton btPecas;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSair1;
    private javax.swing.JButton btSair2;
    private javax.swing.JButton btServicos;
    private javax.swing.JButton btSoftwares;
    private javax.swing.JButton btVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
