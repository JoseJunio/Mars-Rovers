/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mars_rover;

/**
 *
 * @author José_Junio
 */
public class Constants {

    // Constante da direção Norte (North)
    public static final String NORTH = "N";
   
    // Constante da direção Sul (South)
    public static final String SOUTH = "S";
    
    // Constante da direção Leste
    public static final String EAST = "E";
    
    // Constante da direção Oeste    
    public static final String WEST = "W";
    
    // Comando para virar para a Esquerda (Left)    
    public static final Character LEFT = 'L';
    
    // Comando para virar para a Direita (Right)
    public static final Character RIGTH = 'R';
    
    // Comando para virar para a Mover
    public static final Character MOVE = 'M';
    
    public static Rover Rover(Rover rover){
        return rover = new Rover(); 
    };

}
