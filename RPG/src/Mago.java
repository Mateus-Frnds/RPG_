public class Mago extends Personagem {
    private int pontosMagia;

    public Mago(String nome, int pontosVida, int forca, int defesa, int pontosMagia) {
        super(nome, pontosVida, forca, defesa);
        this.pontosMagia = pontosMagia;
    }

    @Override
    public void usarHabilidade(Personagem alvo) {
    }

    public int getPontosMagia() {
        return pontosMagia;
    }
}
