package parrot;

public class AfricanParrot extends Parrot {

    public static final double LOAD_FACTOR = 9.0;

    public AfricanParrot(int numberOfCoconuts) {
        super(numberOfCoconuts);
    }

    @Override
    public String getCry() {
        return "Sqaark!";
    }

    @Override
    public double getSpeed() {
        return Math.max(0, BASE_SPEED - LOAD_FACTOR * numberOfCoconuts);
    }
}
