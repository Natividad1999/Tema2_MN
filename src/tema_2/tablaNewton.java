/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_2;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class tablaNewton extends AbstractTableModel{
    
    public String[] columnas={
        "Iteraciones", "Xi", "F(xi)", "F'(xi)", "Xi+1", "Error"
    };
    
    public Class [] tipos ={
        Integer.class, Double.class, Double.class, Double.class, Double.class, Double.class
    };
    
    private ArrayList<filaNewton> filas;
    
    public tablaNewton(ArrayList<filaNewton> filas){
        this.filas = filas;
    }
    
    @Override
    public int getRowCount() {
        return this.filas.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnas.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        filaNewton fila = this.filas.get(i);
        switch(i1){
            case 0: return fila.getI();
            case 1: return fila.getXi();
            case 2: return fila.getFxi();
            case 3: return fila.getFdxi();
            case 4: return fila.getXi1();
            case 5: return fila.getError();
        }
        return null;
    }

    @Override
     public boolean isCellEditable(int i, int i1) {   
         return false;
    }

    @Override
    public Class<?> getColumnClass(int i) {
        return this.tipos[i];
    }

    @Override
    public String getColumnName(int i) {
       return this.columnas[i];
    }
    
}
