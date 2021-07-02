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
public class planosDeProyecto {
    public String nombre;
    public int costo_inicial, duracion;
    private int calidad;
    
    public planosDeProyecto(String nombre, int costo, int turnos){
        this.nombre = nombre;
        this.costo_inicial = costo;
        this.duracion = turnos;
    } 
    public void subir_calidad(){
        this.calidad += 1;
    }
    public int ver_calidad(){
        return this.calidad;
    }
}
