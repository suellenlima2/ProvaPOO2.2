import java.util.Scanner;

public class Responsavel {
    private Scanner ler = new Scanner(System.in);
    private String nome;
    private String telefone;

    public Responsavel() { 
        System.out.println("Digite o nome do responsável: ");
        nome = ler.nextLine();
        System.out.println("Digite o número de telefone do responsável: ");
        telefone = ler.nextLine();
        System.out.println("--------------------------------------------");
    }

    public void exibirResponsavel(){
        System.out.println("Nome do responsável: "+nome);
        System.out.println("Número de telefone do responsável pelo setor:"+telefone);
        System.out.println("-------------------------------------------------------");
       
    }
    

    
}
