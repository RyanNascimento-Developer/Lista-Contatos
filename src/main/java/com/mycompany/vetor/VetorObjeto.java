package com.mycompany.vetor;

//Add import
import java.util.Arrays;
import javafx.beans.binding.StringBinding;

/**
 *
 * @author ryann
 */

public class VetorObjeto {

    private Object[] elementos;
    private int tamanho;
    
    //Método utilizado para ver a capacidade do vetor
    public VetorObjeto(int capacidade){
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }
    
    public void adiciona(Object elemento) throws Exception{
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length){ //length usado para ler/contar os campos do "elementos"
            this.elementos[this.tamanho] = elemento;
            this.tamanho ++;
        }else{//caso tente colocar mais que 5 elementos. Caso queira almentar ir no Main...Linha 12
            throw new Exception("O vetor já está cheio, não é possivel adicionar novos elementos");
        }
    }
    
    //Utilizada para retornar na class Main.
    public int tamanho(){
        return this.tamanho;
    }
    
    //Esse método vai retornar o elemento no array.
    @Override
    public String toString(){
        
        //Esse apresenta null caso não tenha nenhuma infrmação
        //return Arrays.toString(elementos);
        
        //Esse faz um trata mento para não apresentar os em braco
        StringBuilder s = new StringBuilder() ;
        s.append("{");
        
        //Esse apresenta os elementos
        for(int i = 0 ; i < this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }
        
        //Esse é a parte que vai tirar os em branco
        if(this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }
        
        s.append("}");
        
        return  s.toString();    
    }
    
    public Object busca(int posicao)throws Exception{
        if(posicao >= 0 && posicao < tamanho){
            return elementos[posicao];
        }else{
            throw new Exception("Posição inválida!");
        }
    }
    
    public int busca1(Object elemento){
        for(int i = 0 ; i<tamanho; i++){
            if(elementos[i].equals(elemento)){// Converte o elemento do array para minúsculas para a comparação
                return i;
            }
        }
        return -1;
    }
    
    public boolean adicionaInicio(int posicao, Object elemento) throws Exception{
        this.aumentaCapacidade();
        if(posicao >= 0 && posicao < tamanho){
            for(int i=this.tamanho-1; i>posicao; i--){
                this.elementos[i+1] = this.elementos[i];
            }
            this.elementos[posicao] = elemento;
            this.tamanho++;
        }else{
            throw new Exception("Posição inválida");
        }
        
        return true;
    }
    
    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            Object[] elementosNovo = new Object[this.elementos.length * 2];
            for(int i = 0 ; i < this.elementos.length; i++){
                elementosNovo[i] = this.elementos[i];
            }
            this.elementos = elementosNovo;
        }
    }
    
    public void remove(int posicao) throws Exception{
        if(posicao >= 0 && posicao < tamanho){
            for(int i = posicao; i< this.tamanho-1;i++){
                this.elementos[i] = this.elementos[i+1];
            }
            this.tamanho--;
        }else {
            throw new Exception("Posição invalida");
        }
        
    }
}