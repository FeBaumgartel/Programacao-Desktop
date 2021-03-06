/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dataservice.PersistenciaDesktops;
import dataservice.PersistenciaNotebooks;
import model.Desktops;
import model.Notebooks;
import javax.swing.JOptionPane;

/**
 *
 * @author felipe_baumgartel
 */
public class CadComputador extends javax.swing.JFrame {

    static PersistenciaNotebooks perN = new PersistenciaNotebooks();
    static PersistenciaDesktops perD = new PersistenciaDesktops();

    /**
     * Creates new form Computador
     */
    public CadComputador() {
        initComponents();
        setTitle("Cadastro de Computador");
        setLocationRelativeTo(null);
        txId.requestFocus();
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
        jPanel1 = new javax.swing.JPanel();
        btSalvar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btNovo = new javax.swing.JButton();
        btResgatar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        rbDesktop = new javax.swing.JRadioButton();
        rbNotebook = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txId = new javax.swing.JTextField();
        txMarca = new javax.swing.JTextField();
        txPreco = new javax.swing.JTextField();
        txQuantidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescricao = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        btSalvar.setBackground(new java.awt.Color(0, 204, 204));
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btSalvar);

        btVoltar.setBackground(new java.awt.Color(0, 204, 204));
        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btVoltar);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        btNovo.setBackground(new java.awt.Color(0, 204, 204));
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        jPanel2.add(btNovo);

        btResgatar.setBackground(new java.awt.Color(0, 204, 204));
        btResgatar.setText("Resgatar");
        btResgatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResgatarActionPerformed(evt);
            }
        });
        jPanel2.add(btResgatar);

        btCancelar.setBackground(new java.awt.Color(0, 204, 204));
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btCancelar);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        buttonGroup1.add(rbDesktop);
        rbDesktop.setText("Desktop");

        buttonGroup1.add(rbNotebook);
        rbNotebook.setText("Notebook");

        jLabel1.setText("ID:");

        jLabel2.setText("Marca:");

        jLabel3.setText("Pre??o:");

        jLabel4.setText("Quantidade:");

        jLabel5.setText("Descri????o:");

        txId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txIdKeyTyped(evt);
            }
        });

        txMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txMarcaKeyTyped(evt);
            }
        });

        txPreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txPrecoKeyTyped(evt);
            }
        });

        txQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txQuantidadeKeyTyped(evt);
            }
        });

        txaDescricao.setColumns(20);
        txaDescricao.setRows(5);
        jScrollPane1.setViewportView(txaDescricao);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbDesktop)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbNotebook)
                            .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txMarca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(txPreco, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txQuantidade, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbDesktop)
                    .addComponent(rbNotebook))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        habilitarComponentes();
        limparCampos();
        txId.requestFocus();
    }//GEN-LAST:event_btNovoActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        desabilitarComponentes();
        limparCampos();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (txId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Voc?? n??o pode gravar sem um codigo");
        } else if (txMarca.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Voc?? n??o pode gravar sem uma marca");
        } else if (txPreco.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Voc?? n??o pode gravar sem um pre??o");
        } else if (txQuantidade.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Voc?? n??o pode gravar sem uma quantidade");
        } else if (txaDescricao.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Voc?? n??o pode gravar sem uma descri????o");
        } else if (rbDesktop.isSelected()) {
            num = 1;
            PersistenciaDesktops.save(CriarDesktop());
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");
            desabilitarComponentes();
            limparCampos();
        } else {
            num = 0;
            PersistenciaNotebooks.save(CriarNote());
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");
            desabilitarComponentes();
            limparCampos();
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btResgatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResgatarActionPerformed
        if (num == 1) {
            resgatarDesktop(desktop);
        } else {
            resgatarNote(notebook);
        }
    }//GEN-LAST:event_btResgatarActionPerformed

    private void txPrecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txPrecoKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c != '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txPrecoKeyTyped

    private void txMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txMarcaKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txMarcaKeyTyped

    private void txIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txIdKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txIdKeyTyped

    private void txQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txQuantidadeKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txQuantidadeKeyTyped

    /**
     * @param args the command line arguments
     */
    

    private void habilitarComponentes() {
        txId.setEnabled(true);
        txMarca.setEnabled(true);
        txPreco.setEnabled(true);
        txaDescricao.setEnabled(true);
        txQuantidade.setEnabled(true);
        rbDesktop.setEnabled(true);
        rbNotebook.setEnabled(true);
        btCancelar.setEnabled(true);
        btSalvar.setEnabled(true);
        btResgatar.setEnabled(true);
    }

    private void desabilitarComponentes() {
        txId.setEnabled(false);
        txMarca.setEnabled(false);
        txPreco.setEnabled(false);
        txaDescricao.setEnabled(false);
        txQuantidade.setEnabled(false);
        rbDesktop.setEnabled(false);
        rbNotebook.setEnabled(false);
        btCancelar.setEnabled(false);
        btSalvar.setEnabled(false);
        btResgatar.setEnabled(false);
    }

    private Desktops CriarDesktop() {
        int Id = Integer.parseInt(txId.getText());
        String Marca = txMarca.getText();
        String Descricao = txaDescricao.getText();
        double Preco = Double.parseDouble(txPreco.getText());
        int Quantidade = Integer.parseInt(txQuantidade.getText());

        Desktops desktop = new Desktops(Id, Marca, Preco, Descricao, Quantidade);

        return desktop;
    }

    private Notebooks CriarNote() {
        int Id = Integer.parseInt(txId.getText());
        String Marca = txMarca.getText();
        String Descricao = txaDescricao.getText();
        double Preco = Double.parseDouble(txPreco.getText());
        int Quantidade = Integer.parseInt(txQuantidade.getText());

        Notebooks notebook = new Notebooks(Id, Marca, Preco, Descricao, Quantidade);

        return notebook;
    }

    private void limparCampos() {
        txId.setText("");
        txMarca.setText("");
        txPreco.setText("");
        txaDescricao.setText("");
        txQuantidade.setText("");
        buttonGroup1.clearSelection();
        btResgatar.removeAll();
        btCancelar.removeAll();
        btSalvar.removeAll();
    }

    public void resgatarDesktop(Desktops a) {
        txId.setText(String.valueOf(a.getId()));
        txMarca.setText(a.getMarca());
        txaDescricao.setText(a.getDescricao());
        txPreco.setText(String.valueOf(a.getPreco()));
        txQuantidade.setText(String.valueOf(a.getQuantidade()));
        if (num == 1) {
            rbDesktop.setSelected(true);
        } else {
            rbNotebook.setSelected(true);
        }
    }

    public void resgatarNote(Notebooks a) {
        txId.setText(String.valueOf(a.getId()));
        txMarca.setText(a.getMarca());
        txaDescricao.setText(a.getDescricao());
        txPreco.setText(String.valueOf(a.getPreco()));
        txQuantidade.setText(String.valueOf(a.getQuantidade()));
        if (num == 1) {
            rbDesktop.setSelected(true);
        } else {
            rbNotebook.setSelected(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btResgatar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbDesktop;
    private javax.swing.JRadioButton rbNotebook;
    private javax.swing.JTextField txId;
    private javax.swing.JTextField txMarca;
    private javax.swing.JTextField txPreco;
    private javax.swing.JTextField txQuantidade;
    private javax.swing.JTextArea txaDescricao;
    // End of variables declaration//GEN-END:variables
    Desktops desktop;
    Notebooks notebook;
    int num;
}
