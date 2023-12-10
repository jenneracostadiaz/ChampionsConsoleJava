public class Partidos {
    public String codigo[] = new String[20];
    public String jornada[] = new String[20];
    public String local[] = new String[20];
    public String visitante[] = new String[20];
    public int golesLocal[] = new int[20];
    public int golesVisitante[] = new int[20];

    //Constructor
    public Partidos() {
        codigo[0] = "P001";
        jornada[0] = "01/12/2023";
        local[0] = "E002";
        visitante[0] = "E010";
        golesLocal[0] = 2;
        golesVisitante[0] = 1;

        codigo[1] = "P002";
        jornada[1] = "01/12/2023";
        local[1] = "E004";
        visitante[1] = "E008";
        golesLocal[1] = 1;
        golesVisitante[1] = 2;

        codigo[2] = "P003";
        jornada[2] = "01/12/2023";
        local[2] = "E006";
        visitante[2] = "E007";
        golesLocal[2] = 3;
        golesVisitante[2] = 1;

        codigo[3] = "P004";
        jornada[3] = "01/12/2023";
        local[3] = "E008";
        visitante[3] = "E005";
        golesLocal[3] = 2;
        golesVisitante[3] = 3;

        codigo[4] = "P005";
        jornada[4] = "02/12/2023";
        local[4] = "E010";
        visitante[4] = "E003";
        golesLocal[4] = 1;
        golesVisitante[4] = 2;

        codigo[5] = "P006";
        jornada[5] = "02/12/2023";
        local[5] = "E001";
        visitante[5] = "E009";
        golesLocal[5] = 2;
        golesVisitante[5] = 1;

        codigo[6] = "P007";
        jornada[6] = "02/12/2023";
        local[6] = "E003";
        visitante[6] = "E001";
        golesLocal[6] = 3;
        golesVisitante[6] = 2;

        codigo[7] = "P008";
        jornada[7] = "02/12/2023";
        local[7] = "E005";
        visitante[7] = "E006";
        golesLocal[7] = 1;
        golesVisitante[7] = 3;

        codigo[8] = "P009";
        jornada[8] = "03/12/2023";
        local[8] = "E007";
        visitante[8] = "E004";
        golesLocal[8] = 2;
        golesVisitante[8] = 1;

        codigo[9] = "P010";
        jornada[9] = "03/12/2023";
        local[9] = "E009";
        visitante[9] = "E002";
        golesLocal[9] = 1;
        golesVisitante[9] = 2;

        codigo[10] = "P011";
        jornada[10] = "03/12/2023";
        local[10] = "E001";
        visitante[10] = "E009";
        golesLocal[10] = 3;
        golesVisitante[10] = 1;

        codigo[11] = "P012";
        jornada[11] = "03/12/2023";
        local[11] = "E003";
        visitante[11] = "E007";
        golesLocal[11] = 2;
        golesVisitante[11] = 3;

        codigo[12] = "P013";
        jornada[12] = "04/12/2023";
        local[12] = "E005";
        visitante[12] = "E003";
        golesLocal[12] = 1;
        golesVisitante[12] = 2;

        codigo[13] = "P014";
        jornada[13] = "04/12/2023";
        local[13] = "E007";
        visitante[13] = "E001";
        golesLocal[13] = 2;
        golesVisitante[13] = 1;

        codigo[14] = "P015";
        jornada[14] = "04/12/2023";
        local[14] = "E009";
        visitante[14] = "E010";
        golesLocal[14] = 3;
        golesVisitante[14] = 2;

        codigo[15] = "P016";
        jornada[15] = "04/12/2023";
        local[15] = "E002";
        visitante[15] = "E008";
        golesLocal[15] = 1;
        golesVisitante[15] = 3;

        codigo[16] = "P017";
        jornada[16] = "05/12/2023";
        local[16] = "E004";
        visitante[16] = "E006";
        golesLocal[16] = 2;
        golesVisitante[16] = 1;

        codigo[17] = "P018";
        jornada[17] = "05/12/2023";
        local[17] = "E006";
        visitante[17] = "E002";
        golesLocal[17] = 1;
        golesVisitante[17] = 2;

        codigo[18] = "P019";
        jornada[18] = "05/12/2023";
        local[18] = "E008";
        visitante[18] = "E010";
        golesLocal[18] = 3;
        golesVisitante[18] = 1;

        codigo[19] = "P020";
        jornada[19] = "05/12/2023";
        local[19] = "E010";
        visitante[19] = "E004";
        golesLocal[19] = 2;
        golesVisitante[19] = 3;

    }

    //Data para los Partidos - Arreglos Paralelos
//    public class PartidosData {
//        public String codigo[] = {"P001", "P002", "P003", "P004", "P005", "P006", "P007", "P008", "P009", "P010", "P011", "P012", "P013", "P014", "P015", "P016", "P017", "P018", "P019", "P020"};
//        public String jornada[] = {"01/12/2023", "01/12/2023", "01/12/2023", "01/12/2023", "02/12/2023", "02/12/2023", "02/12/2023", "02/12/2023", "03/12/2023", "03/12/2023", "03/12/2023", "03/12/2023", "04/12/2023", "04/12/2023", "04/12/2023", "04/12/2023", "05/12/2023", "05/12/2023", "05/12/2023", "05/12/2023"};
//        public String local[] = {"E002", "E004", "E006", "E008", "E010", "E001", "E003", "E005", "E007", "E009", "E001", "E003", "E005", "E007", "E009", "E002", "E004", "E006", "E008", "E010"};
//        public String visitante[] = {"E010", "E008", "E007", "E005", "E003", "E009", "E001", "E006", "E004", "E002", "E009", "E007", "E005", "E003", "E001", "E010", "E008", "E006", "E004", "E002"};
//        public int golesLocal[] = {2, 1, 3, 2, 1, 2, 3, 1, 2, 1, 3, 2, 1, 2, 3, 1, 2, 1, 3, 2};
//        public int golesVisitante[] = {1, 2, 1, 3, 2, 1, 2, 3, 1, 2, 1, 3, 2, 1, 2, 3, 1, 2, 1, 3};
//    }

    public void mostrarPartidos() {
        Equipos equipos = new Equipos();
        for (int i = 0; i < 20; i++) {
            System.out.println("Código: " + codigo[i]);
            System.out.println("Jornada: " + jornada[i]);
            System.out.println("Local: " + equipos.nombreEquipo(local[i]));
            System.out.println("Visitante: " + equipos.nombreEquipo(visitante[i]));
            System.out.println("Goles Local: " + golesLocal[i]);
            System.out.println("Goles Visitante: " + golesVisitante[i]);
            System.out.println();
        }
    }

    //Cantidad de partidos jugados
    public int partidosJugados(String codigoEquipo) {
        Equipos equipos = new Equipos();
        int partidosJugados = 0;
        for (int i = 0; i < 20; i++) {
            if (local[i].equals(codigoEquipo) || visitante[i].equals(codigoEquipo)) {
                partidosJugados += 1;
            }
        }
        return partidosJugados;

    }

    //Cantidad de partidos ganados
    public int partidosGanados(String codigoEquipo) {
        Equipos equipos = new Equipos();
        int partidosGanados = 0;
        for (int i = 0; i < 20; i++) {
            if (local[i].equals(codigoEquipo) && golesLocal[i] > golesVisitante[i]) {
                partidosGanados += 1;
            } else if (visitante[i].equals(codigoEquipo) && golesVisitante[i] > golesLocal[i]) {
                partidosGanados += 1;
            }
        }
        return partidosGanados;
    }

    //Cantidad de partidos perdidos
    public int partidosPerdidos(String codigoEquipo) {
        Equipos equipos = new Equipos();
        int partidosPerdidos = 0;
        for (int i = 0; i < 20; i++) {
            if (local[i].equals(codigoEquipo) && golesLocal[i] < golesVisitante[i]) {
                partidosPerdidos += 1;
            } else if (visitante[i].equals(codigoEquipo) && golesVisitante[i] < golesLocal[i]) {
                partidosPerdidos += 1;
            }
        }
        return partidosPerdidos;
    }

    //Cantidad de partidos empatados
    public int partidosEmpatados(String codigoEquipo) {
        Equipos equipos = new Equipos();
        int partidosEmpatados = 0;
        for (int i = 0; i < 20; i++) {
            if (local[i].equals(codigoEquipo) && golesLocal[i] == golesVisitante[i]) {
                partidosEmpatados += 1;
            } else if (visitante[i].equals(codigoEquipo) && golesVisitante[i] == golesLocal[i]) {
                partidosEmpatados += 1;
            }
        }
        return partidosEmpatados;
    }

    //Partidos jugados por equipo
    public void partidosEquipo(String codigoEquipo) {
        Equipos equipos = new Equipos();
        System.out.println();
        System.out.println("Equipo: " + equipos.nombreEquipo(codigoEquipo));
        System.out.println("Partidos jugados: " + partidosJugados(codigoEquipo));
        System.out.println("Partidos ganados: " + partidosGanados(codigoEquipo));
        System.out.println("Partidos perdidos: " + partidosPerdidos(codigoEquipo));
        System.out.println("Partidos empatados: " + partidosEmpatados(codigoEquipo));
        System.out.println();
        System.out.println("* * * Partidos jugados por "+ equipos.nombreEquipo(codigoEquipo) +" * * *");
        System.out.println();
        for (int i = 0; i < 20; i++) {
            if (local[i].equals(codigoEquipo) || visitante[i].equals(codigoEquipo)) {
                System.out.println("Jornada: " + jornada[i]);
                System.out.println("Local: " + equipos.nombreEquipo(local[i]));
                System.out.println("Visitante: " + equipos.nombreEquipo(visitante[i]));
                System.out.println("Resultado: " + golesLocal[i] + " - " + golesVisitante[i]);
                System.out.println();
            }
        }
    }
}
