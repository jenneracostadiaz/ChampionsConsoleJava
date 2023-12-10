import java.util.Scanner;

public class Equipos {
    //Atributos
    public String codigo[] = new String[10];
    public String nombre[] = new String[10];
    public String pais[] = new String[10];
    public int titulos[] = new int[10];
    public String fechaFundacion[] = new String[10];

    //Constructor
    public Equipos() {
        codigo[0] = "E001";
        nombre[0] = "Manchester City  ";
        pais[0] = "Inglaterra";
        titulos[0] = 1;
        fechaFundacion[0] = "1880";

        codigo[1] = "E002";
        nombre[1] = "Real Madrid      ";
        pais[1] = "España";
        titulos[1] = 13;
        fechaFundacion[1] = "1902";

        codigo[2] = "E003";
        nombre[2] = "Bayer Munich     ";
        pais[2] = "Alemania";
        titulos[2] = 6;
        fechaFundacion[2] = "1900";

        codigo[3] = "E004";
        nombre[3] = "Barcelona        ";
        pais[3] = "España";
        titulos[3] = 5;
        fechaFundacion[3] = "1899";

        codigo[4] = "E005";
        nombre[4] = "Borussia Dortmund";
        pais[4] = "Alemania";
        titulos[4] = 1;
        fechaFundacion[4] = "1909";

        codigo[5] = "E006";
        nombre[5] = "FC Porto         ";
        pais[5] = "Portugal";
        titulos[5] = 2;
        fechaFundacion[5] = "1893";

        codigo[6] = "E007";
        nombre[6] = "Shakhtar Donetsk ";
        pais[6] = "Ucrania";
        titulos[6] = 1;
        fechaFundacion[6] = "1936";

        codigo[7] = "E008";
        nombre[7] = "Antwerp          ";
        pais[7] = "Bélgica";
        titulos[7] = 1;
        fechaFundacion[7] = "1880";

        codigo[8] = "E009";
        nombre[8] = "RB Leipzig       ";
        pais[8] = "Alemania";
        titulos[8] = 1;
        fechaFundacion[8] = "2009";

        codigo[9] = "E010";
        nombre[9] = "Paris Saint-Germain";
        pais[9] = "Francia";
        titulos[9] = 0;
        fechaFundacion[9] = "1970";
    }

    //Data para los Equipos - Arreglos Paralelos
    //    public class EquiposData {
    //        public String codigo[] = {"E001", "E002", "E003", "E004", "E005", "E006", "E007", "E008", "E009", "E010"};
    //        public String nombre[] = {"Manchester City", "Real Madrid", "Bayer Munich", "Barcelona", "Borussia Dortmund", "FC Porto", "Shakhtar Donetsk", "Antwerp", "RB Leipzig", "Paris Saint-Germain"};
    //        public String pais[] = {"Inglaterra", "España", "Alemania", "España", "Alemania", "Portugal", "Ucrania", "Bélgica", "Alemania", "Francia"};
    //        public int titulos[] = {1, 13, 6, 5, 1, 2, 1, 1, 1, 0};
    //        public String fechaFundacion[] = {"1880", "1902", "1900", "1899", "1909", "1893", "1936", "1880", "2009", "1970"};
    //    }

    //Muestra los datos de los equipos
    public void mostrarEquipos() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Código: " + codigo[i]);
            System.out.println("Nombre: " + nombre[i]);
            System.out.println("País: " + pais[i]);
            System.out.println("Títulos: " + titulos[i]);
            System.out.println("Fecha de fundación: " + fechaFundacion[i]);
            System.out.println();
        }
    }

    //Nombre del equipo
    public String nombreEquipo(String codigo){
        String nombre = "";
        for (int i = 0; i < 10; i++) {
            if (this.codigo[i].equals(codigo)) {
                nombre = this.nombre[i];
            }
        }
        return nombre;
    }

    //El equipo con más títulos
    public void equipoMasTitulos() {
        int mayor = titulos[0];
        int posicion = 0;
        for (int i = 0; i < 10; i++) {
            if (titulos[i] > mayor) {
                mayor = titulos[i];
                posicion = i;
            }
        }
        System.out.println("El equipo con más títulos es: " + nombre[posicion] + " con " + mayor + " títulos");
    }

    //El equipo con menos títulos
    public void equipoMenosTitulos() {
        int menor = titulos[0];
        int posicion = 0;
        for (int i = 0; i < 10; i++) {
            if (titulos[i] < menor) {
                menor = titulos[i];
                posicion = i;
            }
        }
        System.out.println("El equipo con menos títulos es: " + nombre[posicion] + " con " + menor + " títulos");
    }

    //El equipo más antiguo
    public void equipoMasAntiguo() {
        int menor = Integer.parseInt(fechaFundacion[0]);
        int posicion = 0;
        for (int i = 0; i < 10; i++) {
            if (Integer.parseInt(fechaFundacion[i]) < menor) {
                menor = Integer.parseInt(fechaFundacion[i]);
                posicion = i;
            }
        }
        System.out.println("El equipo más antiguo es: " + nombre[posicion] + " fundado en " + menor);
    }

    //El equipo más reciente
    public void equipoMasReciente() {
        int mayor = Integer.parseInt(fechaFundacion[0]);
        int posicion = 0;
        for (int i = 0; i < 10; i++) {
            if (Integer.parseInt(fechaFundacion[i]) > mayor) {
                mayor = Integer.parseInt(fechaFundacion[i]);
                posicion = i;
            }
        }
        System.out.println("El equipo más reciente es: " + nombre[posicion] + " fundado en " + mayor);
    }

    //Equipos de un país
    public void equiposPais(String pais) {
        System.out.println("Equipos de " + pais);
        for (int i = 0; i < 10; i++) {
            if (this.pais[i].equals(pais)) {
                System.out.println(nombre[i]);
            }
        }
    }

    //Los 3 equipos con más títulos
    public void tresEquiposMasTitulos() {
        int mayor = titulos[0];
        int posicion = 0;
        for (int i = 0; i < 10; i++) {
            if (titulos[i] > mayor) {
                mayor = titulos[i];
                posicion = i;
            }
        }
        System.out.println("El equipo con más títulos es: " + nombre[posicion] + " con " + mayor + " títulos");
    }

    //Los 3 equipos con menos títulos
    public void tresEquiposMenosTitulos() {
        int menor = titulos[0];
        int posicion = 0;
        for (int i = 0; i < 10; i++) {
            if (titulos[i] < menor) {
                menor = titulos[i];
                posicion = i;
            }
        }
        System.out.println("El equipo con menos títulos es: " + nombre[posicion] + " con " + menor + " títulos");
    }

}