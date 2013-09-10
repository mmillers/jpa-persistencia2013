package gui.tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import pojo.Setor;

public class TableModelSetor extends AbstractTableModel {

    private List<Setor> setores;
    private String[] colunas = {"ID", "DESCRIÇÃO", "RAMAL"};

    public TableModelSetor() {
        setores = new ArrayList<>();
    }

    public void addRow(Setor c) {
        this.setores.add(c);
        this.fireTableDataChanged();
    }

    public void removeRow(int linha) {
        this.setores.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

    public String getColumnName(int num) {
        return this.colunas[num];
    }

    public Setor get(int linha) {
        return this.setores.get(linha);
    }

    @Override
    public int getRowCount() {
        return setores.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0:
                return setores.get(linha).getIdsetor();
            case 1:
                return setores.get(linha).getDescricao();
            case 2:
                return setores.get(linha).getRamal();
        }
        return null;
    }
}
