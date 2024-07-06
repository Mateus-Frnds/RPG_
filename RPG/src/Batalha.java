import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Batalha {
    private List<Personagem> personagens;
    private List<Inimigo> inimigos;

    public Batalha(List<Personagem> personagens, List<Inimigo> inimigos) {
        this.personagens = personagens;
        this.inimigos = inimigos;
    }

    public void iniciar() {
        System.out.println("A batalha começou!");

        List<Personagem> turnos = new ArrayList<>();
        turnos.addAll(personagens);
        turnos.addAll(inimigos);

        while (!personagens.isEmpty() && !inimigos.isEmpty()) {
            for (Personagem personagem : turnos) {
                if (personagem instanceof Inimigo) {
                    Inimigo inimigo = (Inimigo) personagem;
                    if (!personagens.isEmpty()) {
                        inimigo.atacar(personagens.get(0));
                        if (personagens.get(0).getPontosVida() <= 0) {
                            System.out.println(personagens.get(0).getNome() + " foi derrotado!");
                            personagens.remove(0);
                        }
                    }
                } else {
                    if (!inimigos.isEmpty()) {
                        personagem.atacar(inimigos.get(0));
                        if (inimigos.get(0).getPontosVida() <= 0) {
                            System.out.println(inimigos.get(0).getNome() + " foi derrotado!");
                            inimigos.remove(0);
                        }
                    }
                }
            }
        }

        if (personagens.isEmpty()) {
            System.out.println("Os inimigos venceram!");
        } else {
            System.out.println("Os personagens venceram!");
        }
    }
}
