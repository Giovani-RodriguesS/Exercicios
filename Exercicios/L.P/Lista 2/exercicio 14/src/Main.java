import java.util.*;
public class Main {
    public static void main(String[] args) {
//  Variaveis
        int pagamento,parcelas;
        double compra, total;
        Scanner in = new Scanner(System.in);
//  Entrada
        System.out.println("Insira o valor da compra: ");
        compra = in.nextDouble();
        System.out.println(" ");
        System.out.println("---------MENU---------");
        System.out.println("1. Débito");
        System.out.println("2. Crédito");
        System.out.println("3. Pix ");
        System.out.println(" ");
        System.out.println("Escolha a forma de pagamento: ");
        pagamento = in.nextInt();
//  Modo escolhido
        if(pagamento == 1)
            System.out.println("Débito escolhido");
        if(pagamento == 2)
            System.out.println("Crédito escolhido");
        if(pagamento == 3)
            System.out.println("Pix escolhido");

//  Condicional
        switch (pagamento) {
            case 1: // Débito
                total = compra - 0.05 * compra;
                System.out.println("Desconto de 5%");
                System.out.println("Total a pagar: " + total);
                break;
            case 2: // Crédito
                System.out.println("Parcelamento em quantas vezes: ");
                parcelas = in.nextInt();

                if(parcelas <= 4 && parcelas > -1) {
                    total = compra + compra * 0.02;
                    System.out.println("Total a pagar: " + total);
                } else
                    if(parcelas > 4) {
                        total = compra + compra * 0.05;
                        System.out.println("Total a pagar: " + total);
                    } else
                        System.out.println("Inválido");

                break;
            case 3: // Pix
                total = compra - 0.1 * compra;
                System.out.println("Desconto de 10%");
                System.out.println("Total a pagar: " + total);
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
    }
}