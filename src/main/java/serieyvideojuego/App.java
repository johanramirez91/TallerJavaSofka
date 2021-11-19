package serieyvideojuego;

public class App {
    public static void main(String[] args) {
        Serie[] series = new Serie[5];
        Videojuego[] videojuegos = new Videojuego[5];
        short seriesRegresadas = 0;
        short juegosRegresados = 0;
        Videojuego juegoMasLargo = new Videojuego();
        Serie serieMasLarga = new Serie();

        series[0] = new Serie("Rick & Morty", (short) 5, "Comedia Adultos","Justin Roiland, Dan Harmon");
        series[1] = new Serie("The boys", (short) 3, "Superhéroes, Humor negro", "Eric Kripke");
        series[2] = new Serie("Mr Robot", "Sam Esmail");
        series[3] = new Serie("The Queen's Gambit", (short) 1, "Drama", "Scott Frank");
        series[4] = new Serie("The big bang theory", "Chuck Lorre, Bill Prady, Maria Ferrari, Jim Reynolds");

        videojuegos[0] = new Videojuego("Crash Bandicoot", (short) 36, "Plataformas", "NaughtyDog");
        videojuegos[1] = new Videojuego("Super Smash Bros", (short) 12, "Cooperativo", "Nintendo");
        videojuegos[2] = new Videojuego("Street Fighter", (short) 16);
        videojuegos[3] = new Videojuego("Medal of honor", (short) 42, "Shooter", "Electronic Arts");
        videojuegos[4] = new Videojuego("Mortal Kombat", (short) 20);

        videojuegos[3].entregar();
        series[1].entregar();
        videojuegos[0].entregar();
        series[2].entregar();

        for (Serie serie : series) {
            if (serie.isEntregado()) {
                seriesRegresadas += 1;
                serie.devolver();
            }
            if (serie.getNumeroDeTemporadas() > serieMasLarga.getNumeroDeTemporadas()) {
                serieMasLarga = serie;
            }
        }
        System.out.println("Se regresaron: " + seriesRegresadas + " series");
        System.out.println("La serie más larga es: \n" + serieMasLarga);

        for (Videojuego juego : videojuegos) {
            if (juego.isEntregado()) {
                juegosRegresados += 1;
                juego.devolver();
            }
            if (juego.getHorasEstimadas() > juegoMasLargo.getHorasEstimadas()) {
                juegoMasLargo = juego;
            }
        }
        System.out.println("Se regresaron: " + juegosRegresados + " videojuegos");
        System.out.println("El juego más largo es: \n" + juegoMasLargo);
    }
}
