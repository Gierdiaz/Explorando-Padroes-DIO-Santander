package Strategy;

public class Robo {
    private Comportamento Comportamento;

    public void setComportamento(Comportamento Comportamento) {
        this.Comportamento = Comportamento;
    }

    public void mover() {
        Comportamento.mover();
    }
}
