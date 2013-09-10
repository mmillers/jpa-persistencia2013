package gui.tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import pojo.Usuario;

public class TableModelUsuario extends AbstractTableModel {

    private List<Usuario> usuarios;
    private String[] colunas = {"ID", "NOME", "LOGIN"};

    public TableModelUsuario() {
        usuarios = new ArrayList<>();
    }

    public void addRow(Usuario c) {
        this.usuarios.add(c);
        this.fireTableDataChanged();
    }

    public void removeRow(int linha) {
        this.usuarios.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

    public String getColumnName(int num) {
        return this.colunas[num];
    }

    public Usuario get(int linha) {
        return this.usuarios.get(linha);
    }

    @Override
    public int getRowCount() {
        return usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0:
                return usuarios.get(linha).getIdusuario();
            case 1:
                return usuarios.get(linha).getNome();
            case 2:
                return usuarios.get(linha).getLogin();
        }
        return null;
    }
}
