import java.util.Arrays;

public class Jogo {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Guerreiro", 100, 20, 10);
        Mago mago = new Mago("Mago", 80, 15, 5, 50);
        Arqueiro arqueiro = new Arqueiro("Arqueiro", 90, 18, 8, 25);

        Inimigo monstro = new Inimigo("Monstro", 70, 12, 6, "Monstro", 50);
        Inimigo chefe = new Inimigo("Chefe", 150, 25, 15, "Chefe", 100);

        Batalha batalha = new Batalha(Arrays.asList(guerreiro, mago, arqueiro), Arrays.asList(monstro, chefe));
        batalha.iniciar();
    }
}
