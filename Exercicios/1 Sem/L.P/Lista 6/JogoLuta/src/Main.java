public class Main {
    public static void main(String[] args) {

        Personagem p1 = new Personagem("Mike");
        Personagem p2 = new Personagem("Caina");

        while(p1.getVida() > 0 || p2.getVida() > 0) {
            p1.atacar(p2);
            System.out.println(p1.getNome() + " atacou " + p2.getNome() + ". Sua vida agora é: "
                    + p2.getVida());
            if(p2.getVida() < 1)
                return;
            p2.atacar(p1);
            System.out.println(p2.getNome() + " atacou " + p1.getNome() + ". Sua vida agora é: "
                    + p1.getVida());
            if(p1.getVida() < 1)
                return;
        }
    }
}