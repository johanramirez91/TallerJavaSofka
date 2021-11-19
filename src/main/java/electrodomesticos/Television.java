package electrodomesticos;

public class Television extends Electrodomestico {
    private int resolucion = 20;
    private boolean sintonizadorTDT = false;

    public Television(double PRECIOBASE, double PESO) {
        super(PRECIOBASE, PESO);
    }

    public Television(double PRECIOBASE, String COLOR, char CONSUMO_ENERGETICO, double PESO, int resolucion, boolean sintonizadorTDT) {
        super(PRECIOBASE, COLOR, CONSUMO_ENERGETICO, PESO);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double precioFinal() {
        super.precioFinal();
        if (resolucion > 40) {
            PRECIOBASE += PRECIOBASE * 1.3;
        }
        if (sintonizadorTDT == true) {
            PRECIOBASE += 50;
        }
        return PRECIOBASE;
    }

    public float getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }
}
