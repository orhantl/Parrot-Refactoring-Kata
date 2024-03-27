package parrot;

public class EuropeanParrot extends Parrot {

    public EuropeanParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        super(numberOfCoconuts, voltage, isNailed);
    }

    @Override
    public String getCry() {
        return "Sqoork!";
    }

    @Override
    public double getSpeed() {
        return BASE_SPEED;
    }
}
