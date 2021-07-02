/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author FABRICIO
 */
public class profesionistas {
    public String tipo, rasgo, trabajando, cooperando;
    public int calidad, salario;
    
    public profesionistas(String tipo, String rasgo, String efecto_t, 
            String efecto_c, int calidad, int salario){
        this.tipo = tipo;
        this.rasgo = rasgo;
        this.trabajando = efecto_t;
        this.cooperando = efecto_c;
        this.calidad = calidad;
        this.salario = salario;
    }
}
