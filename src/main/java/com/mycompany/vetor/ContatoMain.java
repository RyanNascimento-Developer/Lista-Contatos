package com.mycompany.vetor;

/**
 *
 * @author ryann
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContatoMain {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        List<Contato> contatos = new ArrayList<>();

        System.out.println("Digite os detalhes do contato (ou digite 'sair' para encerrar):");
                  
        while (true) {
            Contato contato = criarContato(scanner);
            
            // Sai do loop se o usuário digitar "sair"
            if (contato == null) {
                break; 
            }
            
            contatos.add(contato);
        }

        System.out.println("Lista de contatos:");
        for (Contato contato : contatos) {
            System.out.println(contato);
        }

        System.out.println("Total de contatos: " + contatos.size());

        scanner.close();
    }

    public static Contato criarContato(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        
        // Retorna null se o usuário digitar "sair"
        if (nome.equalsIgnoreCase("sair")) {
            return null; 
        }

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        return new Contato(nome, telefone, email);
    }
}