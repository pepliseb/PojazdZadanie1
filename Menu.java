import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private static List<String> listOfNames;
    private static Scanner scanner;
public static void(){
    listOfNames = new ArrayList<>();
    scanner = new Scanner(System.in);



    int choice ;
        do {
        printMain();
        choice = Integer.parseInt(scanner.nextLine());
        parseChoice(choice);
    }while (choice != 3);

}
    private static void  printMain(){
        System.out.println("------------------------------------------");
        System.out.println("Wpisz: ");
        System.out.println(" 1 - aby dodać nowe imię");
        System.out.println(" 2 - aby wyświetlić wszystkie imiona");
        System.out.println(" 3 - aby wyjść");

        System.out.println("Twój wybór: ");
        System.out.println("------------------------------------------");
    }

    private static void parseChoice(int choice){
        switch (choice){

            case 1:{
                System.out.println("Wpisz imię: ");
                listOfNames.add(scanner.nextLine());
                System.out.println("Dodałem imie!");
                break;
            }
            case 2: {
                for (String name: listOfNames) {
                    System.out.println(name);
                } break;
            }
            case 3:{
                System.out.println("Wyjscie");
                break;
            }
            default:{
                System.out.println("Nie ma takiej komendy");
            }

        }

    }
}

}
