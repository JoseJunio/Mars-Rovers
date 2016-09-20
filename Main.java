/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zup;

import java.util.Scanner;

/**
 *
 * @author José_Junio
 */
public class Main {
   
    private static Scanner scanner;
    
    public static void main(String args[]){
        
    // verifica os comandos
    Comandos comando = new Comandos();
        
    // primeiro robô rover
    Rover primeiro = new Rover(); 
    
    // primeiro robô rover
    Rover segundo = new Rover();
    
    
    Scanner scanner = new Scanner(System.in);
    
    // Limite maximo informado pelo usuário para a matriz dos robos
    String limite         = "";
    
    // Posições informadas pelos robos rovers 1 e 2
    String posicao_rover1 = "";
    String posicao_rover2 = "";
    
    // Comandos recebidos pelos robos rovers 1 e 2 
    String comandos_rover1 = "";
    String comandos_rover2 = "";
    
    // Flag's para o controle do limite, das posições e comandos
    boolean limiteOk    = true;
    boolean posicoesOk  = true;
    boolean comandosOk  = true;
    
    // primeiro robo mars
    
    System.out.println("INPUT: \n");
    
    do{
        
        if(limiteOk){
        // pega o limite da matriz a partir das coordenadas x e y
        try{ 
            limite = scanner.nextLine();
            comando.popula_Coordenada(limite);
            limiteOk = false;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        }
        
        
        if(posicoesOk){
        // seta a primeira coordenada(x,y) do robo
        try{
            posicao_rover1 = scanner.nextLine();
            posicao_rover1 = posicao_rover1.toUpperCase();
            primeiro = comando.popula_primeiro_rover(posicao_rover1);
            posicoesOk=false;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        }
        
        if(comandosOk){
        // seta os comandos de sequencia    
        try{
            comandos_rover1 = scanner.nextLine();
            comandos_rover1 = comandos_rover1.toUpperCase();
            primeiro.setComandos(comando.comandos_primeiro_rover(comandos_rover1));
            posicoesOk=false;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }}
        
    }while(limiteOk && posicoesOk && comandosOk);
    
    posicoesOk = true;
    comandosOk = true;
    
    //comando = null;
      do{
        
        if(posicoesOk){
        // seta a primeira coordenada(x,y) do robo
        try{
            posicao_rover2 = scanner.nextLine();
            posicao_rover2 = posicao_rover2.toUpperCase();
            segundo = comando.popula_segundo_rover(posicao_rover2);
            posicoesOk = false;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }}
        
        if(comandosOk){
        // seta os comandos de sequencia    
        try{
            comandos_rover2 = scanner.nextLine();
            comandos_rover2 = comandos_rover2.toUpperCase();
            segundo.setComandos(comando.comandos_segundo_rover(comandos_rover2));
            posicoesOk = false;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }}
        
    }while(posicoesOk && comandosOk);
      
    System.out.println("\nOUTPUT:\n");  
      
    primeiro.executa_comandos();
    primeiro.posicao(); 
    segundo.executa_comandos();
    segundo.posicao(); 
    
    
    }
}
