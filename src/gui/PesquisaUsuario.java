/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Connection.EMF;
import DAO.DAOUsuario;
import gui.tablemodel.TableModelUsuario;
import java.util.List;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import pojo.Usuario;

/**
 *
 * @author Maximiller
 */
public class PesquisaUsuario extends javax.swing.JInternalFrame {

    DAOUsuario daou = new DAOUsuario(EMF.geEntityManager());

    public PesquisaUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ManutencaoInformaticaPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ManutencaoInformaticaPU").createEntityManager();
        tipoAtendimentoQuery = java.beans.Beans.isDesignTime() ? null : ManutencaoInformaticaPUEntityManager.createQuery("SELECT t FROM TipoAtendimento t");
        tipoAtendimentoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : tipoAtendimentoQuery.getResultList();
        tipoAtendimentoQuery1 = java.beans.Beans.isDesignTime() ? null : ManutencaoInformaticaPUEntityManager.createQuery("SELECT t FROM TipoAtendimento t");
        tipoAtendimentoList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : tipoAtendimentoQuery1.getResultList();
        usuarioQuery = java.beans.Beans.isDesignTime() ? null : ManutencaoInformaticaPUEntityManager.createQuery("SELECT u FROM Usuario u");
        usuarioList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : usuarioQuery.getResultList();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1366, 683));

        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Digite o nome do usuário que deseja pesquisar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(153, 153, 153)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(326, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String user = jTextField1.getText();
//        System.out.println(jTextField1.getText().toString());
//        System.out.println(user);
        if (user.isEmpty()) {
            jTextField1.setText("Adicione o usuário neste campo.");
        } else {
//            List<Usuario> set = daou.verificaUsuario(user);
//            System.out.println(set.toString());
            TableModelUsuario model = new TableModelUsuario();
            Query q = EMF.geEntityManager().createQuery("SELECT l FROM Usuario l WHERE l.nome LIKE :name");
            q.setParameter("name", "%" + user + "%");
            List<Usuario> lista = q.getResultList();
           
            if (!lista.isEmpty()) {
                for (Usuario u : lista) {
                    model.addRow(u);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Nenhum Usuário Encontrado.");
            }
            jTable1.setModel(model);
//        System.out.println("a");
            jTable1.revalidate();
//        System.out.println("b");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager ManutencaoInformaticaPUEntityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private java.util.List<pojo.TipoAtendimento> tipoAtendimentoList;
    private java.util.List<pojo.TipoAtendimento> tipoAtendimentoList1;
    private javax.persistence.Query tipoAtendimentoQuery;
    private javax.persistence.Query tipoAtendimentoQuery1;
    private java.util.List<pojo.Usuario> usuarioList;
    private javax.persistence.Query usuarioQuery;
    // End of variables declaration//GEN-END:variables
}
