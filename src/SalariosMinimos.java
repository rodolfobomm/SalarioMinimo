import java.util.Scanner;

public class SalariosMinimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = sc.nextDouble();

        System.out.print("Digite o valor do salário do usuário: ");
        double salarioUsuario = sc.nextDouble();

        double quantidadeSalarios = salarioUsuario / salarioMinimo;

        System.out.println("O usuário ganha " + quantidadeSalarios + " salários mínimos.");

        sc.close();
    }
}
