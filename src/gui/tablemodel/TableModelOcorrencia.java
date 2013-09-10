package gui.tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import pojo.Ocorrencia;

public class TableModelOcorrencia extends AbstractTableModel {

    private List<Ocorrencia> ocs;
    private String[] colunas = {"ID", "DESCRIÇÃO", "DATA"};

    public TableModelOcorrencia() {
        ocs = new ArrayList<>();
    }

    public void addRow(Ocorrencia c) {
        this.ocs.add(c);
        this.fireTableDataChanged();
    }

    public void removeRow(int linha) {
        this.ocs.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

    public String getColumnName(int num) {
        return this.colunas[num];
    }

    public Ocorrencia get(int linha) {
        return this.ocs.get(linha);
    }

    @Override
    public int getRowCount() {
        return ocs.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0:
                return ocs.get(linha).getIdocorrencia();
            case 1:
                return ocs.get(linha).getDescricao();
            case 2:
                return ocs.get(linha).getAbertura();
        }
        return null;
    }
}
