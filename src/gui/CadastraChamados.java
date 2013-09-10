package gui;

import Connection.EMF;
import DAO.DAOChamado;
import DAO.DAOEquipamento;
import DAO.DAOTipoAtendimento;
import DAO.DAOUsuario;
import DAO.GenericDAO;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.JOptionPane;
import pojo.Chamado;
import pojo.Equipamento;
import pojo.TipoAtendimento;
import pojo.Usuario;

public class CadastraChamados extends javax.swing.JInternalFrame {

    Chamado c;
    TipoAtendimento temporario = new TipoAtendimento();
    Usuario tempUs = new Usuario();
    DAOUsuario daou = new DAOUsuario(EMF.geEntityManager());
    DAOEquipamento daoe = new DAOEquipamento(EMF.geEntityManager());
    DAOTipoAtendimento daotipo = new DAOTipoAtendimento(EMF.geEntityManager());
    Chamado temps = new Chamado();
    GenericDAO dao = new GenericDAO(EMF.geEntityManager());

    public CadastraChamados() {
        initComponents();

        if (Login.u.getIdTipo().getIdtipoUsuario().equals(2)) {
            remover.setVisible(false);
        }

        erro.setVisible(false);
        data.setVisible(false);
        status.setVisible(false);
        user.setSelectedIndex(-1);
        ctipo.setSelectedIndex(-1);
        jComboBox1.setSelectedIndex(-1);
        jComboBox2.setSelectedIndex(-1);
        jComboBox3.setSelectedIndex(-1);
        labelRemover.setVisible(false);
        lbatualizar.setVisible(false);
        identificador.setVisible(false);
        ok.setVisible(false);
        deletar.setVisible(false);
        jComboBox2.setEnabled(false);
        jComboBox3.setEnabled(false);
    }

    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return dateFormat.format(date);
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
        equipamentoQuery = java.beans.Beans.isDesignTime() ? null : ManutencaoInformaticaPUEntityManager.createQuery("SELECT e FROM Equipamento e");
        equipamentoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : equipamentoQuery.getResultList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        problema = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        obs = new javax.swing.JTextArea();
        ctipo = new javax.swing.JComboBox();
        user = new javax.swing.JComboBox();
        salvar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        erro = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        labelRemover = new javax.swing.JLabel();
        lbatualizar = new javax.swing.JLabel();
        identificador = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        atualizar = new javax.swing.JButton();
        remover = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        deletar = new javax.swing.JButton();
        data = new javax.swing.JTextField();
        status = new javax.swing.JTextField();

        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1366, 683));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setText("Problema");

        jLabel2.setText("Obervação");

        jLabel3.setText("Tipo de Atendimento");

        jLabel4.setText("Usuário");

        problema.setColumns(20);
        problema.setRows(5);
        jScrollPane1.setViewportView(problema);

        obs.setColumns(20);
        obs.setRows(5);
        jScrollPane2.setViewportView(obs);

        ctipo.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(
                JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value instanceof TipoAtendimento) {
                    TipoAtendimento mec = (TipoAtendimento)value;
                    setText(mec.getDescricao().toUpperCase());
                }
                return this;
            }
        });

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tipoAtendimentoList, ctipo, "");
        bindingGroup.addBinding(jComboBoxBinding);
        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tipoAtendimentoList, org.jdesktop.beansbinding.ObjectProperty.create(), ctipo, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        user.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(
                JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value instanceof Usuario) {
                    Usuario mec = (Usuario)value;
                    setText(mec.getNome().toUpperCase());
                }
                return this;
            }
        });

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, usuarioList, user);
        bindingGroup.addBinding(jComboBoxBinding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, usuarioList, org.jdesktop.beansbinding.ObjectProperty.create(), user, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        salvar.setText("SALVAR");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        cancelar.setText("CANCELAR");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        erro.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        erro.setForeground(new java.awt.Color(255, 0, 0));
        erro.setText("Preencher todos os campos. O primeiro item do equipamento é obrigatório.");

        jLabel5.setText("Equipamento");

        jLabel6.setText("Equipamento");

        jLabel8.setText("Equipamento");

        jComboBox1.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(
                JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value instanceof Equipamento) {
                    Equipamento mec = (Equipamento)value;
                    setText(mec.getDescricao());
                }
                return this;
            }
        });

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, equipamentoList, jComboBox1);
        bindingGroup.addBinding(jComboBoxBinding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, equipamentoList, org.jdesktop.beansbinding.ObjectProperty.create(), jComboBox1, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jComboBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBox1FocusLost(evt);
            }
        });

        jComboBox2.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(
                JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value instanceof Equipamento) {
                    Equipamento mec = (Equipamento)value;
                    setText(mec.getDescricao());
                }
                return this;
            }
        });

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, equipamentoList, jComboBox2);
        bindingGroup.addBinding(jComboBoxBinding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, equipamentoList, org.jdesktop.beansbinding.ObjectProperty.create(), jComboBox2, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jComboBox2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBox2FocusLost(evt);
            }
        });

        jComboBox3.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(
                JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value instanceof Equipamento) {
                    Equipamento mec = (Equipamento)value;
                    setText(mec.getDescricao());
                }
                return this;
            }
        });

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, equipamentoList, jComboBox3);
        bindingGroup.addBinding(jComboBoxBinding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, equipamentoList, org.jdesktop.beansbinding.ObjectProperty.create(), jComboBox3, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

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
                        .addGap(56, 56, 56)
                        .addComponent(jLabel7)
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelRemover)
                            .addComponent(lbatualizar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(identificador, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(222, 222, 222)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(107, 107, 107)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(ctipo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(erro, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(remover, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(identificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(labelRemover)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(deletar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbatualizar)
                            .addComponent(ok))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(ctipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(37, 37, 37)
                        .addComponent(erro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(remover, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(161, 161, 161))))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
    }//GEN-LAST:event_formInternalFrameClosed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed

        if (problema.getText().isEmpty() || obs.getText().isEmpty() || ctipo.getSelectedIndex() == -1
                || user.getSelectedIndex() == -1 || jComboBox1.getSelectedIndex() == -1) {
            erro.setVisible(true);
        } else {
            c = new Chamado();
            c.setDescricao(problema.getText());
            c.setObservacao(obs.getText());
            c.setInicio(getDateTime());
            c.setStatus("aberto");

            String temporarioTipo = ctipo.getSelectedItem().toString();
            temporario = daotipo.encontraTipo(temporarioTipo);
            c.setIdTipoAtendimento(temporario);

            temporarioTipo = user.getSelectedItem().toString();
            tempUs = daou.procurarUsuario(temporarioTipo);
            c.setIdUsuario(tempUs);

            temporarioTipo = jComboBox1.getSelectedItem().toString();
            Equipamento equip = daoe.procurarEquipamento(temporarioTipo);

            c.addEquipamento(equip);
            equip.addChamado(c);

            System.out.println(temporarioTipo + "  - primeiro - ");

            String dois = "vazia";
            if (jComboBox2.getSelectedIndex() != -1) {
                dois = jComboBox2.getSelectedItem().toString();
                System.out.println(dois + " - segundo - ");

                if (jComboBox1.getSelectedItem().toString().compareTo(dois) == 0) {
                    JOptionPane.showMessageDialog(this, "Selecione Equipamentos Diferentes.");
                } else {
                    equip = daoe.procurarEquipamento(dois);
                    c.addEquipamento(equip);
                    equip.addChamado(c);
                }
            }

            String tres = "vazia";
            if (jComboBox3.getSelectedIndex() != -1) {
                tres = jComboBox3.getSelectedItem().toString();
                System.out.println(tres + " - terceiro - ");


                if (jComboBox1.getSelectedItem().toString().compareTo(tres) == 0 && dois.compareTo(tres) == 0) {
                    JOptionPane.showMessageDialog(this, "Selecione Equipamentos Diferentes.");
                } else {
                    equip = daoe.procurarEquipamento(tres);
                    c.addEquipamento(equip);
                    equip.addChamado(c);
                }
            }
            dao.gravar(c);
            JOptionPane.showMessageDialog(this, "Chamado Cadastrado.");
            problema.setText("");
            obs.setText("");
            ctipo.setSelectedIndex(-1);
            user.setSelectedIndex(-1);
            jComboBox1.setSelectedIndex(-1);
            jComboBox2.setSelectedIndex(-1);
            jComboBox2.setEnabled(false);
            jComboBox3.setSelectedIndex(-1);
            jComboBox3.setEnabled(false);
        }
    }//GEN-LAST:event_salvarActionPerformed
    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed
        if (problema.getText().isEmpty() || obs.getText().isEmpty() || ctipo.getSelectedIndex() == -1
                || user.getSelectedIndex() == -1 || jComboBox1.getSelectedIndex() == -1) {
            erro.setVisible(true);
        } else {
            c = new Chamado();
            c.setIdchamado(Integer.parseInt(identificador.getText()));

            c.setDescricao(problema.getText());
            c.setObservacao(obs.getText());

            String temporarioTipo = ctipo.getSelectedItem().toString();
            temporario = daotipo.encontraTipo(temporarioTipo);
            c.setIdTipoAtendimento(temporario);

            temporarioTipo = user.getSelectedItem().toString();
            tempUs = daou.procurarUsuario(temporarioTipo);
            c.setIdUsuario(tempUs);
            c.setInicio(data.getText());
            c.setStatus(status.getText());

            temporarioTipo = jComboBox1.getSelectedItem().toString();
            Equipamento equip = daoe.procurarEquipamento(temporarioTipo);

            c.addEquipamento(equip);
            equip.addChamado(c);


            String dois = "vazia";
            if (jComboBox2.getSelectedIndex() != -1) {
                dois = jComboBox2.getSelectedItem().toString();
                System.out.println(dois + " - segundo - ");

                if (jComboBox1.getSelectedItem().toString().compareTo(dois) == 0) {
                    JOptionPane.showMessageDialog(this, "Selecione Equipamentos Diferentes.");
                } else {
                    equip = daoe.procurarEquipamento(dois);
                    c.addEquipamento(equip);
                    equip.addChamado(c);
                }
            }

            String tres = "vazia";
            if (jComboBox3.getSelectedIndex() != -1) {
                tres = jComboBox3.getSelectedItem().toString();
                System.out.println(tres + " - terceiro - ");


                if (jComboBox1.getSelectedItem().toString().compareTo(tres) == 0 && dois.compareTo(tres) == 0) {
                    JOptionPane.showMessageDialog(this, "Selecione Equipamentos Diferentes.");
                } else {
                    equip = daoe.procurarEquipamento(tres);
                    c.addEquipamento(equip);
                    equip.addChamado(c);
                }
            }
            dao.atualizar(Chamado.class, c);
            JOptionPane.showMessageDialog(this, "Chamado Atualizado.");
            problema.setText("");
            obs.setText("");
            data.setText("");
            status.setText("");
            ctipo.setSelectedIndex(-1);
            user.setSelectedIndex(-1);
            jComboBox1.setSelectedIndex(-1);
            jComboBox2.setSelectedIndex(-1);
            jComboBox3.setSelectedIndex(-1);
            jComboBox2.setEnabled(false);
            jComboBox3.setEnabled(false);
        }
    }//GEN-LAST:event_atualizarActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        lbatualizar.setVisible(true);
        identificador.setVisible(true);
        ok.setVisible(true);
    }//GEN-LAST:event_alterarActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed

        Chamado i = (Chamado) dao.buscarId(Chamado.class, Integer.parseInt(identificador.getText()));

        problema.setText(i.getDescricao());
        obs.setText(i.getObservacao());
        data.setText(i.getInicio());
        status.setText(i.getStatus());
//        ctipo.setSelectedItem();
//        System.out.println(i.getIdUsuario().getIdusuario() - 1 + " - user");
//        user.setSelectedIndex(i.getIdUsuario().getIdusuario() - 1);

        tempUs = (Usuario) dao.buscarId(Usuario.class, i.getIdUsuario().getIdusuario());
        System.out.println(tempUs.getIdusuario());
        user.setSelectedIndex(tempUs.getIdusuario() - 1);

        temporario = (TipoAtendimento) dao.buscarId(TipoAtendimento.class, i.getIdTipoAtendimento().getIdtipoAtendimento());
        ctipo.setSelectedIndex(temporario.getIdtipoAtendimento() - 1);

        System.out.println("PASSSOOOO");


        System.out.println(i.getIdTipoAtendimento().getIdtipoAtendimento() + " - tipo");
        ctipo.setPrototypeDisplayValue(i.getIdTipoAtendimento().getIdtipoAtendimento() - 1);

        System.out.println(i.getEquipamentoList().size() + "  tamanho ");
        if (i.getEquipamentoList().size() == 1) {
//            String str = null;
//            str = i.getEquipamentoList().get(0).toString();
//            System.out.println(str + "alt 1");
            Equipamento eq = new Equipamento();
            eq = (Equipamento) dao.buscarId(Equipamento.class, i.getEquipamentoList().get(0).getIdequipamento());
            jComboBox1.setSelectedItem(eq.getIdequipamento() - 1);
        } else {
            if (i.getEquipamentoList().size() == 2) {
                Equipamento eq = new Equipamento();
                eq = (Equipamento) dao.buscarId(Equipamento.class, i.getEquipamentoList().get(0).getIdequipamento());
//                System.out.println(str + "alt 1");
                jComboBox1.setSelectedIndex(eq.getIdequipamento() - 1);
//                str = i.getEquipamentoList().get(1).toString();
                eq = (Equipamento) dao.buscarId(Equipamento.class, i.getEquipamentoList().get(1).getIdequipamento());
                jComboBox2.setSelectedIndex(eq.getIdequipamento() - 1);
//                System.out.println(str + "alt 2");
                jComboBox2.setEnabled(true);
            } else {
                if (i.getEquipamentoList().size() == 3) {
                    Equipamento eq = new Equipamento();
                    eq = (Equipamento) dao.buscarId(Equipamento.class, i.getEquipamentoList().get(0).getIdequipamento());
                    jComboBox1.setSelectedIndex(eq.getIdequipamento() - 1);

                    eq = (Equipamento) dao.buscarId(Equipamento.class, i.getEquipamentoList().get(1).getIdequipamento());
                    jComboBox2.setSelectedIndex(eq.getIdequipamento() - 1);
                    jComboBox2.setEnabled(true);

                    eq = (Equipamento) dao.buscarId(Equipamento.class, i.getEquipamentoList().get(2).getIdequipamento());
                    jComboBox3.setSelectedIndex(eq.getIdequipamento() - 1);
//                    System.out.println(str + "alt 3");
                    jComboBox3.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_okActionPerformed

    private void removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerActionPerformed
        labelRemover.setVisible(true);
        identificador.setVisible(true);
        deletar.setVisible(true);
    }//GEN-LAST:event_removerActionPerformed

    private void deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarActionPerformed
        int id = Integer.parseInt(identificador.getText());
        temps = (Chamado) dao.buscarId(Chamado.class, id);

        if (temps != null) {
            dao.deletar(Chamado.class, temps);
            JOptionPane.showMessageDialog(this, "Chamado Deletado.");
            labelRemover.setVisible(false);
            identificador.setText("");
            identificador.setVisible(false);
            deletar.setVisible(false);
            erro.setVisible(false);
            ok.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Chamado Não Encontrado.");
        }

    }//GEN-LAST:event_deletarActionPerformed

    private void jComboBox1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusLost
        if (jComboBox1.getSelectedIndex() >= 0) {
            jComboBox2.setEnabled(true);
        }
    }//GEN-LAST:event_jComboBox1FocusLost

    private void jComboBox2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox2FocusLost
        if (jComboBox2.getSelectedIndex() >= 0) {
            jComboBox3.setEnabled(true);
        }
    }//GEN-LAST:event_jComboBox2FocusLost
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager ManutencaoInformaticaPUEntityManager;
    private javax.swing.JButton alterar;
    private javax.swing.JButton atualizar;
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox ctipo;
    private javax.swing.JTextField data;
    private javax.swing.JButton deletar;
    private java.util.List<pojo.Equipamento> equipamentoList;
    private javax.persistence.Query equipamentoQuery;
    private javax.swing.JLabel erro;
    private javax.swing.JTextField identificador;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelRemover;
    private javax.swing.JLabel lbatualizar;
    private javax.swing.JTextArea obs;
    private javax.swing.JButton ok;
    private javax.swing.JTextArea problema;
    private javax.swing.JButton remover;
    private javax.swing.JButton salvar;
    private javax.swing.JTextField status;
    private java.util.List<pojo.TipoAtendimento> tipoAtendimentoList;
    private javax.persistence.Query tipoAtendimentoQuery;
    private javax.swing.JComboBox user;
    private java.util.List<pojo.Usuario> usuarioList;
    private javax.persistence.Query usuarioQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
