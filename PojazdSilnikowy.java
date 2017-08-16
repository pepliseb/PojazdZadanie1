import java.awt.*;


public abstract class PojazdSilnikowy extends Pojazd {

    private String typeEngine ;
    private double lkm = 0;

    public PojazdSilnikowy(int passenger, int fuelcap, double lkm, double liters, int dist, Color kolor, int osie, int moc, String typeEngine) {
        super(passenger,  fuelcap,  lkm,  liters,  dist, kolor, osie, moc);
        this.typeEngine = typeEngine;

    }

    public abstract boolean wymienOlej();

    public String getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }


}





