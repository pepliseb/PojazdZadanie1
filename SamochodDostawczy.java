import java.awt.*;

public class SamochodDostawczy extends SamochodCiezarowy {
        private String zastosowanie;

    public SamochodDostawczy(int passenger, int fuelcap, double lkm, double liters, int dist, Color kolor, int osie, int moc, boolean czyMaPrzyczepe, int maxCiezar, String typeEngine, boolean
                             free) {
        super(passenger, fuelcap, lkm, liters, dist, kolor, osie, moc, czyMaPrzyczepe, maxCiezar, typeEngine,free);

    }

    public String getZastosowanie() {
        return zastosowanie = "budowa";
    }

    public void setZastosowanie(String zastosowanie) {
            this.zastosowanie = zastosowanie;
    }
}
