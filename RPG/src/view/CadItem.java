/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dataservice.PersistenciaItem;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import model.Item;
import model.Jogador;
import resources.ItemTableModel;

/**
 *
 * @author felipe_baumgartel
 */
public class CadItem extends javax.swing.JFrame {

    /**
     * Creates new form CadItem
     */
    public CadItem() {
        initComponents();
        setTitle("Cadastro de Item");
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
        btCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btSalvar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        btDeletar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txAtributo = new javax.swing.JTextField();
        txTipo = new javax.swing.JTextField();
        txDefesa = new javax.swing.JTextField();
        txAtaque = new javax.swing.JTextField();
        txPeso = new javax.swing.JTextField();
        txDescricao = new javax.swing.JTextField();
        txNome = new javax.swing.JTextField();
        txId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txNivel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.BorderLayout());

        btNovo.setBackground(new java.awt.Color(0, 204, 204));
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        jPanel1.add(btNovo);

        btCancelar.setBackground(new java.awt.Color(0, 204, 204));
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btCancelar);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

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

        btDeletar.setBackground(new java.awt.Color(0, 204, 204));
        btDeletar.setText("Deletar");
        btDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarActionPerformed(evt);
            }
        });
        jPanel2.add(btDeletar);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        txAtributo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txAtributoKeyTyped(evt);
            }
        });

        txTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txTipoKeyTyped(evt);
            }
        });

        txDefesa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txDefesaKeyTyped(evt);
            }
        });

        txAtaque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txAtaqueKeyTyped(evt);
            }
        });

        txPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txPesoKeyTyped(evt);
            }
        });

        txDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txDescricaoKeyTyped(evt);
            }
        });

        txNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txNomeKeyTyped(evt);
            }
        });

        txId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txIdKeyTyped(evt);
            }
        });

        jLabel1.setText("ID:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Descrição:");

        jLabel4.setText("Peso:");

        jLabel6.setText("Ataque:");

        jLabel5.setText("Defesa:");

        jLabel7.setText("Tipo:");

        jLabel8.setText("Atributo:");

        txNivel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txNivelKeyTyped(evt);
            }
        });

        jLabel9.setText("Nível:");

        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txDescricao)
                    .addComponent(txPeso)
                    .addComponent(txNome)
                    .addComponent(txId, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(txDefesa)
                    .addComponent(txTipo)
                    .addComponent(txAtaque, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(txAtributo)
                    .addComponent(txNivel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txDefesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (txId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Você não pode gravar sem um codigo");
        } else if (txNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Você não pode gravar sem um Nome");
        } else if (txDescricao.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Você não pode gravar sem uma Descricao");
        } else if (txPeso.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Você não pode gravar sem um Peso");
        } else if (txAtaque.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Você não pode gravar sem um Ataque");
        } else if (txDefesa.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Você não pode gravar sem uma Defesa");
        } else if (txTipo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Você não pode gravar sem um Tipo");
        } else if (txAtributo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Você não pode gravar sem um Atributo");
        } else if (txNivel.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Você não pode gravar sem um Nivel");
        } else {
            PersistenciaItem.save(CriarItem());
            JOptionPane.showMessageDialog(null, "Item cadastrado com Sucesso");
            atualizarTabela();
            limparCampos();
            desabilitarComponentes();
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void txAtributoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txAtributoKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txAtributoKeyTyped

    private void txTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txTipoKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txTipoKeyTyped

    private void txDefesaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txDefesaKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9' || c == '.') {
            evt.consume();
        }
    }//GEN-LAST:event_txDefesaKeyTyped

    private void txAtaqueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txAtaqueKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9' || c == '.') {
            evt.consume();
        }
    }//GEN-LAST:event_txAtaqueKeyTyped

    private void txPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txPesoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9' || c == '.') {
            evt.consume();
        }
    }//GEN-LAST:event_txPesoKeyTyped

    private void txDescricaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txDescricaoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9' || c == '.') {
            evt.consume();
        }
    }//GEN-LAST:event_txDescricaoKeyTyped

    private void txNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txNomeKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txNomeKeyTyped

    private void txIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txIdKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txIdKeyTyped

    private void txNivelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txNivelKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9' || c == '.') {
            evt.consume();
        }
    }//GEN-LAST:event_txNivelKeyTyped

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        Item a = itm.getValueAT(jTable1.getSelectedRow());
        PersistenciaItem.delete(a);
        JOptionPane.showMessageDialog(null, "Item deletado com sucesso");
        atualizarTabela();
    }//GEN-LAST:event_btDeletarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() > 1) {

            Item a = itm.getValueAT(jTable1.getSelectedRow());
            recuperarItem(a);
            txId.setEnabled(false);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    private void habilitarComponentes() {
        txId.setEnabled(true);
        txNome.setEnabled(true);
        txDescricao.setEnabled(true);
        txPeso.setEnabled(true);
        txAtaque.setEnabled(true);
        txDefesa.setEnabled(true);
        txTipo.setEnabled(true);
        txAtributo.setEnabled(true);
        txNivel.setEnabled(true);
        btCancelar.setEnabled(true);
        btSalvar.setEnabled(true);
    }

    private void desabilitarComponentes() {
        txId.setEnabled(false);
        txNome.setEnabled(false);
        txDescricao.setEnabled(false);
        txPeso.setEnabled(false);
        txAtaque.setEnabled(false);
        txDefesa.setEnabled(false);
        txTipo.setEnabled(false);
        txAtributo.setEnabled(false);
        txNivel.setEnabled(false);
        btCancelar.setEnabled(false);
        btSalvar.setEnabled(false);
    }

    private Item CriarItem() {
        int Id = Integer.parseInt(txId.getText());
        String Nome = txNome.getText();
        String Descricao = txDescricao.getText();
        double Peso = Double.parseDouble(txPeso.getText());
        int Ataque = Integer.parseInt(txAtaque.getText());
        int Defesa = Integer.parseInt(txDefesa.getText());
        String Tipo = txTipo.getText();
        String Atributo = txAtributo.getText();
        int Nivel = Integer.parseInt(txNivel.getText());

        Item item1 = new Item(Id, Nome, Descricao, Peso, Ataque, Defesa, Tipo, Atributo, Nivel);

        return item1;
    }

    private void limparCampos() {
        txId.setText("");
        txNome.setText("");
        txDescricao.setText("");
        txPeso.setText("");
        txAtaque.setText("");
        txDefesa.setText("");
        txTipo.setText("");
        txAtributo.setText("");
        txNivel.setText("");
        btCancelar.removeAll();
        btSalvar.removeAll();
    }

    private TableModel carregarTabela() {
        List<Item> lista = PersistenciaItem.list();
        itm = new ItemTableModel(lista);
        return itm;
    }

    private void atualizarTabela() {
        jTable1.setModel(carregarTabela());
    }

    private void recuperarItem(Item a) {
        habilitarComponentes();
        txId.setText(String.valueOf(a.getId()));
        txNome.setText(a.getNome());
        txDescricao.setText(a.getDescricao());
        txPeso.setText(String.valueOf(a.getPeso()));
        txAtaque.setText(String.valueOf(a.getAtaque()));
        txDefesa.setText(String.valueOf(a.getDefesa()));
        txTipo.setText(a.getTipo());
        txAtributo.setText(a.getAtributo());
        txNivel.setText(String.valueOf(a.getNivel()));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txAtaque;
    private javax.swing.JTextField txAtributo;
    private javax.swing.JTextField txDefesa;
    private javax.swing.JTextField txDescricao;
    private javax.swing.JTextField txId;
    private javax.swing.JTextField txNivel;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txPeso;
    private javax.swing.JTextField txTipo;
    // End of variables declaration//GEN-END:variables
Item item;
    private ItemTableModel itm;
}