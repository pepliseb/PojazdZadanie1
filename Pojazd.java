

import java.awt.Color;

public abstract class Pojazd {
    private int passenger;
    private int fuelcap;
    private double lkm;
    private double liters;
    private int dist;
    private Color kolor;
    private int osie;
    private double moc;

//    public Pojazd() {
//
//    }


        public Pojazd(int startPassenger, int startFuelcap, double startLkm, double startLiters, int startDist, Color startKolor, int startOsie, double startMoc) {
        this.passenger = startPassenger;
        this.fuelcap = startFuelcap;
        this.lkm = startLkm;
        this.liters = startLiters;
        this.dist = startDist;
        this.kolor = startKolor;
        this.osie = startOsie;
        this.moc = startMoc;
    }


    public Color getKolor() {

        return kolor;
    }

    public void setKolor(Color kolor) {

        this.kolor = kolor;
    }



    public double getMoc() {

            return moc;
    }

    public void setMoc(double moc) {
        this.moc = moc;
    }




    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public double getLkm() {
        return lkm;
    }

    public void setLkm(double lkm) {
        this.lkm = lkm;
    }

    public double getLiters() {
        return liters;
    }

    public void setLiters(double liters) {
        this.liters = liters;
    }

    public int getDist() {
        return dist;
    }

    public void setDist(int dist) {
        this.dist = dist;
    }

    public int getOsie() {
        return osie;
    }

    public void setOsie(int osie) {
        this.osie = osie;
    }



    public int range(){
        return (int)(fuelcap/lkm*100);
    }

    public  double fuelneeded(int km){
        return (double) km/100 * lkm;
    }

    
    public abstract boolean uruchom();

    public abstract void zatrzymaj();
}