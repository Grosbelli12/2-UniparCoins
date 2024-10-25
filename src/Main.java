import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CarteiraDigital carteira = new CarteiraDigital();
        carteira.bemVindo();
        String resosta = "";
        Scanner sc = new Scanner(System.in);

        while (!resosta.equalsIgnoreCase("4")){
        carteira.menu();
        carteira.LerEntradaUsuario();
        if (carteira.LerEntradaUsuario().contains("1")) {
            System.out.println("");
            carteira.adiconarvalor();
        } else if (resosta.contains("1")) {
//carteira.adiconarvalor();
        }
        }
    }
}