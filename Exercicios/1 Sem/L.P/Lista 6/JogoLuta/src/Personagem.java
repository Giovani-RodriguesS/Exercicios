import java.util.Random;

public class Personagem {

    Random r = new Random();

    // atributos

    private String nome;
    private int vida;
    private int ataque;
    private int defesa;

    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 100;
        this.ataque = r.nextInt(11)+20;
        this.defesa = r.nextInt(6)+10;
    }

    // metodos
    public void atacar(Personagem personagem) {
        if(personagem.getVida() < 1) {
            System.out.println(personagem.getNome() + " morreu. "+ this.nome + " venceu! ");
            return;
        }
        int dano = personagem.defesa - this.ataque;
        if(dano > 0)
            return;
        personagem.vida += dano;
    }

    // Getter
    public int getVida() {
        return vida;
    }

    public String getNome() {
        return nome;
    }

    public int getDefesa() {
        return defesa;
    }

    // Setter
    public void setVida(int vida) {
        this.vida = vida;
    }


}
