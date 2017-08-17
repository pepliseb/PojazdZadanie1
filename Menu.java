//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Menu {
//
//    int choice ;
//    Scanner scanner = new Scanner(System.in);
//    public Menu(int choice) {
//        this.choice = choice;
//    }
//
//        do {
//        printMain();
//        choice = Integer.parseInt(scanner.nextLine());
//        parseChoice(choice);
//    }while (choice != 3);
//
//
//    private static void  printMain(){
//        System.out.println("------------------------------------------");
//        System.out.println("Wpisz: ");
//        System.out.println(" 1 - Dostępne pojazdy");
//        System.out.println(" 2 - Pokaż zasięg ");
//        System.out.println(" 3 - aby wyjść");
//
//        System.out.println("Twój wybór: ");
//        System.out.println("------------------------------------------");
//    }
//
//    private static void parseChoice(int choice){
//        switch (choice){
//
//            case 1:{
//                System.out.println("Podaj nazwe auta ");
//                listOfNames.add(scanner.nextLine());
//                System.out.println(samochodCiezarowy.getMaxCiezar());
//                System.out.println("Podałem nazwę");
//                break;
//            }
//            case 2: {
//                for (String name: listOfNames) {
//                    System.out.println(name);
//                } break;
//            }
//            case 3:{
//                System.out.println("Wyjscie");
//                break;
//            }
//            default:{
//                System.out.println("Nie ma takiej komendy");
//            }
//
//        }
//
//    }
//}
//
//
