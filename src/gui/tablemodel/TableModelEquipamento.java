/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import pojo.Equipamento;

/**
 *
 * @author Maximiller
 */
public class TableModelEquipamento extends AbstractTableModel {

    private List<Equipamento> equipamentos;
    private String[] colunas = {"ID", "DESCRIÇÃO", "NÚMERO DE SERIE"};

    public TableModelEquipamento() {
        equipamentos = new ArrayList<>();
    }

    public void addRow(Equipamento c) {
        this.equipamentos.add(c);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
    this.equipamentos.remove(linha);
    this.fireTableRowsDeleted(linha, linha);
}

    public String getColumnName(int num) {
        return this.colunas[num];
    }
    
    public Equipamento get(int linha){
    return this.equipamentos.get(linha);
}

    @Override
    public int getRowCount() {
        return this.equipamentos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0:
                return equipamentos.get(linha).getIdequipamento();
            case 1:
                return equipamentos.get(linha).getDescricao();
            case 2:
                return equipamentos.get(linha).getSerie();
        }
        return null;
    }
}
