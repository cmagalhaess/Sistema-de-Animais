public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade, "Au Au");
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println(this.nome + " está latindo: " + this.som);
    }

    public void abanarRabo() {
        System.out.println(this.nome + " está abanando o rabo.");
    }
}