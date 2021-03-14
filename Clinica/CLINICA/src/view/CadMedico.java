/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dataservices.PersMedico;
import dataservices.dao.MedicoDAO;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import model.Medico;
import resources.MedicoTableModel;

/**
 *
 * @author felipe_baumgartel
 */
public class CadMedico extends javax.swing.JFrame {

    MedicoDAO dao = new MedicoDAO();

    public CadMedico() {
        initComponents();
        desabilitaComponetes();
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        atualizarTabela();
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
        btCancelar = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btDeletar = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        txMatricula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txFormacao = new javax.swing.JTextField();
        txAreaAtuacao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txIdade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txTelefone = new javax.swing.JFormattedTextField();
        txDataNascimento = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.BorderLayout());

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btCancelar);

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        jPanel1.add(btNovo);

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btSalvar);

        btDeletar.setText("Deletar");
        btDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarActionPerformed(evt);
            }
        });
        jPanel1.add(btDeletar);

        btFechar.setText("Fechar");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });
        jPanel1.add(btFechar);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabela);

        txMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txMatriculaKeyTyped(evt);
            }
        });

        jLabel1.setText("Matricula");

        jLabel2.setText("Nome");

        txNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txNomeKeyTyped(evt);
            }
        });

        jLabel3.setText("Telefone");

        jLabel5.setText("Formação");

        jLabel6.setText("Área de Atuação");

        txIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txIdadeActionPerformed(evt);
            }
        });
        txIdade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txIdadeKeyTyped(evt);
            }
        });

        jLabel4.setText("Idade");

        jLabel7.setText("Data de Nascimento");

        try {
            txTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txFormacao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txIdade)
                            .addComponent(txAreaAtuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txMatricula)
                    .addComponent(txNome)
                    .addComponent(txTelefone)
                    .addComponent(txDataNascimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txFormacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txAreaAtuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 90, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        limpaCampoDetexto();
        HabilitaComponetes();
    }//GEN-LAST:event_btNovoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        Medico medico = criarMedico();

        if (!medico.verificarExistenciaDeMedico(medico)) {
            dao.save(criarMedico());
        } else {
            dao.update(criarMedico());
        }
        JOptionPane.showMessageDialog(null, "Medico cadastrado com sucesso");
        atualizarTabela();
        limpaCampoDetexto();
        desabilitaComponetes();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        Medico a = mtm.getValueAT(tabela.getSelectedRow());
        dao.remove(a);
        JOptionPane.showMessageDialog(null, "Medico deletado com sucesso");
        atualizarTabela();
    }//GEN-LAST:event_btDeletarActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        if (evt.getClickCount() > 1) {

            Medico a = mtm.getValueAT(tabela.getSelectedRow());
            recuperaMedico(a);
            txMatricula.setEnabled(false);
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void txMatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txMatriculaKeyTyped

    }//GEN-LAST:event_txMatriculaKeyTyped

    private void txNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txNomeKeyTyped
        deixaUpper(evt);
    }//GEN-LAST:event_txNomeKeyTyped

    private void txIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txIdadeActionPerformed

    private void txIdadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txIdadeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txIdadeKeyTyped

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        limpaCampoDetexto();
        desabilitaComponetes();
    }//GEN-LAST:event_btCancelarActionPerformed
    private void deixaUpper(KeyEvent e) {

        char keyChar = e.getKeyChar();
        if (Character.isLowerCase(keyChar)) {
            e.setKeyChar(Character.toUpperCase(keyChar));
        }
    }

    private Medico criarMedico() {
        int matricula = Integer.parseInt(txMatricula.getText());
        String nome = txNome.getText();
        String telefone = txTelefone.getText();
        int idade = Integer.parseInt(txIdade.getText());
        String formacao = txFormacao.getText();
        String areaAtuacao = txAreaAtuacao.getText();

        // Convertente de String pra LocalDate (Java 8)
        String aLD = txDataNascimento.getText();
        LocalDate dataNascimento = LocalDate.parse(aLD);

        return new Medico(matricula, nome, telefone, dataNascimento, idade, formacao, areaAtuacao);
    }

    private void recuperaMedico(Medico a) {
        HabilitaComponetes();
        txMatricula.setText(String.valueOf(a.getMatricula()));
        txNome.setText(a.getNome());
        txTelefone.setText(a.getTelefone());
        txIdade.setText(String.valueOf(a.getIdade()));
        txFormacao.setText(a.getFormacao());
        txAreaAtuacao.setText(a.getAreaAtuacao());
        txDataNascimento.setText(String.valueOf(a.getDataNascimento()));
    }

    private void limpaCampoDetexto() {
        txMatricula.setText("");
        txNome.setText("");
        txTelefone.setText("");
        txIdade.setText("");
        txFormacao.setText("");
        txAreaAtuacao.setText("");
        txDataNascimento.setText("");
    }

    private void HabilitaComponetes() {
        txMatricula.setEnabled(true);
        txNome.setEnabled(true);
        txTelefone.setEnabled(true);
        txIdade.setEnabled(true);
        txFormacao.setEnabled(true);
        txAreaAtuacao.setEnabled(true);
        txDataNascimento.setEnabled(true);

        btNovo.setEnabled(false);
        btCancelar.setEnabled(true);
        btSalvar.setEnabled(true);
    }

    private void desabilitaComponetes() {
        txMatricula.setEnabled(false);
        txNome.setEnabled(false);
        txTelefone.setEnabled(false);
        txIdade.setEnabled(false);
        txFormacao.setEnabled(false);
        txAreaAtuacao.setEnabled(false);
        txDataNascimento.setEnabled(false);

        btNovo.setEnabled(true);
        btCancelar.setEnabled(false);
        btSalvar.setEnabled(false);
    }

    private TableModel carregarTabela() {
        List<Medico> lista = dao.list();
        mtm = new MedicoTableModel(lista);
        return mtm;
    }

    private void atualizarTabela() {
        tabela.setModel(carregarTabela());
    }

    private MedicoTableModel mtm;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txAreaAtuacao;
    private javax.swing.JFormattedTextField txDataNascimento;
    private javax.swing.JTextField txFormacao;
    private javax.swing.JTextField txIdade;
    private javax.swing.JTextField txMatricula;
    private javax.swing.JTextField txNome;
    private javax.swing.JFormattedTextField txTelefone;
    // End of variables declaration//GEN-END:variables
}
