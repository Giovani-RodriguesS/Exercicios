public class Arquivo {

    // atributos
    private String nome;
    private double tamanho;
    private String conteudo;

    // construtor

    public Arquivo(String nome) {
        this.nome = nome;
        this.tamanho = 0.0;
        this.conteudo = "";
    }

    // métodos
    public void abrir () {
        System.out.println("Nome: " + nome + "\n" +conteudo + "\nTamanho do arquivo: "
                + tamanho +" bits");
    }
    public void editar (String texto) {
        conteudo += texto;
        tamanho = conteudo.length()*8;
    }
    public void renomear (String novoNome) {
        this.nome = novoNome;
        System.out.println("Renomeado com sucesso para: "+ novoNome);
    }
    public void limpar () {
        this.conteudo = "";
        System.out.println("O arquivo está limpo!");
        tamanho = conteudo.length()*8;
    }
}
