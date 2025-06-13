public class Animal {
    protected String nome;
    protected int idade;
    protected String som;

    public Animal(String nome, int idade, String som) {
        this.nome = nome;
        this.idade = idade;
        this.som = som;
    }

    public void emitirSom() {
        System.out.println(this.nome + " está emitindo som: " + this.som);
    }

    public void dormir() {
        System.out.println(this.nome + " está dormindo.");
    }
}