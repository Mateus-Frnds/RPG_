import java.util.List;
import java.util.ArrayList;

public abstract class Personagem {
    protected String nome;
    protected int pontosVida;
    protected int forca;
    protected int defesa;
    protected List<Habilidade> habilidades;

    public Personagem(String nome, int pontosVida, int forca, int defesa) {
        this.nome = nome;
        this.pontosVida = pontosVida;
        this.forca = forca;
        this.defesa = defesa;
        this.habilidades = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public int getForca() {
        return forca;
    }

    public int getDefesa() {
        return defesa;
    }

    public void adicionarHabilidade(Habilidade habilidade) {
        habilidades.add(habilidade);
    }

    public void atacar(Personagem alvo) {
        int dano = calcularDano(this.forca, alvo.defesa);
        alvo.receberDano(dano);
        System.out.println(nome + " atacou " + alvo.getNome() + " causando " + dano + " de dano.");
    }

    protected int calcularDano(int ataque, int defesaAlvo) {
        return Math.max(0, ataque - defesaAlvo);
    }

    public void receberDano(int dano) {
        pontosVida -= dano;
        if (pontosVida < 0) {
            pontosVida = 0;
        }
    }

    public abstract void usarHabilidade(Personagem alvo);
}
