public class Main {
    public static void main(String[] args) {

        Arquivo arq = new Arquivo("Teste.txt");
        arq.abrir();
        arq.editar("Ola mundoo");
        arq.abrir();
        arq.renomear("NovoTexto.txt");
        arq.abrir();
        arq.limpar();
        arq.abrir();
    }
}