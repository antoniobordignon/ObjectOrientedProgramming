import java.util.Scanner;

public class Atm {
    public static void main(String args[]) {
        int buffer = 0;
        String message = "";
        Scanner scan = new Scanner(System.in);
        buffer = scan.nextInt();
        switch (buffer) {
            case 1:
                message = buffer + " - Caixa";
                break;
            case 2:
            message = buffer + " - Financiamento";
                break;
            case 3:
            message = buffer + " - Empréstimo";
                break;
            case 4:
            message = buffer + " - Produtor Rural";
                break;
            case 5:
            message = buffer + " - Abertura de Contas";
                break;
            case 6:
            message = buffer + " - Falar com o Gerente";
                break;

            default:
            message = buffer + " - Opção Inexistente";
                break;
        }
        System.out.println(message);
    }
}
