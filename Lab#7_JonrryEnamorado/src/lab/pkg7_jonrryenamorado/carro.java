/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_jonrryenamorado;

import java.util.ArrayList;

/**
 *
 * @author wende
 */
public class carro {
    private String name;
    private ArrayList<piezas> piezas = new ArrayList();

    public carro() {
    }

    public carro(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<piezas> getPiezas() {
        return piezas;
    }

    public void setPiezas(ArrayList<piezas> piezas) {
        this.piezas = piezas;
    }

    @Override
    public String toString() {
        return name + piezas;
    }
    
    
}
