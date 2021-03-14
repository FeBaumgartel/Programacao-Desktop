/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dataservices.PersCliente;
import dataservices.dao.ClienteDAO;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import model.Cliente;
import model.Endereco;
import resources.ClienteTableModel;

/**
 *
 * @author felipe_baumgartel
 */
public class CadCliente extends javax.swing.JFrame {

    ClienteDAO dao = new ClienteDAO();

    public CadCliente() {
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
        jLabel1 = new javax.swing.JLabel();
        txId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txNumeroCasa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txRua = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txBairro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txAlergias = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txIdade = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txReferencia = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txComplemento = new javax.swing.JTextField();
        txCidade = new javax.swing.JTextField();
        txCpf = new javax.swing.JFormattedTextField();
        txRg = new javax.swing.JFormattedTextField();
        txTelefone = new javax.swing.JFormattedTextField();
        txCelular = new javax.swing.JFormattedTextField();
        cbTipoSanguineo = new javax.swing.JComboBox();
        txDataNascimento = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaObservacoes = new javax.swing.JTextArea();
        txCep = new javax.swing.JFormattedTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

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

        jLabel1.setText("ID");

        txId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txIdKeyTyped(evt);
            }
        });

        jLabel2.setText("Nome");

        txNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txNomeKeyTyped(evt);
            }
        });

        jLabel4.setText("CPF");

        jLabel5.setText("RG");

        jLabel6.setText("Telefone");

        jLabel7.setText("Bairro");

        jLabel8.setText("Número da Casa");

        txRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txRuaActionPerformed(evt);
            }
        });
        txRua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txRuaKeyTyped(evt);
            }
        });

        jLabel9.setText("Rua");

        jLabel3.setText("CEP");

        jLabel10.setText("Celular");

        jLabel11.setText("Alergias");

        jLabel12.setText("Observações");

        jLabel13.setText("Data de Nascimento");

        txAlergias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txAlergiasActionPerformed(evt);
            }
        });

        jLabel14.setText("Idade");

        txIdade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txIdadeKeyTyped(evt);
            }
        });

        jLabel15.setText("Tipo Sanguíneo");

        jLabel16.setText("Cidade");

        txReferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txReferenciaActionPerformed(evt);
            }
        });
        txReferencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txReferenciaKeyTyped(evt);
            }
        });

        jLabel17.setText("Referência");

        jLabel18.setText("Complemento");

        txComplemento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txComplementoKeyTyped(evt);
            }
        });

        txCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txCidadeKeyTyped(evt);
            }
        });

        try {
            txCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cbTipoSanguineo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));

        try {
            txDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txaObservacoes.setColumns(20);
        txaObservacoes.setRows(5);
        jScrollPane1.setViewportView(txaObservacoes);

        try {
            txCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel19.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel19.setText("Endereco");

        jLabel20.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel20.setText("Paciente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txNome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txCpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                    .addComponent(txRg, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txId)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txDataNascimento, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txIdade, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbTipoSanguineo, javax.swing.GroupLayout.Alignment.LEADING, 0, 199, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3)
                            .addComponent(jLabel16)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txBairro, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txRua, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txCep, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                                .addGap(64, 64, 64)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txReferencia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                    .addComponent(txComplemento, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txNumeroCasa))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(253, 253, 253))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1298, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(cbTipoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(txIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(txDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txAlergias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(txCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9)
                                            .addComponent(txRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(txBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel18)
                                            .addComponent(txComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(txReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel8)
                                                    .addComponent(txNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(txCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(402, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGap(0, 292, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        limpaCampoDetexto();
        HabilitaComponetes();
    }//GEN-LAST:event_btNovoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        Cliente cliente = criarCliente();

        if (!cliente.verificarExistenciaDeCliente(cliente)) {
            dao.save(criarCliente());
        } else {
            dao.update(criarCliente());
        }
        JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
        atualizarTabela();
        limpaCampoDetexto();
        desabilitaComponetes();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        Cliente a = ctm.getValueAT(tabela.getSelectedRow());
        dao.remove(a);
        JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso");
        atualizarTabela();
    }//GEN-LAST:event_btDeletarActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        if (evt.getClickCount() > 1) {

            Cliente a = ctm.getValueAT(tabela.getSelectedRow());
            recuperaCliente(a);
            txId.setEnabled(false);
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void txIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txIdKeyTyped

    }//GEN-LAST:event_txIdKeyTyped

    private void txNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txNomeKeyTyped
        deixaUpper(evt);
    }//GEN-LAST:event_txNomeKeyTyped

    private void txRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txRuaActionPerformed

    private void txRuaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txRuaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txRuaKeyTyped

    private void txIdadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txIdadeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txIdadeKeyTyped

    private void txReferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txReferenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txReferenciaActionPerformed

    private void txReferenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txReferenciaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txReferenciaKeyTyped

    private void txComplementoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txComplementoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txComplementoKeyTyped

    private void txCidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txCidadeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txCidadeKeyTyped

    private void txAlergiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txAlergiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txAlergiasActionPerformed

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

    private Endereco criarEndereco() {
        String CEP = txCep.getText();
        String rua = txRua.getText();
        String bairro = txBairro.getText();
        String Cidade = txCidade.getText();
        String Complemento = txComplemento.getText();
        String Referencia = txReferencia.getText();
        int Numero = Integer.parseInt(txNumeroCasa.getText());

        return new Endereco(CEP, rua, bairro, Cidade, Complemento, Referencia, Numero);
    }

    private Cliente criarCliente() {
        int id = Integer.parseInt(txId.getText());
        String nome = txNome.getText();
        String CPF = txCpf.getText();
        String RG = txRg.getText();
        String Telefone = txTelefone.getText();
        String Celular = txCelular.getText();
        String TipoSanguineo = (String) cbTipoSanguineo.getSelectedItem();
        int idade = Integer.parseInt(txIdade.getText());
        LocalDate dataNascimento = LocalDate.parse(txDataNascimento.getText());
        String alergias = txAlergias.getText();
        String observacoes = txaObservacoes.getText();
        //Endereco endereco = criarEndereco();

        return new Cliente(id, nome, CPF, RG, Telefone, Celular, TipoSanguineo, idade, dataNascimento, alergias, observacoes/*, endereco*/);
    }

    private void recuperaCliente(Cliente a) {
        HabilitaComponetes();
        txId.setText(String.valueOf(a.getID()));
        txNome.setText(a.getNome());
        txCpf.setText(a.getCpf());
        txRg.setText(a.getRg());
        txTelefone.setText(a.getTelefone());
        txCelular.setText(a.getCelular());
        cbTipoSanguineo.setSelectedItem(a.getTipo_sanguineo());
        txIdade.setText(String.valueOf(a.getIdade()));
        txDataNascimento.setText(String.valueOf(a.getDataNascimento()));
        txAlergias.setText(a.getAlergias());
        txaObservacoes.setText(a.getObservacao());

//        txCep.setText(String.valueOf(a.getEndereco().getCEP()));
//        txRua.setText(a.getEndereco().getRua());
//        txBairro.setText(a.getEndereco().getBairro());
//        txCidade.setText(a.getEndereco().getCidade());
//        txComplemento.setText(a.getEndereco().getComplemento());
//        txReferencia.setText(a.getEndereco().getReferencia());
//        txNumeroCasa.setText(String.valueOf(a.getEndereco().getNumero()));
    }

    private void limpaCampoDetexto() {
        txId.setText("");
        txNome.setText("");
        txCpf.setText("");
        txRg.setText("");
        txTelefone.setText("");
        txCelular.setText("");
        cbTipoSanguineo.setSelectedIndex(0);
        txIdade.setText("");
        txDataNascimento.setText("");
        txAlergias.setText("");
        txaObservacoes.setText("");
        txCep.setText("");
        txRua.setText("");
        txBairro.setText("");
        txCidade.setText("");
        txComplemento.setText("");
        txReferencia.setText("");
        txNumeroCasa.setText("");
    }

    private void HabilitaComponetes() {
        txId.setEnabled(true);
        txNome.setEnabled(true);
        txCpf.setEnabled(true);
        txRg.setEnabled(true);
        txTelefone.setEnabled(true);
        txCelular.setEnabled(true);
        cbTipoSanguineo.setEnabled(true);
        txIdade.setEnabled(true);
        txDataNascimento.setEnabled(true);
        txAlergias.setEnabled(true);
        txaObservacoes.setEnabled(true);
        txCep.setEnabled(true);
        txRua.setEnabled(true);
        txBairro.setEnabled(true);
        txCidade.setEnabled(true);
        txComplemento.setEnabled(true);
        txReferencia.setEnabled(true);
        txNumeroCasa.setEnabled(true);

        btNovo.setEnabled(false);
        btCancelar.setEnabled(true);
        btSalvar.setEnabled(true);
    }

    private void desabilitaComponetes() {
        txId.setEnabled(false);
        txNome.setEnabled(false);
        txCpf.setEnabled(false);
        txRg.setEnabled(false);
        txTelefone.setEnabled(false);
        txCelular.setEnabled(false);
        cbTipoSanguineo.setEnabled(false);
        txIdade.setEnabled(false);
        txDataNascimento.setEnabled(false);
        txAlergias.setEnabled(false);
        txaObservacoes.setEnabled(false);
        txCep.setEnabled(false);
        txRua.setEnabled(false);
        txBairro.setEnabled(false);
        txCidade.setEnabled(false);
        txComplemento.setEnabled(false);
        txReferencia.setEnabled(false);
        txNumeroCasa.setEnabled(false);

        btNovo.setEnabled(true);
        btCancelar.setEnabled(false);
        btSalvar.setEnabled(false);
    }

    private TableModel carregarTabela() {
        List<Cliente> lista = dao.list();
        ctm = new ClienteTableModel(lista);
        return ctm;
    }

    private void atualizarTabela() {
        tabela.setModel(carregarTabela());
    }

    private ClienteTableModel ctm;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbTipoSanguineo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txAlergias;
    private javax.swing.JTextField txBairro;
    private javax.swing.JFormattedTextField txCelular;
    private javax.swing.JFormattedTextField txCep;
    private javax.swing.JTextField txCidade;
    private javax.swing.JTextField txComplemento;
    private javax.swing.JFormattedTextField txCpf;
    private javax.swing.JFormattedTextField txDataNascimento;
    private javax.swing.JTextField txId;
    private javax.swing.JTextField txIdade;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txNumeroCasa;
    private javax.swing.JTextField txReferencia;
    private javax.swing.JFormattedTextField txRg;
    private javax.swing.JTextField txRua;
    private javax.swing.JFormattedTextField txTelefone;
    private javax.swing.JTextArea txaObservacoes;
    // End of variables declaration//GEN-END:variables
}
