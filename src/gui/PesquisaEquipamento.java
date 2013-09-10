/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Connection.EMF;
import DAO.DAOEquipamento;
import gui.tablemodel.TableModelEquipamento;
import java.util.List;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import pojo.Equipamento;

/**
 *
 * @author Maximiller
 */
public class PesquisaEquipamento extends javax.swing.JInternalFrame {

    DAOEquipamento daoe = new DAOEquipamento(EMF.geEntityManager());

    public PesquisaEquipamento() {
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
        equipamentoQuery = java.beans.Beans.isDesignTime() ? null : ManutencaoInformaticaPUEntityManager.createQuery("SELECT e FROM Equipamento e");
        equipamentoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : equipamentoQuery.getResultList();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1366, 683));

        jLabel1.setText("Digite o nome do Equipamento que deseja pesquisar");

        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(153, 153, 153)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(333, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String equip = jTextField1.getText();
//        List<Equipamento> set = daoe.verificaEquipamento(equip);

        if (equip.isEmpty()) {
            jTextField1.setText("Digite o equipamento neste campo.");
        } else {
            TableModelEquipamento model = new TableModelEquipamento();
            Query q = EMF.geEntityManager().createQuery("SELECT l FROM Equipamento l WHERE l.descricao LIKE :name");
            q.setParameter("name", "%" + equip + "%");
            List<Equipamento> lista = q.getResultList();

            if (!lista.isEmpty()) {
                for (Equipamento ch : lista) {
                    model.addRow(ch);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Nenhum Equipamento Encontrado.");
            }
            jTable1.setModel(model);
            jTable1.revalidate();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager ManutencaoInformaticaPUEntityManager;
    private java.util.List<pojo.Equipamento> equipamentoList;
    private javax.persistence.Query equipamentoQuery;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private java.util.List<pojo.TipoAtendimento> tipoAtendimentoList;
    private java.util.List<pojo.TipoAtendimento> tipoAtendimentoList1;
    private javax.persistence.Query tipoAtendimentoQuery;
    private javax.persistence.Query tipoAtendimentoQuery1;
    // End of variables declaration//GEN-END:variables
}