import java.awt.*;

public class SamochodOsobowy extends PojazdSilnikowy {

    private boolean czyHybryda;
    private double lkm = 8.6;
    public SamochodOsobowy(int passenger, int fuelcap, double lkm, double liters, int dist, Color kolor, int osie, int moc, boolean czyHybryda, String typeEngine) {
        super(passenger, fuelcap, lkm, liters, dist, kolor, osie, moc, typeEngine);
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

    @Override
    public int range(int fuelcap, double lkm) {
        return super.range(fuelcap, lkm);
    }
}






