import java.util.Scanner;

public class Menu {
    //Menu principal
    public void menuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al programa de la Champions League, seleccione una opción:");
        System.out.println("1. Tabla de posiciones");
        System.out.println("2. Estadísticas de equipos");
        System.out.println("3. Listado de equipos");
        System.out.println("4. Salir");
        System.out.print("Ingrese una opción: ");
        int opcion = scanner.nextInt();
        seleccionMenu(opcion);
    }

    //Menu de estadísticas de equipos
    public void menuEstadisticasEquipos() {
        System.out.println("Menu Estadísticas de Equipos");
        System.out.println("1. El equipo con más títulos");
        System.out.println("2. El equipo con menos títulos");
        System.out.println("3. El equipo más antiguo");
        System.out.println("4. El equipo más reciente");
        System.out.println("5. Equipos de un país");
        System.out.println("6. Partidos jugados por un equipo");
        System.out.println("7. Volver");
        System.out.print("Ingrese una opción: ");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        seleccionMenuEstadisticasEquipos(opcion);
    }

    //Menu de regreso a menu principal
    public void menuRegreso() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("1. Volver al menú principal");
        System.out.println("2. Salir");
        System.out.print("Ingrese una opción: ");
        int opcion = scanner.nextInt();
        if (opcion == 1) {
            menuPrincipal();
        } else {
            System.out.println("Gracias por visitar la Champions League");
            System.exit(0);
        }
    }

    //Menu de regreso a menu de estadisticas de equipos
    public void menuRegresoEstadisticasEquipos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("1. Volver al menú de estadísticas de equipos");
        System.out.println("2. Salir");
        System.out.print("Ingrese una opción: ");
        int opcion = scanner.nextInt();
        if (opcion == 1) {
            menuEstadisticasEquipos();
        } else {
            System.out.println("Gracias por visitar la Champions League");
            System.exit(0);
        }
    }

    //Seleccion de menu
    public void seleccionMenu(int opcion) {
        switch (opcion) {
            case 1:
                //Tabla de posiciones
                Posiciones posiciones = new Posiciones();
                posiciones.posicionesTabla();
                menuRegreso();
                break;
            case 2:
                //Estadísticas de equipos
                menuEstadisticasEquipos();
                menuRegreso();
                break;
            case 3:
                //Estadísticas de jugadores
                Equipos equipos = new Equipos();
                equipos.mostrarEquipos();
                menuRegreso();
                break;
            case 4:
                //Salir
                System.out.println("Gracias por visitar la Champions League");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    //Seleccion de menu de estadisticas de equipos
public void seleccionMenuEstadisticasEquipos(int opcion) {
        switch (opcion) {
            case 1:
                //El equipo con más títulos
                Equipos equipos = new Equipos();
                equipos.equipoMasTitulos();
                menuRegresoEstadisticasEquipos();
                break;
            case 2:
                //El equipo con menos títulos
                equipos = new Equipos();
                equipos.equipoMenosTitulos();
                menuRegresoEstadisticasEquipos();
                break;
            case 3:
                //El equipo más antiguo
                equipos = new Equipos();
                equipos.equipoMasAntiguo();
                menuRegresoEstadisticasEquipos();
                break;
            case 4:
                //El equipo más reciente
                equipos = new Equipos();
                equipos.equipoMasReciente();
                menuRegresoEstadisticasEquipos();
                break;
            case 5:
                //Equipos de un país
                equipos = new Equipos();
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese el país: ");
                String pais = scanner.nextLine();
                equipos.equiposPais(pais);
                menuRegresoEstadisticasEquipos();
                break;
            case 6:
                //Partidos jugados por un equipo
                Partidos partidos = new Partidos();
                scanner = new Scanner(System.in);
                System.out.print("Ingrese el código del equipo: ");
                String codigoEquipo = scanner.nextLine();
                partidos.partidosEquipo(codigoEquipo);
                menuRegresoEstadisticasEquipos();
                break;
            case 7:
                //Volver
                menuPrincipal();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}
