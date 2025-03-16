public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 3, "Pastor Alemão");
        Gato gato = new Gato("Mimi", 2, "Preto");

        cachorro.emitirSom();
        cachorro.dormir();
        cachorro.abanarRabo();

        gato.emitirSom();
        gato.dormir();
        gato.arranhar();
    }
}