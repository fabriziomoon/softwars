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
public class administradorDeJuego {
    public int insignia = 1000000;
    public String reglamento;
    
    public void eliminar_jugador(String jugador){
        //ToDo
    }
    public Boolean guardar_partida(){
        Boolean flag = true;
        //ToDo
        return flag;
    }
    public void revelar_evento(){
        //ToDo
    }
    public String[] profesionistas_disponibles(String[] profesionistas){
        String[] choice;
        choice = new String[5];
        return choice;
    }
    public String[] planos_disponibles (String[] proyectos){
        String[] choice;
        choice = new String[5];
        return choice;
    }
    public int usar_dado (){
        int Li=1,Ls=6,posible,A;
        double aleat;
        posible=(Ls+1)-Li;
        aleat=Math.random()*posible;
        aleat=Math.floor(aleat);
        aleat=(Li+aleat);
        A=(int)aleat;
        return A;
    }
    public String reglamento(){
        return this.reglamento;
    }
}
