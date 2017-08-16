import java.awt.*;

public class SamochodCiezarowy extends PojazdSilnikowy {

    private boolean czyMaPrzyczepe;
    private int maxCiezar;

    public SamochodCiezarowy(int passenger, int fuelcap, double lkm, double liters, int dist, Color kolor, int osie, int moc, boolean czyMaPrzyczepe, int maxCiezar, String typeEngine) {
        super(passenger, fuelcap, lkm, liters, dist, kolor, osie, moc, typeEngine);
        this.czyMaPrzyczepe = czyMaPrzyczepe;
        this.maxCiezar = maxCiezar;
    }
    private double lkm = 12.5;

    public boolean isCzyMaPrzyczepe() {
        return czyMaPrzyczepe;
    }

    public void setCzyMaPrzyczepe(boolean czyMaPrzyczepe) {

        this.czyMaPrzyczepe = czyMaPrzyczepe;
    }

    public int getMaxCiezar() {

        return maxCiezar;
    }

    public void setMaxCiezar(int maxCiezar) {
        this.maxCiezar = maxCiezar;
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
        // TODO Auto-generated method stub

    }

    @Override
    public int range(int fuelcap, double lkm) {
        return super.range(fuelcap, lkm);
    }

    public void maxCiezarPojazdu(){
        System.out.println("Max ładowność" + maxCiezar);
    }
}
