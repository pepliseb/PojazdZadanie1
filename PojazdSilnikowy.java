import java.awt.*;


public abstract class PojazdSilnikowy extends Pojazd {

    private String engine ;

    public PojazdSilnikowy(int passenger, int fuelcap, double lkm, double liters, int dist, Color kolor, int osie, int moc, String engine ) {
        super(passenger,  fuelcap,  lkm,  liters,  dist, kolor, osie, moc);
        this.engine = engine;

    }

    public abstract boolean wymienOlej();

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}





