public class Inimigo extends Personagem {
    private String tipo;
    private int recompensaXP;

    public Inimigo(String nome, int pontosVida, int forca, int defesa, String tipo, int recompensaXP) {
        super(nome, pontosVida, forca, defesa);
        this.tipo = tipo;
        this.recompensaXP = recompensaXP;
    }

    @Override
    public void usarHabilidade(Personagem alvo) {
    }

    public String getTipo() {
        return tipo;
    }

    public int getRecompensaXP() {
        return recompensaXP;
    }
}
