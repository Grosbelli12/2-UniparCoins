import java.util.Scanner;

public class CarteiraDigital {

    public void bemVindo() {
        System.out.println("Bem-vindo à sua Carteira Digital!");
    }
    public void menu() {
        System.out.println("Escolha uma opção\n 1- Adicionar Saldo\n 2- Realizar Pagamento\n 3- Verificar Saldo\n 4- Sair ");
    }
    public String  LerEntradaUsuario() {
        Scanner sc = new Scanner(System.in);
        String entrada = "";
        entrada = sc.nextLine();
        return entrada;
    }
    double carteira = 0.0;

    public void adiconarvalor(double valor){
    carteira += carteira + valor;
        System.out.println("Saldo adicionado com sucesso!");
    }
    public double carteira(){
        return carteira;
    }
    }
