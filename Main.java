import java.awt.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
//        SamochodCiezarowy samochodCiezarowy = new SamochodCiezarowy(6,3,3,3,3,Color.RED,4, 1500, true, 30000, "diesel" , true);
        new Main();




    }


    private Scanner scanner;
    public Main() {
        scanner = new Scanner(System.in);
    start();
//        SamochodCiezarowy samochodCiezarowy = new SamochodCiezarowy(6,3,3,3,3,Color.RED,4, 1500, true, 30000, "diesel" , true);

    }

    private void start() {
        System.out.println("Witaj w mojej wypożyczalni aut");

        String command;
        do {
            System.out.println("------------------------------");
            System.out.println("1 - Wolne pojazdy");
            System.out.println("2 - Zasieg auta");
            System.out.println("3 - Kolor aut");
            System.out.println("4 - Pokaż ilość miejsc dla pasażerów");
            System.out.println("Wpisz polecenie: ");
            System.out.println("-------------------------------");
            command = scanner.nextLine();
            parseChoice(command);
//
        }while (!command.equals("exit"));
    }

    private void parseChoice(String command) {
        switch (command) {
            case "1":{
                showFreeCars();
                break;
            }
            case "2" : {
                distanceCars();
                break;
            }
            case "3" : {
                colorCars();
                break;
            }
            case "4" :{

                countPassangers();
                break;
            }
            case "exit" : {
                System.out.println("Do widzenia! ");
                break;
            }
            default: {
                System.out.println("Nie ma takiej komendy");
            }
        }

    }

SamochodCiezarowy samochodCiezarowy = new SamochodCiezarowy(6,3,3,3,3,Color.RED,4, 1500, true, 30000, "diesel" , true);
    SamochodOsobowy samochodOsobowy = new SamochodOsobowy(7,350,3,3,3,Color.WHITE,3,3,false,"diesel", false);

    private void countPassangers() {

        System.out.println("Liczba pasażerów dla samochodu ciężarowego: " + samochodCiezarowy.getPassenger());

        System.out.println("Liczba pasażerów dla samochodu osobowego: " + samochodOsobowy.getPassenger());

    }

    private void distanceCars() {

    }

    private void colorCars(){
        System.out.println("Kolor auta osobowego: " + samochodOsobowy.getKolor());
        System.out.println("Kolor auta cieżarowego: " + samochodCiezarowy.getKolor());
            }

    private void showFreeCars() {
          PojazdSilnikowy pojazdCiezarowyA = new SamochodCiezarowy(3,3,3,3,3,Color.RED,8,7000,true,30000, "benzyna", false);


    }


}











//
//    SamochodCiezarowy samochodCiezarowyA = new SamochodCiezarowy(6,3,3,3,3,Color.RED,4, 1500, true, 30000, "diesel" , true);
//    PojazdSilnikowy pojazdCiezarowyA = new SamochodCiezarowy(3,3,3,3,3,Color.RED,8,7000,true,30000, "benzyna", false);
//        PojazdSilnikowy pojazdCieB = new SamochodCiezarowy(3,3,3,3,3,Color.BLUE,8,5000,false, 450, "benzyna");
//        PojazdSilnikowy pojazdCieC = new SamochodCiezarowy(3,3,3,3,3,Color.YELLOW,16,2500,true, 1500,"benzyna");
//        PojazdSilnikowy pojazdCieD= new SamochodCiezarowy(3,3,3,3,3,Color.MAGENTA,4,3000,false,500,"benzyna");
//
//        PojazdSilnikowy pojazdOsoA = new SamochodOsobowy(5,300,32,3,3,Color.BLUE,3,3, true, "elektryczny");
//        SamochodOsobowy pojazdOsoB = new SamochodOsobowy(7,350,3,3,3,Color.WHITE,3,3,false,"diesel");
//        PojazdSilnikowy pojazdOsoC = new SamochodOsobowy(4,250,3,3,3,Color.BLUE,3,3,false,"benzyna");
//        PojazdSilnikowy pojazdOsoD = new SamochodOsobowy(50,700,3,3,3,Color.BLUE,3,3, true,"elektryczny");
//        PojazdSilnikowy pojazdSilnikowy = new SamochodDostawczy(5,3000,3,4,5,Color.RED,3,4,true, 400,"benzyna");
//
//        Main t = new Main();
//// PojazdSilnikowy pojazd = new Pojazd( );
////        pojazdB.setKolor(Color.BLUE);
//
//         // ile paliwa na x km
//        System.out.println("Potrzebuje fuelneeded CieD: " + pojazdCieD.fuelneeded(100,5));
//        System.out.println("Potrzebuje range: " + pojazdCieD.range(55,12.5));
//        System.out.println("Potrzebuje range: " + pojazdOsoA.range(55, 8.6));
//        System.out.println("Max ilość pasażerów: " + pojazdOsoA.getPassenger());
//        System.out.println("Kolor dostepnego auta: " + pojazdCieA.getKolor());
//        System.out.println("Kolor dostepnego auta: " + pojazdCieB.getKolor());
//        System.out.println("Max dystans: " + pojazdCieC.getDist());
//        System.out.println("Klasa samochodu: " + pojazdCieA.getClass());
//        System.out.println("Ilość potrzebnego paliwa: " + pojazdOsoD.fuelneeded(1000,5)) ;
//        System.out.println("Ilość potrzebnego paliwa: " + pojazdCieD.fuelneeded(1000,6)) ;
//        System.out.println("Max ilość pasażerów: " + pojazdCieD.getPassenger());
//        System.out.println("Rodzaj silnika: " + pojazdOsoD.getTypeEngine());
//        System.out.println("Max ilość zbiornika: " + pojazdOsoA.getFuelcap());
//        System.out.println("Max cieżar samochodu " + samochodCiezarowy.getMaxCiezar());
//        samochodCiezarowy.zatrzymaj();
//
//        Pojazd[] arrayOfPojazd = {pojazdCieA,pojazdCieB,pojazdSilnikowy};
//        for (Pojazd pojazd : arrayOfPojazd) {
//            System.out.println("Liczba pasażerów  " + pojazd.getPassenger() + " Lista pojazdów: " + pojazd.getClass()+ ", " + pojazd.getKolor() + ", " + pojazd.getDist() );
//        }
//
//
//
//        SamochodOsobowy[] arrayOfSamochodOsobowy = {};
//        for (SamochodOsobowy samochodOsobowy : arrayOfSamochodOsobowy) {
//            System.out.println("Czy to jest hybryda " + samochodOsobowy.isCzyHybryda() + "\nSilnik "+ samochodOsobowy.getTypeEngine());
//        }
//
//        System.out.println(pojazdSilnikowy.getPassenger());
//    }
//
//    public boolean sprawdzKolor(Pojazd a, Pojazd b) {
//
//        return a.getKolor().equals(b.getKolor());
//    }
//
//    public boolean zmienOlej(PojazdSilnikowy p) {
//
//        return p.wymienOlej();
//    }
//
//
//
//
//
//}

