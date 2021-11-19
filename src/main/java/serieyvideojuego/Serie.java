package serieyvideojuego;

public class Serie implements Entregable {
    private String titulo = "";
    private short numeroDeTemporadas = 3;
    private boolean entregado = false;
    private String genero = "";
    private String creador = "";

    public Serie() {

    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, short numeroDeTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public short getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(short numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{\n" +
                "titulo='" + titulo + '\'' +
                ", numeroDeTemporadas=" + numeroDeTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
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
    public int compareTo(Object serie) {
        short temporadas = numeroDeTemporadas;
        short castTemporadas = (short) ((Short) temporadas).compareTo(((Serie) serie).getNumeroDeTemporadas());
        return castTemporadas;
    }
}
