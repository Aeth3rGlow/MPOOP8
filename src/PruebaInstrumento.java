public class PruebaInstrumento {
    static void main(String[] args) {
        InstrumentoMusical instrumento;

        instrumento = new Flauta();
        instrumento.tocar();
        System.out.println(instrumento.tipoInstrumento());
    }
}

