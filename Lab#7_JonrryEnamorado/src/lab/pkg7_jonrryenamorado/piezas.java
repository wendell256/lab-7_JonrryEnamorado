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
public class piezas {
    private String nombre;
    private String material;
    private double tiempo;
    private ArrayList<piezas> piezas = new ArrayList();
    public piezas() {
    }

    public ArrayList<piezas> getPiezas() {
        return piezas;
    }

    public void setPiezas(ArrayList<piezas> piezas) {
        this.piezas = piezas;
    }
    
    public piezas(String nombre, String material, double tiempo) {
        this.nombre = nombre;
        this.material = material;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
