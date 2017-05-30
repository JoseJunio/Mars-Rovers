/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mars_rover;

import java.lang.*;



/**
 *
 * @author José_Junio
 */
public class Comandos {
    
    // Limite da matriz na direção x
    Integer limite_x;
   
    // Limite da matriz na direção y
    Integer limite_y;

    public void popula_Coordenada(String coordenadas){
    
        if(!coordenadas.isEmpty()){
        
            coordenadas = coordenadas.replaceAll("\\s+", "");
        
            if(verifica_numeros(coordenadas)){
               
               setLimite_x(Character.getNumericValue(coordenadas.charAt(0)));
               setLimite_y(Character.getNumericValue(coordenadas.charAt(1))); 
             
            }else{
                throw new IllegalArgumentException("As coordenadas contém letras, só é permitido números !!");
            }
        
        }else{
          throw new IllegalArgumentException("As coordenadas não foram informadas !!");
        }
    }
     
    // Popula primeiro rover - Inicio
    public Rover popula_primeiro_rover(String comandos){
    
        Rover rover1 = null;
        
        if(!comandos.isEmpty()){
            
            comandos = comandos.replaceAll("\\s+", "");
                        
            if(comandos.length() == 3){
                
                if(verifica_numeros(comandos.substring(0, 2)) && verifica_direcao(comandos.substring(2, 3))){
                    
                    rover1 = new Rover(Character.getNumericValue(comandos.charAt(0)),
                                       Character.getNumericValue(comandos.charAt(1)),
                                       limite_x,
                                       limite_y,
                                       comandos.substring(2,3));
                }else{
                  throw new IllegalArgumentException("Está fora do padrão esperado !!");
                }
            }else{
                 throw new IllegalArgumentException("A quantidade de parametros é maior que o permitido !!");
            }
        }else{
            throw new IllegalArgumentException("As coordenadas não foram informadas !!");
         }
    
    return rover1;
    }
   
    public String comandos_primeiro_rover(String comandos){
        
        if(!comandos.isEmpty()){
        
            comandos = comandos.replaceAll("\\s+", "");
            
            if(verifica_comandos(comandos)){
                return comandos;
            }else{
             throw new IllegalArgumentException("Os comandos estão fora dos padrões !!");
            }    
        }
        return null; 
        
    }
    // Popula primeiro rover - Fim 
    
    // Popula segundo rover - Inicio 
    public Rover popula_segundo_rover(String comandos){
    
        Rover rover2 = null;
        
        if(!comandos.isEmpty()){
            
            comandos = comandos.replaceAll("\\s+", "");
                         
            if(comandos.length() == 3){
                
                if(verifica_numeros(comandos.substring(0, 2)) && verifica_direcao(comandos.substring(2, 3))){
                    
                    rover2 = new Rover(Character.getNumericValue(comandos.charAt(0)),
								 Character.getNumericValue(comandos.charAt(1)),
								 limite_x,
								 limite_y,
								 comandos.substring(2,3));
                }
                else{
                  throw new IllegalArgumentException("Está fora do padrão esperado !!");
                }
            }else{
              throw new IllegalArgumentException("A quantidade de parametros é maior que o permitido !!");
            }
        }else{
        throw new IllegalArgumentException("Os comandos estão fora dos padrões !!");
        }
    
    return rover2;
    
    }
   
    public String comandos_segundo_rover(String comandos){
        
        if(!comandos.isEmpty()){
        
            comandos = comandos.replaceAll("\\s+", "");
            
            if(verifica_comandos(comandos)){
                return comandos;
            }else{
             throw new IllegalArgumentException("Os comandos estão fora dos padrões !!");
            }    
        }
        return null; 
        
    }
    // Popula segundo rover - Fim 
    
    // Funções de verificações - Inicio
    public boolean verifica_numeros(String comandos){
        
        char aux;
        int cont = 0;
        String numeros = "0123456789";
        
        for(int i =0; i<comandos.length(); i++){
            
            aux = comandos.charAt(i);
            if(Character.isDigit(aux)){
                cont ++;}
        }
        
        if(cont == 2){
            return true;
        }else{
            return false;   
        }    
     }
    
    public boolean verifica_direcao(String direcao){
        
        String numeros = "NEWS";
        
        for(int i =0; i<numeros.length(); i++){
            if(numeros.matches("(.*)"+ direcao +"(.*)")){
                return true;}
        }
        return false;
    }
    
    public boolean verifica_comandos(String comandos){
    
        String comando = "LRM";
        int c = 0;
        
        for(int i =0; i<comandos.length();i++){
            for(int j=0; j<comando.length();j++){
                if(comandos.charAt(i) == comando.charAt(j)){
                    c++;
                }
            }
        }
        
        if(c == comandos.length()){
            return true;
        }else{
            return false;
        }
    }
    // Funções de verificações - Fim
    
    public Integer getLimite_x() {
        return limite_x;
    }

    public void setLimite_x(Integer limite_x) {
        this.limite_x = limite_x;
    }

    public Integer getLimite_y() {
        return limite_y;
    }

    public void setLimite_y(Integer limite_y) {
        this.limite_y = limite_y;
    }
    
}
