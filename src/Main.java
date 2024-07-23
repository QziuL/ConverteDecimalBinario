import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal;
        String res = "";

        System.out.println("== Calculadora de Decimal Para Binário ==");
        do {
            System.out.println("Digite um número binário maior ou igual a 2: ");
            decimal = Integer.parseInt(scanner.nextLine());
            if (decimal >= 2) {
                System.out.println(converte(decimal));
                System.out.println("\n- Deseja encerrar? (s/n)");
                res = scanner.nextLine();
            }
            System.out.println();
        } while(decimal < 2 || res.equals("n") || res.equals("N"));

        scanner.close();
    }

    private static String converte(int valor) {
        if (valor == 1) return "1";
        if (valor == 2) return "10";
        int quociente = valor / 2;
        int resto = valor % 2;
        return converte(quociente)+resto;
    }
}