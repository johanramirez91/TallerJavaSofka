package electrodomesticos;

public class Lavadora extends Electrodomestico {
    private final float CARGA = 5;

    public Lavadora(double PRECIOBASE, double PESO) {
        super(PRECIOBASE, PESO);
    }

    public Lavadora(double PRECIOBASE, String COLOR, char CONSUMO_ENERGETICO, double PESO) {
        super(PRECIOBASE, COLOR, CONSUMO_ENERGETICO, PESO);
    }


    public double precioFinal() {
        super.precioFinal();
        if (CARGA > 30) {
            PRECIOBASE += 50;
        }
        return PRECIOBASE;
    }

    public float getCARGA() {
        return CARGA;
    }
}
