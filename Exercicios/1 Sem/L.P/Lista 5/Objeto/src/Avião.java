public class Avião {
    //atributos
    private int posX;
    private int posY;
    private int posZ;
    private int largura;
    private int comprimento;
    private String cor;

    //construtor
    public Avião (int posX, int posY, int posZ, int largura, int comprimento, String cor) {
        this.posZ = posZ;
        this.posX = posX;
        this.posY = posY;
        this.largura = largura;
        this.comprimento = comprimento;
        this.cor = cor;
    }

    //metodos
    public void subir() {
        posZ++;
    }
    public void descer() {
        posZ--;
    }
    public void virarDireita() {
        posX++;
    }
    public void virarEsquerda() {
        posX--;
    }
    public void acelerar(){
        posY++;
    }
    public void desacelerar(){
        posY--;
    }

    @Override
    public String toString() {
        return "Avião{" +
                "posX=" + posX +
                ", posY=" + posY +
                ", posZ=" + posZ +
                ", largura=" + largura +
                ", comprimento=" + comprimento +
                ", cor='" + cor + '\'' +
                '}';
    }
}
