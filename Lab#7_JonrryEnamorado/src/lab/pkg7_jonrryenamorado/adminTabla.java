/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_jonrryenamorado;

/**
 *
 * @author wende
 */
public class adminTabla extends Thread{
    Tabla t = new Tabla();
    piezas p;
    public adminTabla() {
        
    }

    public adminTabla(piezas p) {
        this.p = p;
    }

    public Tabla getT() {
        return t;
    }

    public void setT(Tabla t) {
        this.t = t;
    }

    public piezas getP() {
        return p;
    }

    public void setP(piezas p) {
        this.p = p;
    }
    
    @Override
    public void run() {
        try {
            
        } catch (Exception e) {
        }
            
        
       try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                }
    }
    
}
