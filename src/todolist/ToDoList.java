/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package todolist;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class ToDoList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        Boolean continuar = true;
        while (continuar) {
            System.out.println("\n=== LISTA DE TAREFAS ===");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Concluir tarefa");
            System.out.println("4 - Excluir tarefa");
            System.out.println("5 - Sair");
            
            System.out.println("Selecione uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao){
                case 1:
                    System.out.print("Digite a tarefa: ");
                    String novaTarefa = scanner.nextLine();
                    tarefas.add(" " + novaTarefa);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;
                    
                case 2:
                    System.out.println("\n--- TAREFAS ---");
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa cadastrada.");
                    } else {
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + ". " + tarefas.get(i));
                        }
                    }
                    break;
                    
                case 3:
                    if (tarefas.isEmpty()) {
                        System.out.println("\nNenhuma tarefa cadastrada para concluir.");
                        break;
                    }

                    
                    System.out.println("\n--- TAREFAS DISPONÍVEIS ---");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println((i + 1) + ". " + tarefas.get(i));
                    }

                    System.out.print("Digite o número da tarefa concluida: ");
                    int numConcluir = scanner.nextInt();
                    
                    if (numConcluir > 0 && numConcluir <= tarefas.size()) {
                        String tarefaAtual = tarefas.get(numConcluir - 1);
                        tarefas.set(numConcluir - 1, tarefaAtual.replace("[ ]", "[X]"));
                        System.out.println("Tarefa marcada como concluída!");
                    } else {
                        System.out.println("Número inválido!");
                    }
                    break;

                case 4:
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa para excluir.");
                        break;
                    }
                    System.out.print("Digite o número da tarefa a excluir: ");
                    int numExcluir = scanner.nextInt();
                    
                    if (numExcluir > 0 && numExcluir <= tarefas.size()) {
                        tarefas.remove(numExcluir - 1);
                        System.out.println("Tarefa excluída com sucesso!");
                    } else {
                        System.out.println("Número inválido!");
                    }
                    break;

                case 5:
                    continuar = false;
                    System.out.println("Flw");
                    break;

                default:
                    System.out.println("Não tem seu mula, digite um número de 1 a 5.");
                    break;
            }
        }
    }
}

