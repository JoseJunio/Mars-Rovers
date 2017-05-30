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
public class Rover{
    
    // Posição do Rover da coordenada x.    
    private Integer posicao_x;
    
    // Posição do Rover da coordenada y.
    private Integer posicao_y;
   
    // Posição máxima da coordenada x pode assumir;
    private Integer limite_x;
    
    // Posição máxima da coordenada y pode assumir;
    private Integer limite_y;

    // Comandos do robo Rover
    private String comandos;  
    
    // Posição do Rover em relação a sua posição
    private String coordenada;
    
    // Constutor padrão
    public Rover() {
    }
    
    public Rover(Integer pos_x, Integer pos_y, Integer lmt_x, Integer lmt_y, String coordena_inicial){
    
        this.posicao_x = pos_x;
        this.posicao_y = pos_y;
        this.limite_x = lmt_x;
        this.limite_y = lmt_y;
        this.coordenada = coordena_inicial.toUpperCase();
        
    }
    
   public void posicao(){
       System.out.println(this.posicao_x + " " + this.posicao_y + " " + this.coordenada);   
   }    

   public void executa_comandos(){
        
       comandos = comandos.toUpperCase();
	
       for(int i=0; i<comandos.length(); i++){
           executa_comando_character(comandos.charAt(i));
       }
   }
    
   public void executa_comando_character(Character comando){
   
       if(comando.equals(Constants.LEFT)){
        vire_Esquerda();
       }else{
          if(comando.equals(Constants.RIGTH)){
          vire_Direita();
          }
          else{
              if(comando.equals(Constants.MOVE)){
              move();
              }
          }
       }
   }
   
   public void move(){
      
       if(this.coordenada.equals(Constants.NORTH) && (this.posicao_y < this.limite_y)){
          this.posicao_y++;
       }else{
           if(this.coordenada.equals(Constants.EAST) && (this.posicao_x < this.limite_x)){
              this.posicao_x++;
           }else{
               if(this.coordenada.equals(Constants.WEST) && (this.posicao_x > 0)){
                 this.posicao_x--;
                }
               else{
                   if(this.coordenada.equals(Constants.SOUTH) && (this.posicao_y > 0)){
                   this.posicao_y--;
                   }
               }
           }
       }
       
   }
   
   public void vire_Direita(){
        
       if(this.coordenada.equals(Constants.NORTH)){
           setCoordenada(Constants.EAST);
       } else{
            if(this.coordenada.equals(Constants.EAST)){
            setCoordenada(Constants.SOUTH);
            }else{
                if(this.coordenada.equals(Constants.SOUTH)){
                setCoordenada(Constants.WEST);
                }
                else {
                    if(this.coordenada.equals(Constants.WEST)){
                        setCoordenada(Constants.NORTH);
                    }
                }
            }
       }    
   }
   
   public void vire_Esquerda(){
        
       if(this.coordenada.equals(Constants.NORTH)){
           setCoordenada(Constants.WEST);
       } else{
            if(this.coordenada.equals(Constants.WEST)){
            setCoordenada(Constants.SOUTH);
            }else{
                if(this.coordenada.equals(Constants.SOUTH)){
                setCoordenada(Constants.EAST);
                }
                else {
                    if(this.coordenada.equals(Constants.EAST)){
                        setCoordenada(Constants.NORTH);
                    }
                }
            }
       }    
   }
   
    public Integer getPosicao_x() {
        return posicao_x;
    }

    public void setPosicao_x(Integer posicao_x) {
        this.posicao_x = posicao_x;
    }

    public Integer getPosicao_y() {
        return posicao_y;
    }

    public void setPosicao_y(Integer posicao_y) {
        this.posicao_y = posicao_y;
    }

    public Integer getLimite_x() {
        return limite_x;
    }

    public void setLimite_x(Integer limite_x) {
        this.limite_x = limite_x;
    }

    public String getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(String coordenada) {
        this.coordenada = coordenada;
    }

    public Integer getLimite_y() {
        return limite_y;
    }

    public void setLimite_y(Integer limite_y) {
        this.limite_y = limite_y;
    }
    
    public String getComandos() {
        return comandos;
    }

    public void setComandos(String comandos) {
        this.comandos = comandos;
    }
    
}
