import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numDec;
        int [] numBin = new int[8];
        //  entrada
        System.out.println("Digite um numero decimal inteiro para encontrar seu binário");
        numDec = in.nextInt();
        //  transformação p binario
        binario(numDec,0 ,numBin);
        //  saida
        for(int i=0;i<8;i++){
            if(i%4 == 0 && i != 0)
                System.out.print(" "+numBin[8-1-i]);
            else
                System.out.print(numBin[8-1-i]);
        }
    }
    static void binario(int numDec, int i, int [] numBin){
        int aux;
        int rest = numDec%2; //resto

        if(numDec == 1) { // retorna a função (1)
            numBin[i] = 1;
            return;
        }
        else if (numDec == 0) { // retorna a função (0)
            numBin[i] = 0;
            return;
        }
        // divisões de numDec
        if(rest == 1)
            aux = (numDec - 1) / 2;
        else
            aux = numDec/2;
        // salva o resto no vetor
        numBin[i] = rest;
        // Recursividade
        if(numDec > 1)
            binario(aux, i+1, numBin);
    }
}

//Desenvolva um algoritmo que converta numeros decimais para binarios