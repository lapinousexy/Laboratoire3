package ch.heigvd.gen.component;

public class GoSquare extends Square {
    public GoSquare(String name, int number) {
        super(name, number);
    }

    @Override
    public void landedOn(Player player) {
        player.addCash(200);
    }
}
