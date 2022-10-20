import java.util.Scanner;

public class Menu {
    private Scanner ler = new Scanner(System.in);
    private Scanner ler2 = new Scanner(System.in);
    private int tamanho;

    private Equipamento[] equipamentos;

    public Menu() {
        System.out.println("\nQual a quantidade de equipamentos você deseja cadastrar? ");
        tamanho = ler.nextInt();
        equipamentos = new Equipamento[tamanho];
        int op;

        do {

            System.out.println("\n-------------- MENU ---------------");
            System.out.println("1 - Cadastrar Equipamento");
            System.out.println("2 - Exibir Equipamentos");
            System.out.println("3 - Remover Um Equipamento");
            System.out.println("4 - Verificar Status Para Manutenção ");
            System.out.println("5 - Mudar Setor");
            System.out.println("6 - Sair");
            System.out.println("-------------------------------------");

            System.out.println("\nDigite a opção do menu que deseja ser executar:");
            op = ler.nextInt();

            /*Switch com métodos executando as opções do menu */
            switch (op) {

                case 1:
                    cadastrarEquipamento();
                    break;

                case 2:
                    exibirEquipamento();
                    break;

                case 3:
                    removerEquipamento();

                    break;

                case 4:
                    manutencaoEquipamento();

                    break;

                case 5:
                    mudarSetor();
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                 System.out.println("Essa opção não está no menu!");
                 break;
            }

        } while (op != 6);

    }

    private void cadastrarEquipamento() {
 
        for (int i = 0; i < equipamentos.length; i++) {
            if (equipamentos[i] == null) {
                Equipamento equipamento = new Equipamento();
                equipamentos[i] = equipamento;
            }else if(equipamentos[i] != null){
                System.out.println("A quantidade de equipamentos estipulada já foi cadastrada.");
                System.out.println("Não é possivel cadastrar mais equipamentos!!!");
            }
        }
    }

    private void exibirEquipamento() {
        for (int i = 0; i < equipamentos.length; i++) {
            if (equipamentos[i] != null) {
                equipamentos[i].exibirEquipamento();
            }
        }
    }

    private void removerEquipamento() {
        String n;
        int cont = 0;

        System.out.println("Digite o nome do equipamento que voce deseja remover:");
        n = ler2.nextLine();

        for (int i = 0; i < equipamentos.length; i++) {
            if (equipamentos[i] != null) {
                if (equipamentos[i].getNome().equalsIgnoreCase(n)) {
                    equipamentos[i] = null;
                    System.out.println("O equipamento " + n + " foi removido!!!");
                    break;
                }else{
                    System.out.println("O equipamento digitado não foi cadastrado.");
                    System.out.println("Não é possível removê-lo!");
                    break;
                }
            }
        }
    }

    private void mudarSetor() {
        String nome;
        System.out.println("Digite o nome do equipamento que voce deseja mudar o setor: ");
        nome = ler2.nextLine();
        for (int i = 0; i < equipamentos.length; i++) {
            if (equipamentos[i] != null) {
                if (equipamentos[i].getNome().equalsIgnoreCase(nome)) {
                    Setor s1 = new Setor();
                    equipamentos[i].setSetor(s1);
                    System.out.println("O equipamento foi mudado de setor!!!");
                    break;
                }else{
                   System.out.println("Não é possível mudar o equipamento de setor, o mesmo não foi cadastrado!");
                   break;
                }
            }
        }

    }

    private void manutencaoEquipamento() {
        String nome;
        System.out.println("Digite o nome do equipamento que voce deseja verificar o status: ");
        nome = ler2.nextLine();

        for (int i = 0; i < equipamentos.length; i++) {
            if (equipamentos[i] != null) {
                if (equipamentos[i].getNome().equalsIgnoreCase(nome)) {
                    equipamentos[i].manutencao();
                } else{
                    System.out.println("O equipamento digitado não está cadastrado!");
                    break;
                }
            }
        }
    }

}
