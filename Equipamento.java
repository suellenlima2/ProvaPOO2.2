import java.util.Scanner;

public class Equipamento {
    private Scanner ler = new Scanner(System.in);
    private String nome;
    private int quantidade;
    private Fabricante fabricante;
    private Setor setor;
    private boolean status; /* situação */

    public Equipamento() {
        System.out.println("-------------------------------------");
        System.out.println("\nDigite o nome do equipamento: ");
        nome = ler.nextLine();
        System.out.println("Digite a situacao do equipamento: ");
        System.out.println("True = Em funcionamento");
        System.out.println("False = Necessária manutenção");
        status = ler.nextBoolean();
        fabricante = new Fabricante();
        setor = new Setor();

    }

    public void exibirEquipamento() {
        System.out.println("\n------------- DADOS DO(s) EQUIPAMENTOS ---------------");
        System.out.println("Nome do equipamento: " + nome);
        System.out.println("Situacao do equipamento: " + status);
        fabricante.exibir();
        setor.exibirSetor();

    }

    public void manutencao() {
        if (status == false) {
            System.out.println("O equipamento irá para a manutenção!");
            status = true;
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println("\nO equipamento foi concertado!!!");
            
        } else if (status == true) {
            System.out.println("O equipamento não precisa de manutenção!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

}