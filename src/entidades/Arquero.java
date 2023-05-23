/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Piero354
 */
public class Arquero extends Personaje{
    
    private int agilidad;
    private int precision;
    
    public void dispararFlecha(Personaje atacado){
    
    
    }   
    
    //Llamado al padre
    @Override
    public void atacar(Personaje atacado){
        int nivelActualDeVida = atacado.getVida();
        if (this.precision>5) {
            atacado.setVida(nivelActualDeVida - 30);
        }else
            atacado.setVida(nivelActualDeVida - 8);
        atacado.defender(this);  
    }
    
    
    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }
    
    
}
