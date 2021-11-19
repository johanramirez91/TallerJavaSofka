package serieyvideojuego;

public class Videojuego implements Entregable{
    private String titulo = "";
    private short horasEstimadas = 10;
    private boolean entregado = false;
    private String genero = "";
    private String compania = "";

    public Videojuego() {

    }

    public Videojuego(String titulo, short horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, short horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public short getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(short horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "Videojuego{\n" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }

    @Override
    public boolean entregar() {
        this.entregado = true;
        return this.entregado;
    }

    @Override
    public boolean devolver() {
        this.entregado = false;
        return this.entregado;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object juego) {
        short horas = horasEstimadas;
        short castHorasEstimadas = (short) ((Short) horas).compareTo(((Serie) juego).getNumeroDeTemporadas());
        return castHorasEstimadas;
    }
}
