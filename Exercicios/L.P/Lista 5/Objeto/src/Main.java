
public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro ("azul", 850, 250, 80, 200);
        System.out.println(c1);
        Avião av1 = new Avião(0, 0, 0, 10, 80, "azul");

        for (int i =0; i < 100;i++) {
            av1.subir();
            if (i < 50)
                av1.acelerar();
            if (i > 70 && i < 85){
                av1.virarDireita();
                av1.desacelerar();
            }
            if (i>85) {
                av1.virarEsquerda();
                av1.descer();
            }
        }
        System.out.println(av1);
    }
}