public class Posiciones {
    //Columnas: Equipo, Puntos, PJ, PG, PE, PP, GF, GC, DIF
    public String codEquipo[] = new String[10];
    public int puntos[] = new int[10];
    public int pj[] = new int[10];
    public int pg[] = new int[10];
    public int pe[] = new int[10];
    public int pp[] = new int[10];
    public int gf[] = new int[10];
    public int gc[] = new int[10];
    public int dif[] = new int[10];

    //Constructor
    public Posiciones() {
        //El codigo del equipo es el mismo que el de la tabla de equipos
        for (int i = 0; i < 10; i++) {
            codEquipo[i] = "";
            puntos[i] = 0;
            pj[i] = 0;
            pg[i] = 0;
            pe[i] = 0;
            pp[i] = 0;
            gf[i] = 0;
            gc[i] = 0;
            dif[i] = 0;
        }

        //Asignamos los codigos de los equipos
        Equipos equipos = new Equipos();
        for (int i = 0; i < 10; i++) {
            codEquipo[i] = equipos.codigo[i];
        }

    }

    //Tabla de posiciones
    public void posicionesTabla() {
        // Data de Equipos
        Equipos equipos = new Equipos();
        // Data de Partidos
        Partidos partidos = new Partidos();

        //Recorremos los partidos y asignamos solo los puntos
        for (int i = 0; i < 20; i++) {
            //Buscamos la posicion del equipo local
            int posicionLocal = 0;
            for (int j = 0; j < 10; j++) {
                if (partidos.local[i].equals(equipos.codigo[j])) {
                    posicionLocal = j;
                }
            }
            //Buscamos la posicion del equipo visitante
            int posicionVisitante = 0;
            for (int j = 0; j < 10; j++) {
                if (partidos.visitante[i].equals(equipos.codigo[j])) {
                    posicionVisitante = j;
                }
            }
            //Asignamos los puntos
            if (partidos.golesLocal[i] > partidos.golesVisitante[i]) {
                puntos[posicionLocal] += 3;
            } else if (partidos.golesLocal[i] < partidos.golesVisitante[i]) {
                puntos[posicionVisitante] += 3;
            } else {
                puntos[posicionLocal] += 1;
                puntos[posicionVisitante] += 1;
            }

            //Asignamos los partidos jugados
            pj[posicionLocal] += 1;
            pj[posicionVisitante] += 1;

            //Asignamos los goles a favor
            gf[posicionLocal] += partidos.golesLocal[i];
            gf[posicionVisitante] += partidos.golesVisitante[i];

            //Asignamos los goles en contra
            gc[posicionLocal] += partidos.golesVisitante[i];
            gc[posicionVisitante] += partidos.golesLocal[i];

            //Asignamos la diferencia de goles
            dif[posicionLocal] = gf[posicionLocal] - gc[posicionLocal];
            dif[posicionVisitante] = gf[posicionVisitante] - gc[posicionVisitante];

            //Asignamos los partidos ganados
            if (partidos.golesLocal[i] > partidos.golesVisitante[i]) {
                pg[posicionLocal] += 1;
                pp[posicionVisitante] += 1;
            } else if (partidos.golesLocal[i] < partidos.golesVisitante[i]) {
                pg[posicionVisitante] += 1;
                pp[posicionLocal] += 1;
            } else {
                pe[posicionLocal] += 1;
                pe[posicionVisitante] += 1;
            }

            //Asignamos los partidos perdidos
            pp[posicionLocal] = pj[posicionLocal] - pg[posicionLocal] - pe[posicionLocal];
            pp[posicionVisitante] = pj[posicionVisitante] - pg[posicionVisitante] - pe[posicionVisitante];

            //Asignamos los partidos empatados
            pe[posicionLocal] = pj[posicionLocal] - pg[posicionLocal] - pp[posicionLocal];
            pe[posicionVisitante] = pj[posicionVisitante] - pg[posicionVisitante] - pp[posicionVisitante];

        }

        //Creamos un arreglo de posiciones
        int posiciones[] = new int[10];
        for (int i = 0; i < 10; i++) {
            posiciones[i] = i;
        }

        //Ordenamos el arreglo de posiciones
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (puntos[posiciones[j]] < puntos[posiciones[j + 1]]) {
                    int aux = posiciones[j];
                    posiciones[j] = posiciones[j + 1];
                    posiciones[j + 1] = aux;
                }
            }
        }

        //Mostramos la tabla de posiciones
        System.out.println("Tabla de Posiciones");
        System.out.println("Equipo\t\t\t\t\t\tPts\tPJ\tPG\tPE\tPP\tGF\tGC\tDIF");
        for (int i = 0; i < 10; i++) {
            System.out.println(equipos.nombre[posiciones[i]] + "\t\t\t" + puntos[posiciones[i]] + "\t" + pj[posiciones[i]] + "\t" + pg[posiciones[i]] + "\t" + pe[posiciones[i]] + "\t" + pp[posiciones[i]] + "\t" + gf[posiciones[i]] + "\t" + gc[posiciones[i]] + "\t" + dif[posiciones[i]]);
        }



    }

}
