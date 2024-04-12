public class Carro {
    //atributos
    private String cor;
    private int posX;
    private int posY;
    private int largura;
    private int altura;
    //construtor
    public Carro(String cor,int posX, int posY,int largura, int altura){
       this.cor = cor;
       this.posX = posX;
       this.posY = posY;
       this.largura = largura;
       this.altura = altura;
   }


    //metodos
    public void andarFrente(){
        if(posY > 0)
            posY--;
    }
    public void andarRe(){
        if(posY < 1080-200)
            posY++;
    }
    public void andarDireita(){
        if(posX < 1920-80)
            posX++;
    }
    public void andarEsquerda(){
        if(posX > 0)
            posX--;
    }
    //To string

    @Override
    public String toString() {
        return "Carro{" +
                "cor='" + cor + '\'' +
                ", posX=" + posX +
                ", posY=" + posY +
                ", largura=" + largura +
                ", altura=" + altura +
                '}';
    }
}
