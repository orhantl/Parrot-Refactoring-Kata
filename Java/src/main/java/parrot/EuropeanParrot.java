package parrot;

public class EuropeanParrot extends Parrot {

    public EuropeanParrot() {
        super();
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
