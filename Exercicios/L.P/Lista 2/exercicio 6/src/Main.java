import java.util.*;
public class Main {
    public static void main(String[] args) {
        int entrada;
        String extrato = "Extrato",
               sacar = "Sacar",
               emprestimo = "Empréstimos",
               cartao = "Cartão",
               mais = "Mais Opções";

        Scanner in = new Scanner(System.in);

        System.out.println(" Caixa Eletronico ");
        System.out.println("__________ Menu de Opções __________ ");
        System.out.println("5. Extrato ");
        System.out.println("6. Sacar ");
        System.out.println("7. Empréstimos ");
        System.out.println("8. Cartão ");
        System.out.println("9. Mais Opções ");
        System.out.println("Insira um numero: ");
        entrada = in.nextInt();
        if(entrada >= 5  && entrada <= 9) {
            if(entrada == 5)
            System.out.println("Opção escolhida: " + extrato);
            else if(entrada == 6)
                System.out.println("Opção escolhida: " + sacar);
            else if(entrada == 7)
                System.out.println("Opção escolhida: " + emprestimo);
            else if(entrada == 8)
                System.out.println("Opção escolhida: " + cartao);
            else
                System.out.println("Opção escolhida: " + mais);
        }else
            System.out.println("Opção inválida ");



    }
}/*Em um sistemas de caixa eletrônico o usuário deve escolher entre as opções de ummenu escolhendo
um número inteiro entre 5 e 9 inclusive. Crie um algoritmo
que validea entrada do usuário exibindo a opções escolhida
 ou a mensagem de opção inválida casoo usuário entre com um número fora do range estabelecido.*/