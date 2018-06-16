/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_jonrryenamorado;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wende
 */
public class adminTabla extends Thread {

    JTable t;
    String car;
    ArrayList<piezas> ap;

    public adminTabla() {

    }

    public adminTabla(ArrayList<piezas> ap) {
        this.ap = ap;
    }

    public adminTabla(ArrayList<piezas> ap,String car, JTable t) {
        this.t = t;
        this.car = car;
        this.ap = ap;
    }

    public adminTabla(ArrayList<piezas> ap, String car) {
        this.car = car;
        this.ap = ap;
    }

    public ArrayList<piezas> getAp() {
        return ap;
    }

    public void setAp(ArrayList<piezas> ap) {
        this.ap = ap;
    }

    

    @Override
    public void run() {
        t.setVisible(true);

        DefaultTableModel m = (DefaultTableModel) t.getModel();

        for (int i = 0; i < ap.size(); i++) {
            try {
                piezas tmp = ap.get(i);
                Object row[] = {car, tmp.getNombre(), tmp.getTiempo()};
                Thread.sleep((long) tmp.getTiempo() * 1000);
                m.addRow(row);
            } catch (InterruptedException e) {
            }
        }

    }

}
