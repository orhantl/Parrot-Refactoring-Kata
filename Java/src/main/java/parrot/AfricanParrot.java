package parrot;

public class AfricanParrot extends Parrot {

    private static final double LOAD_FACTOR = 9.0;
    private final int numberOfCoconuts;

    private AfricanParrot(int numberOfCoconuts) {
        super();
        this.numberOfCoconuts = numberOfCoconuts;
    }

    public static AfricanParrot createAfricanParrot(int numberOfCoconuts) {
        return new AfricanParrot(numberOfCoconuts);
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
