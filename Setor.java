import java.util.Scanner;

public class Setor {
    private Scanner ler = new Scanner(System.in);
    private String nome;
    private Responsavel responsavel;

    public Setor() {
        System.out.println("Digite o nome do setor: ");
        nome = ler.nextLine();
        responsavel = new Responsavel();
    }

    public void exibirSetor(){
        System.out.println("Nome do setor: "+nome);
        responsavel.exibirResponsavel();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }
  
}
