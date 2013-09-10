package gui;

import Connection.EMF;
import DAO.DAOTipoUsuario;
import pojo.TipoUsuario;
import DAO.GenericDAO;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.JOptionPane;
import pojo.Usuario;

public class CadastraUsuario extends javax.swing.JInternalFrame {

    GenericDAO dao = new GenericDAO(EMF.geEntityManager());
    TipoUsuario temporario = new TipoUsuario();
    Usuario u;
    Usuario temp = new Usuario();
    DAOTipoUsuario tipou = new DAOTipoUsuario(EMF.geEntityManager());

    public CadastraUsuario() {
        initComponents();
        erro.setVisible(false);
        tipo.setSelectedIndex(-1);
        labelRemover.setVisible(false);
        lbatualizar.setVisible(false);
        identificador.setVisible(false);
        ok.setVisible(false);
        deletar.setVisible(false);
        mensagem.setVisible(false);
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
        tipoUsuarioQuery = java.beans.Beans.isDesignTime() ? null : ManutencaoInformaticaPUEntityManager.createQuery("SELECT t FROM TipoUsuario t");
        tipoUsuarioList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : tipoUsuarioQuery.getResultList();
        tipoUsuarioQuery1 = java.beans.Beans.isDesignTime() ? null : ManutencaoInformaticaPUEntityManager.createQuery("SELECT t FROM TipoUsuario t");
        tipoUsuarioList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : tipoUsuarioQuery1.getResultList();
        tipoUsuarioQuery2 = java.beans.Beans.isDesignTime() ? null : ManutencaoInformaticaPUEntityManager.createQuery("SELECT t FROM TipoUsuario t");
        tipoUsuarioList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : tipoUsuarioQuery2.getResultList();
        jLabel7 = new javax.swing.JLabel();
        salvar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        login = new javax.swing.JTextField();
        senha = new javax.swing.JPasswordField();
        ddd = new javax.swing.JTextField();
        fone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        erro = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox();
        labelRemover = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        lbatualizar = new javax.swing.JLabel();
        identificador = new javax.swing.JTextField();
        deletar = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        atualizar = new javax.swing.JButton();
        remover = new javax.swing.JButton();
        csenha = new javax.swing.JPasswordField();
        mensagem = new javax.swing.JLabel();

        setClosable(true);
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

        jLabel1.setText("Nome");

        jLabel2.setText("Login");

        jLabel3.setText("Senha");

        jLabel4.setText("E-mail");

        jLabel5.setText("Fone");

        jLabel6.setText("Tipo de Usuário");

        jLabel8.setText("-");

        jLabel9.setText("Confirmar Senha");

        erro.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        erro.setForeground(new java.awt.Color(255, 0, 0));
        erro.setText("Preencher todos os campos");

        tipo.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(
                JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value instanceof TipoUsuario) {
                    TipoUsuario mec = (TipoUsuario)value;
                    setText(mec.getDescricao().toUpperCase());
                }
                return this;
            }
        });

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tipoUsuarioList, tipo);
        bindingGroup.addBinding(jComboBoxBinding);
        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tipoUsuarioList, org.jdesktop.beansbinding.ObjectProperty.create(), tipo, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        labelRemover.setText("Identificador do chamado a ser removido");

        ok.setText("Procurar ID");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        lbatualizar.setText("Identificador do chamado a ser atualizado");

        deletar.setText("Deletar");
        deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarActionPerformed(evt);
            }
        });

        alterar.setText("ALTERAR");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
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

        mensagem.setText("jLabel10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel7)
                        .addGap(195, 195, 195)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel9))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(csenha, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mensagem))))
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addComponent(ddd, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel6))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(fone, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(erro, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(66, 66, 66)
                                                .addComponent(atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(258, 258, 258)
                                                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(59, 59, 59)
                                        .addComponent(remover, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(identificador, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(deletar)
                                .addGap(26, 26, 26)
                                .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(289, 289, 289))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbatualizar)
                            .addComponent(labelRemover))))
                .addContainerGap(287, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(labelRemover)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletar)
                    .addComponent(ok)
                    .addComponent(identificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(lbatualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(173, 173, 173))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ddd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(mensagem)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(csenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(erro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(remover, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75))))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
    }//GEN-LAST:event_formInternalFrameClosed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed

        if (nome.getText().isEmpty() || login.getText().isEmpty() || senha.getText().isEmpty()
                || csenha.getText().isEmpty() || tipo.getSelectedIndex() == -1 || ddd.getText().isEmpty()
                || fone.getText().isEmpty() || email.getText().isEmpty()) {
            erro.setVisible(true);
        } else {
            if (csenha.getText().equals(senha.getText())) {
                u = new Usuario();
                u.setNome(nome.getText());
                u.setLogin(login.getText());
                u.setSenha(senha.getText());
                u.setDdd(ddd.getText());
                u.setFone(fone.getText());
                u.setEmail(email.getText());

                String s = tipo.getSelectedItem().toString();
                temporario = tipou.procurarTipoUsuario(s);
                u.setIdTipo(temporario);

                dao.gravar(u);
                JOptionPane.showMessageDialog(this, "Usuário Cadastrado.");
                nome.setText("");
                login.setText("");
                senha.setText("");
                csenha.setText("");
                ddd.setText("");
                fone.setText("");
                email.setText("");
                tipo.setSelectedIndex(-1);
                mensagem.setVisible(false);
                erro.setVisible(false);
            } else {
                mensagem.setText("SENHA INVÁLIDA");
                mensagem.setVisible(true);
            }
        }

    }//GEN-LAST:event_salvarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed

        int id = Integer.parseInt(identificador.getText());
        temp = (Usuario) dao.buscarId(Usuario.class, id);

        if (temp != null) {
            nome.setText(temp.getNome());
            login.setText(temp.getLogin());
            senha.setText(temp.getSenha());
            ddd.setText(temp.getDdd());
            fone.setText(temp.getFone());
            email.setText(temp.getEmail());

            temporario = tipou.procurarTipoUsuario(temp.getIdTipo().getDescricao());
            tipo.setSelectedIndex(temporario.getIdtipoUsuario() - 1);
        } else {
            JOptionPane.showMessageDialog(this, "Identificador Não Encontrado.");
        }
    }//GEN-LAST:event_okActionPerformed

    private void deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarActionPerformed
        int id = Integer.parseInt(identificador.getText());
        temp = (Usuario) dao.buscarId(Usuario.class, id);
        if (temp != null) {
            dao.deletar(Usuario.class, temp);
            JOptionPane.showMessageDialog(this, "Usuário deletado.");
            labelRemover.setVisible(false);
            identificador.setText("");
            identificador.setVisible(false);
            deletar.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Usuário não encontrado.");
        }

    }//GEN-LAST:event_deletarActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        lbatualizar.setVisible(true);
        identificador.setVisible(true);
        ok.setVisible(true);
        deletar.setVisible(false);
    }//GEN-LAST:event_alterarActionPerformed

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed


        if (nome.getText().isEmpty() || login.getText().isEmpty() || senha.getText().isEmpty()
                || csenha.getText().isEmpty() || tipo.getSelectedIndex() == -1 || ddd.getText().isEmpty()
                || fone.getText().isEmpty() || email.getText().isEmpty()) {
            erro.setVisible(true);
        } else {
            if (csenha.getText().equals(senha.getText())) {
                u = new Usuario();
                u.setIdusuario(Integer.parseInt(identificador.getText()));
                u.setNome(nome.getText());
                u.setLogin(login.getText());
                u.setSenha(senha.getText());
                u.setDdd(ddd.getText());
                u.setFone(fone.getText());
                u.setEmail(email.getText());

                String s = tipo.getSelectedItem().toString();
                temporario = tipou.procurarTipoUsuario(s);
                u.setIdTipo(temporario);

                dao.atualizar(Usuario.class, u);
                JOptionPane.showMessageDialog(this, "Usuário atualizado.");
                nome.setText("");
                login.setText("");
                senha.setText("");
                csenha.setText("");
                ddd.setText("");
                fone.setText("");
                email.setText("");
                tipo.setSelectedIndex(-1);
                identificador.setText("");
                lbatualizar.setVisible(false);
                identificador.setVisible(false);
                ok.setVisible(false);
                mensagem.setVisible(false);
                erro.setVisible(false);
            } else {
                mensagem.setText("SENHA INVÁLIDA");
                mensagem.setVisible(true);
            }
        }
    }//GEN-LAST:event_atualizarActionPerformed

    private void removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerActionPerformed
        labelRemover.setVisible(true);
        identificador.setVisible(true);
        deletar.setVisible(true);
        ok.setVisible(false);
    }//GEN-LAST:event_removerActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager ManutencaoInformaticaPUEntityManager;
    private javax.swing.JButton alterar;
    private javax.swing.JButton atualizar;
    private javax.swing.JButton cancelar;
    private javax.swing.JPasswordField csenha;
    private javax.swing.JTextField ddd;
    private javax.swing.JButton deletar;
    private javax.swing.JTextField email;
    private javax.swing.JLabel erro;
    private javax.swing.JTextField fone;
    private javax.swing.JTextField identificador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelRemover;
    private javax.swing.JLabel lbatualizar;
    private javax.swing.JTextField login;
    private javax.swing.JLabel mensagem;
    private javax.swing.JTextField nome;
    private javax.swing.JButton ok;
    private javax.swing.JButton remover;
    private javax.swing.JButton salvar;
    private javax.swing.JPasswordField senha;
    private javax.swing.JComboBox tipo;
    private java.util.List<pojo.TipoAtendimento> tipoAtendimentoList;
    private javax.persistence.Query tipoAtendimentoQuery;
    private java.util.List<pojo.TipoUsuario> tipoUsuarioList;
    private java.util.List<pojo.TipoUsuario> tipoUsuarioList1;
    private java.util.List<pojo.TipoUsuario> tipoUsuarioList2;
    private javax.persistence.Query tipoUsuarioQuery;
    private javax.persistence.Query tipoUsuarioQuery1;
    private javax.persistence.Query tipoUsuarioQuery2;
    private java.util.List<pojo.Usuario> usuarioList;
    private javax.persistence.Query usuarioQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
