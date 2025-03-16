public class Gato extends Animal {
    private String corPelo;

    public Gato(String nome, int idade, String corPelo) {
        super(nome, idade, "Miau");
        this.corPelo = corPelo;
    }

    @Override
    public void emitirSom() {
        System.out.println(this.nome + " está miando: " + this.som);
    }

    public void arranhar() {
        System.out.println(this.nome + " está arranhando.");
    }
}