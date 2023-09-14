package com.mycompany.vetor;

/**
 *
 * @author ryann
 */

public class Projeto_Vetor {

    public static void main(String[] args) throws Exception{
        
        //chama a class Vetor para ser utilizada na Main.
        Vetor vetor  = new Vetor(5);
        
        // tru/catch trata os erros. 
        try{
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
            vetor.adiciona("elemento 3");
            vetor.adiciona("elemento 4");
            vetor.adiciona("elemento 5");            
        }catch(Exception e){
            e.printStackTrace();
        }

        //Imprime o tamanho do vetor e o array
        System.out.println("O tamanho do vetor é: " + vetor.tamanho() + 
                           "\n O conteudo do Array é: " + vetor.toString());
        
        System.out.println(vetor.busca(1));


        System.out.println(vetor.busca1("elemento 1"));
        
        System.out.println(vetor.tamanho());
        System.out.println(vetor.toString());

        

    }
}