
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroAlunos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List <Alunos> list = new ArrayList<>();
		
		while (true) {
		    System.out.println("---CADASTRO DE ALUNOS---");
		    System.out.print("""
		            -----------------
		            [1]CADASTRAR ALUNO
		            [2]REGISTRO
		            [3]REMOVER ALUNO
		            [4]SAIR
		            [0]MODO ADMIN
		            ----------------
		            """);
		    System.out.print("Digite a opção desejada: ");
		    
		    int op = sc.nextInt();
		    
		    if (op == 4) {
		        System.out.println("Saindo do programa ...");
		        break; // Sai do loop infinito e encerra o programa
		    }
		    
		    switch (op) {
		        case 1:
		            System.out.print("Digite o nome do aluno: ");
		            sc.nextLine();
		            String nome = sc.nextLine();
		            
		            System.out.print("Digite sua idade: ");
		            int idade = sc.nextInt();
		            
		            System.out.print("Digite o número da matrícula: ");
		            String nMatricula = sc.next();
		            
		            Alunos aluno = new Alunos(nome, idade, nMatricula);
		            list.add(aluno);
		            
		            break;
		        
		        case 2:
		        	int tamanho = list.size();
		        	if(tamanho == 0) {
		        		System.out.println("LISTA VAZIA");
		        		break;
		        	}
		            System.out.println("LISTAGEM");
		            System.out.println(list);
		            break;
		        
		        case 3:
		            System.out.print("Digite o valor a ser removido: ");
		            sc.nextLine(); // Consumir a nova linha pendente
		            
		            String remover = sc.nextLine();

		            boolean alunoRemovido = false;
		            for (Alunos alunos : list) {
		                if (alunos.getName().equals(remover) || alunos.getnMatricula().equals(remover)) {
		                    list.remove(alunos);
		                    alunoRemovido = true;
		                    break;
		                }
		            }

		            if (alunoRemovido) {
		                System.out.println("Aluno removido com sucesso.");
		            } else {
		                System.out.println("Aluno não encontrado na lista.");
		            }
		            break;

		        	

		        
		        case 0:
		            // Restante do código para a opção 0
		            
		            break;
		        
		        default:
		            System.out.println("Opção inválida!");
		    }
		    
		    System.out.println("Pressione 'S' para voltar ao menu ou qualquer tecla para sair.");
		    char opMenu = sc.next().charAt(0);
		    if (opMenu != 'S' && opMenu != 's') {
		        break; // Sai do loop infinito e encerra o programa
		    }
		}

		
		
		
		
 }
	
  }


