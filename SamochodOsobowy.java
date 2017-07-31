import java.awt.*;

public class SamochodOsobowy extends PojazdSilnikowy {

    private boolean czyHybryda;

    public SamochodOsobowy(int passenger, int fuelcap, double lkm, double liters, int dist, Color kolor, int osie, int moc, boolean czyHybryda, String engine) {
        super(passenger, fuelcap, lkm, liters, dist, kolor, osie, moc, engine);
        this.czyHybryda = czyHybryda;
    }

    @Override
    public boolean wymienOlej() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean uruchom() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void zatrzymaj() {
    }

    public boolean isCzyHybryda(){

        return false;
    }
}






