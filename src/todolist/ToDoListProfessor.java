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
public class ToDoListProfessor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        Boolean continuar = true;
        String[] tarefas = new String(10);
        boolean[] concluidas;
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
           
            switch (opcao) {
            case 1:
                int posicaolivre = -1;
                for(int i = 0; i < tarefas.length; i++){
                    if(tarefas[1] == null){
                        posicaolivre = i;
                        break;
                    }
                }
                if (posicaolivre == -1){
                    System.out.println("A lista de tarefas está cheia");
                }else{
                    System.out.println("Digite a tarefa: ");
                    tarefas[posicaolivre] = scanner.nextLine();
                    concluidas[posicaolivre] = false;
                    System.out.println("Tarefa adicionada com sucesso");
                }
                break;
                
            case 2:
                
                System.out.println("===== MINHAS TAREFAS =====");
                
                boolean esxisteTarefa = false;
                
                for(int i = 0; i< tarefas.lenght; i++){
                    if(tarefas[i] != null){
                        existeTareafa = tue;
                        
                        if(concluidas[i] == true){
                            System.out.println((i + 1) + "- [x] " + tarefa[i]);
                        }else{
                            System.out.println((i + 1) + "- [ ] " + tarefa[i]);
                        }
                    }
                    
                }
                
                if(existeTarefa == false){
                    System.out.println("Nenhuma tarefa cadastrada!");
                }
                break;
                
            case 3:
                System.out.println("Digite o número da tarefa que deseja concluir: ");
                int numeroConcluir = scanner.nextInt();
                int indiceConcluir = numeroConcluir -1;
                break;
                
            case 4:
                System.out.println("d");
                break;
                
            case 5:
                System.out.println("e");
                break;
                
            default:
                System.out.println("f");
                break;
        }
           
           
           
        }
       
    }
   
}
