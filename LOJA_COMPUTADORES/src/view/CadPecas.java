/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dataservice.PersistenciaPecas;
import model.Pecas;
import javax.swing.JOptionPane;

/**
 *
 * @author felipe_baumgartel
 */
public class CadPecas extends javax.swing.JFrame {

    static PersistenciaPecas perP = new PersistenciaPecas();

    /**
     * Creates new form Pecas
     */
    public CadPecas() {
        initComponents();
        setTitle("Cadastro de Peças");
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

        jPanel1 = new javax.swing.JPanel();
        btNovo = new javax.swing.JButton();
        btResgatar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btSalvar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        btNovo.setBackground(new java.awt.Color(0, 204, 204));
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        jPanel1.add(btNovo);

        btResgatar.setBackground(new java.awt.Color(0, 204, 204));
        btResgatar.setText("Resgatar");
        btResgatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResgatarActionPerformed(evt);
            }
        });
        jPanel1.add(btResgatar);

        btCancelar.setBackground(new java.awt.Color(0, 204, 204));
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btCancelar);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        btSalvar.setBackground(new java.awt.Color(0, 204, 204));
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(btSalvar);

        btVoltar.setBackground(new java.awt.Color(0, 204, 204));
        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        jPanel2.add(btVoltar);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setText("ID:");

        jLabel2.setText("Marca:");

        jLabel3.setText("Preço:");

        jLabel4.setText("Quantidade:");

        jLabel5.setText("Descrição:");

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txPreco, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txQuantidade)
                            .addComponent(txMarca)
                            .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        habilitarComponentes();
        limparCampos();
        txId.requestFocus();
    }//GEN-LAST:event_btNovoActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        desabilitarComponentes();
        limparCampos();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (txId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Você não pode gravar sem um codigo");
        } else if (txMarca.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Você não pode gravar sem uma marca");
        } else if (txPreco.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Você não pode gravar sem um preço");
        } else if (txQuantidade.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Você não pode gravar sem uma quantidade");
        } else if (txaDescricao.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Você não pode gravar sem uma descrição");
        } else {
            PersistenciaPecas.save(CriarPeca());
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");
            desabilitarComponentes();
            limparCampos();
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btResgatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResgatarActionPerformed
        resgatarPeca(Peca);
    }//GEN-LAST:event_btResgatarActionPerformed

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

    private void txMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txMarcaKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txMarcaKeyTyped

    private void txPrecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txPrecoKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c != '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txPrecoKeyTyped

    /**
     * @param args the command line arguments
     */
    

    private void habilitarComponentes() {
        txId.setEnabled(true);
        txMarca.setEnabled(true);
        txPreco.setEnabled(true);
        txaDescricao.setEnabled(true);
        txQuantidade.setEnabled(true);
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
        btCancelar.setEnabled(false);
        btSalvar.setEnabled(false);
        btResgatar.setEnabled(false);
    }

    private Pecas CriarPeca() {
        int Id = Integer.parseInt(txId.getText());
        String Marca = txMarca.getText();
        String Descricao = txaDescricao.getText();
        double Preco = Double.parseDouble(txPreco.getText());
        int Quantidade = Integer.parseInt(txQuantidade.getText());

        Pecas peca = new Pecas(Id, Marca, Preco, Descricao, Quantidade);

        return peca;
    }

    private void limparCampos() {
        txId.setText("");
        txMarca.setText("");
        txPreco.setText("");;
        txaDescricao.setText("");
        txQuantidade.setText("");
        btResgatar.removeAll();
        btCancelar.removeAll();
        btSalvar.removeAll();
    }

    public void resgatarPeca(Pecas a) {
        txId.setText(String.valueOf(a.getId()));
        txMarca.setText(a.getMarca());
        txaDescricao.setText(a.getDescricao());
        txPreco.setText(String.valueOf(a.getPreco()));
        txQuantidade.setText(String.valueOf(a.getQuantidade()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btResgatar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txId;
    private javax.swing.JTextField txMarca;
    private javax.swing.JTextField txPreco;
    private javax.swing.JTextField txQuantidade;
    private javax.swing.JTextArea txaDescricao;
    // End of variables declaration//GEN-END:variables
Pecas Peca;
}
