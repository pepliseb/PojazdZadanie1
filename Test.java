import java.awt.*;

public class Test {

    public static void main(String[] args) {

        SamochodCiezarowy samochodCiezarowy = new SamochodCiezarowy(6,3,3,3,3,Color.RED,4, 1500, true, 30000, "diesel");
        System.out.println(samochodCiezarowy.getMaxCiezar());

        PojazdSilnikowy pojazdCieA = new SamochodCiezarowy(3,3,3,3,3,Color.RED,8,7000,true,30000, "benzyna");
        PojazdSilnikowy pojazdCieB = new SamochodCiezarowy(3,3,3,3,3,Color.BLUE,8,5000,false, 450, "benzyna");
        PojazdSilnikowy pojazdCieC = new SamochodCiezarowy(3,3,3,3,3,Color.YELLOW,16,2500,true, 1500,"benzyna");
        PojazdSilnikowy pojazdCieD= new SamochodCiezarowy(3,3,3,3,3,Color.MAGENTA,4,3000,false,500,"benzyna");

        PojazdSilnikowy pojazdOsoA = new SamochodOsobowy(5,300,32,3,3,Color.BLUE,3,3, true, "elektryczny");
        PojazdSilnikowy pojazdOsoB = new SamochodOsobowy(7,350,3,3,3,Color.WHITE,3,3,false,"diesel");
        PojazdSilnikowy pojazdOsoC = new SamochodOsobowy(4,250,3,3,3,Color.BLUE,3,3,false,"benzyna");
        PojazdSilnikowy pojazdOsoD = new SamochodOsobowy(50,700,3,3,3,Color.BLUE,3,3, true,"elektryczny");


        PojazdSilnikowy pojazdSilnikowy = new SamochodDostawczy(5,3000,3,4,5,Color.RED,3,4,true, 400,"benzyna");

        Test t = new Test();


// PojazdSilnikowy pojazd = new Pojazd( );
//        pojazdB.setKolor(Color.BLUE);
//
//
//        SamochodCiezarowy pojazdC = new SamochodCiezarowy();
        pojazdCieA.zatrzymaj();
        

         // ile paliwa na x km 
        System.out.println("Potrzebuje fuelneeded " + pojazdCieD.fuelneeded(100,5));
        System.out.println("Potrzebuje range " + pojazdCieD.range(55,12.5));
        System.out.println("Potrzebuje range " + pojazdOsoA.range(55, 8.6));

        System.out.println(pojazdOsoA.getPassenger());
        System.out.println(pojazdCieA.getKolor());
        System.out.println(pojazdCieB.getKolor());
        System.out.println(pojazdCieC.getDist());
        System.out.println(pojazdCieA.getClass());
        System.out.println(pojazdOsoD.fuelneeded(1000,5)) ;
        System.out.println(pojazdCieD.fuelneeded(1000,6)) ;
        System.out.println(pojazdCieD.getPassenger());
        System.out.println(pojazdOsoD.getTypeEngine());
        System.out.println(pojazdOsoA.getFuelcap());


        Pojazd[] arrayOfPojazd = {pojazdCieA,pojazdCieB,pojazdSilnikowy};

        for (Pojazd pojazd : arrayOfPojazd) {
            System.out.println("Liczba pasażerów  " + pojazd.getPassenger() + " Lista pojazdów " + pojazd.getClass() + pojazd.getKolor() + pojazd.getDist() );
        }



        SamochodOsobowy[] arrayOfSamochodOsobowy = {pojazdOsoD};

        for (SamochodOsobowy samochodOsobowy : arrayOfSamochodOsobowy) {
            System.out.println(samochodOsobowy.isCzyHybryda() + samochodOsobowy.getTypeEngine());
        }


        


//        System.out.println(pojazdSilnikowy.setPassenger(4));
    }

    public boolean sprawdzKolor(Pojazd a, Pojazd b) {

        return a.getKolor().equals(b.getKolor());
    }

    public boolean zmienOlej(PojazdSilnikowy p) {

        return p.wymienOlej();
    }

}

