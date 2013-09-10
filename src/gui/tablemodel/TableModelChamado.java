/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import pojo.Chamado;

/**
 *
 * @author Maximiller
 */
public class TableModelChamado extends AbstractTableModel {

    private List<Chamado> chamados;
    private String[] colunas = {"ID", "DESCRIÇÃO", "OBSERVAÇÃO", "DATA ABERTURA", "SITUAÇÃO", "USUARIO"};

    public TableModelChamado() {
        chamados = new ArrayList<>();
    }

    public void addRow(Chamado c) {
        this.chamados.add(c);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
    this.chamados.remove(linha);
    this.fireTableRowsDeleted(linha, linha);
}

    public String getColumnName(int num) {
        return this.colunas[num];
    }
    
    public Chamado get(int linha){
    return this.chamados.get(linha);
}

    @Override
    public int getRowCount() {
        return this.chamados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0:
                return chamados.get(linha).getIdchamado();
            case 1:
                return chamados.get(linha).getDescricao();
            case 2:
                return chamados.get(linha).getObservacao();
            case 3:
                return chamados.get(linha).getInicio();
            case 4: 
                 return chamados.get(linha).getStatus();
            case 5: 
                return chamados.get(linha).getIdUsuario().toString();
        }
        return null;
    }
}
