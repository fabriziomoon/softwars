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
public class jugador {
    private String nombre;
    private int costos, ingresos;
    private int creditos = 5000;
    
    public jugador(String nombre){
        this.nombre = nombre;
    }
    public void agregar_costo(int valor){
        this.costos = this.costos - valor;
    }
    public void agregar_ingreso(int valor){
        this.ingresos = this.ingresos + valor;
    }
    public double calcular_ingresos(){
        double total = 0;
        total = this.ingresos - this.costos;
        return total;
    }
    public int[] ver_costos_ingresos(){
        int[] datos = {this.ingresos, this.costos};
        return datos;
    }
    public int ver_creditos(){
        return this.creditos;
    }
    public double calcular_creditos(){
        double total = this.creditos + this.calcular_ingresos();
        return total;
    }
            
}
