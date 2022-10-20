import java.util.Scanner;

public class Fabricante {
    private Scanner ler = new Scanner(System.in);
    private String nomeFabricante;
    private String numeroFabricante;
    
    public Fabricante() {
        System.out.println("Digite o nome do fabricante: ");
        nomeFabricante = ler.nextLine();
        System.out.println("Digite o número de telefone do fabricante: ");
        numeroFabricante = ler.nextLine();
    }

    public void exibir(){
        System.out.println("Nome do fabricante: "+nomeFabricante);
        System.out.println("Número do fabricante: "+numeroFabricante);
    }
    
    
    
}
