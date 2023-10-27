package com.left.menuEmails;

import java.util.Scanner;
public class menuModule {
    public static void main(String[] args) {
        SaveBase saveBase = new SaveBase();
        Scanner scanner = new Scanner(System.in);
        boolean keepMenu = true;
        while (keepMenu) {
            System.out.println("Menu de Opções:");
            System.out.println("1-Adicionar modelo de e-mail");
            System.out.println("2-Remover modelo de e-mail");
            System.out.println("3-Editar modelo de e-mail");
            System.out.println("4-Visualizar Lista");
            System.out.println("4-Voltar");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Limpa o buffer de entrada
            
            switch (choice) {
                case 1:
                    // Lógica para adicionar modelo de e-mail
                    break;
                case 2:
                    // Lógica para remover modelo de e-mail
                    break;
                case 3:
                    // Lógica para editar modelo de e-mail
                    break;
                case 4:
                    // Lógica para atualizar a lista
                    break;
                case 5:
                    keepMenu = false;
                    break;
                default:
                    System.out.println("Escolha uma opção válida.");
            }
        }
        scanner.close();
    }
}
