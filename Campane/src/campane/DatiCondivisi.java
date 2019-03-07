/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campane;

/**
 *
 * @author colombo_alessandro01
 */
public class DatiCondivisi {
    
    // suoni contine un vettore di stringhe che identificano i suoni delle campane
    private String[] suoni;
    //contatore per le volte che suona
    private int max;
    private int contatore;
    
    public DatiCondivisi(int max){
        this.max=max;
        contatore = 0;
    }
    public void suonato(){
    contatore++;
}
    public int getContatore(){
        return contatore;
    }
    public int getMax(){
        return max;
    }
}
