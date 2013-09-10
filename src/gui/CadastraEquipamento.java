package gui;

import Connection.EMF;
import DAO.DAOSetor;
import DAO.GenericDAO;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.JOptionPane;
import pojo.Equipamento;
import pojo.Setor;

public class CadastraEquipamento extends javax.swing.JInternalFrame {

    Setor temporario = new Setor();
    Equipamento e;
    Equipamento temp = new Equipamento();
    DAOSetor setor = new DAOSetor(EMF.geEntityManager());
    GenericDAO dg = new GenericDAO(EMF.geEntityManager());

    public CadastraEquipamento() {
        initComponents();
        jLabel4.setVisible(false);
        jComboBox1.setSelectedIndex(-1);
        labelRemover.setVisible(false);
        lbatualizar.setVisible(false);
        identificador.setVisible(false);
        ok.setVisible(false);
        deletar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        ManutencaoInformaticaPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ManutencaoInformaticaPU").createEntityManager();
        usuarioQuery = java.beans.Beans.isDesignTime() ? null : ManutencaoInformaticaPUEntityManager.createQuery("SELECT u FROM Usuario u");
        usuarioList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : usuarioQuery.getResultList();
        tipoAtendimentoQuery = java.beans.Beans.isDesignTime() ? null : ManutencaoInformaticaPUEntityManager.createQuery("SELECT t FROM TipoAtendimento t");
        tipoAtendimentoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : tipoAtendimentoQuery.getResultList();
        setorQuery = java.beans.Beans.isDesignTime() ? null : ManutencaoInformaticaPUEntityManager.createQuery("SELECT s FROM Setor s");
        setorList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : setorQuery.getResultList();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        labelRemover = new javax.swing.JLabel();
        lbatualizar = new javax.swing.JLabel();
        identificador = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        atualizar = new javax.swing.JButton();
        remover = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        deletar = new javax.swing.JButton();

        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1366, 683));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jButton1.setText("SALVAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("CANCELAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Descrição");

        jLabel2.setText("Setor");

        jLabel3.setText("Número de Serie");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);

        jComboBox1.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(
                JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value instanceof Setor) {
                    Setor mec = (Setor)value;
                    setText(mec.getDescricao().toUpperCase());
                }
                return this;
            }
        });

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, setorList, jComboBox1);
        bindingGroup.addBinding(jComboBoxBinding);
        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, setorList, org.jdesktop.beansbinding.ObjectProperty.create(), jComboBox1, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Preencher todos os campos");

        labelRemover.setText("Identificador do chamado a ser removido");

        lbatualizar.setText("Identificador do chamado a ser atualizado");

        ok.setText("Procurar ID");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        atualizar.setText("ATUALIZAR");
        atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarActionPerformed(evt);
            }
        });

        remover.setText("REMOVER");
        remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerActionPerformed(evt);
            }
        });

        alterar.setText("ALTERAR");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        deletar.setText("Deletar");
        deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(remover, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(632, 632, 632)
                        .addComponent(deletar)))
                .addContainerGap(367, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(273, 273, 273)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelRemover)
                        .addComponent(lbatualizar))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(identificador, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(50, 50, 50)
                    .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(641, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(deletar)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(remover, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(101, 101, 101))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelRemover)
                            .addGap(12, 12, 12)
                            .addComponent(lbatualizar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(identificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ok))))
                    .addContainerGap(564, Short.MAX_VALUE)))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
    }//GEN-LAST:event_formInternalFrameClosed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (jTextArea1.getText().isEmpty() || jTextField2.getText().isEmpty() || jComboBox1.getSelectedIndex() == -1) {
            jLabel4.setVisible(true);
        } else {
            e = new Equipamento();
            e.setDescricao(jTextArea1.getText());
            e.setSerie(jTextField2.getText());

            String s = jComboBox1.getSelectedItem().toString();
//            System.out.println(s + "ComboBox");
            temporario = setor.encontraSetor(s);
//            System.out.println(temporario.getIdsetor() + "dps do metodo encontrar");
            e.setIdSetor(temporario);
//            System.out.println(e.getIdSetor() + "dps de setor o equip");

            dg.gravar(e);
            JOptionPane.showMessageDialog(this, "Equipamento Cadastrado.");
            jTextArea1.setText("");
            jTextField2.setText("");
            jComboBox1.setSelectedIndex(-1);
            jLabel4.setVisible(false);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        lbatualizar.setVisible(true);
        identificador.setVisible(true);
        ok.setVisible(true);
    }//GEN-LAST:event_alterarActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed

        int id = Integer.parseInt(identificador.getText());
        temp = (Equipamento) dg.buscarId(Equipamento.class, id);

        if (temp != null) {
            jTextArea1.setText(temp.getDescricao());
            jTextField2.setText(temp.getSerie());

//        System.out.println(temp.toString() + " 1");
//        System.out.println(temp.getIdSetor() + " 2");
            temporario = setor.encontraSetor(temp.getIdSetor().getDescricao());
            jComboBox1.setSelectedIndex(temporario.getIdsetor() - 1);
        } else {
            JOptionPane.showMessageDialog(this, "Equipamento Não Encontrado.");
        }
//        String s = temp.getIdSetor().getDescricao();
//        String s = "aaaa";
//        System.out.println(temp.getIdSetor().getDescricao());
//        System.out.println(s);
//        temporario = setor.encontraSetor(s);
//        System.out.println(temporario.toString() + " 3");
//        System.out.println(temporario.getIdsetor() + " 4");
//        System.out.println(temp.getIdSetor().getIdsetor() + " 5");
//        System.out.println(temp.getIdSetor().getDescricao() + " 6");

//        for (int i = 0; i <= jComboBox1.getItemCount(); i++) {
//            System.out.println("aqui  " + i);
//            System.out.println(jComboBox1.getItemCount() + " vaaii");

//            if (jComboBox1.getSelectedItem().equals(temporario.getDescricao())) {
//                jComboBox1.setSelectedItem(temporario.toString());
//                System.out.println("dps do set");
//            }
//        }
    }//GEN-LAST:event_okActionPerformed

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed


        if (jTextArea1.getText().isEmpty() || jTextField2.getText().isEmpty()
                || jComboBox1.getSelectedIndex() == -1) {
            jLabel4.setVisible(true);
        } else {
            e = new Equipamento();
            e.setIdequipamento(Integer.parseInt(identificador.getText()));
            e.setDescricao(jTextArea1.getText());
//        System.out.println(e.getDescricao());
            String abc = jComboBox1.getSelectedItem().toString();
            temporario = setor.encontraSetor(abc);
            e.setIdSetor(temporario);
//        System.out.println(e.getIdSetor());
            e.setSerie(jTextField2.getText());
//        System.out.println(e.getSerie());

            dg.atualizar(Equipamento.class, e);
            JOptionPane.showMessageDialog(this, "Equipamento Atualizado.");
            jTextArea1.setText("");
            jComboBox1.setSelectedIndex(-1);
            jTextField2.setText("");
            identificador.setText("");
            lbatualizar.setVisible(false);
            identificador.setVisible(false);
            ok.setVisible(false);
            jLabel4.setVisible(false);
        }

    }//GEN-LAST:event_atualizarActionPerformed

    private void removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerActionPerformed
        labelRemover.setVisible(true);
        identificador.setVisible(true);
        deletar.setVisible(true);
    }//GEN-LAST:event_removerActionPerformed

    private void deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarActionPerformed
        int id = Integer.parseInt(identificador.getText());
        temp = (Equipamento) dg.buscarId(Equipamento.class, id);

        if (temp != null) {
            dg.deletar(Equipamento.class, temp);
            JOptionPane.showMessageDialog(this, "Equipamento Deletado.");
            labelRemover.setVisible(false);
            identificador.setText("");
            identificador.setVisible(false);
            deletar.setVisible(false);
            jLabel4.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Equipamento Não Encontrado.");
        }
    }//GEN-LAST:event_deletarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager ManutencaoInformaticaPUEntityManager;
    private javax.swing.JButton alterar;
    private javax.swing.JButton atualizar;
    private javax.swing.JButton deletar;
    private javax.swing.JTextField identificador;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel labelRemover;
    private javax.swing.JLabel lbatualizar;
    private javax.swing.JButton ok;
    private javax.swing.JButton remover;
    private java.util.List<pojo.Setor> setorList;
    private javax.persistence.Query setorQuery;
    private java.util.List<pojo.TipoAtendimento> tipoAtendimentoList;
    private javax.persistence.Query tipoAtendimentoQuery;
    private java.util.List<pojo.Usuario> usuarioList;
    private javax.persistence.Query usuarioQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
