package electrodomesticos;

import java.util.HashMap;
import java.util.Map;

public class Electrodomestico {

    protected double PRECIOBASE = 100.0;
    protected String COLOR = "blanco";
    protected char CONSUMO_ENERGETICO = 'F';
    protected double PESO = 5.0;

    public Electrodomestico(double PRECIOBASE, double PESO) {
        this.PRECIOBASE = PRECIOBASE;
        this.PESO = PESO;
    }

    public Electrodomestico(double PRECIOBASE, String COLOR, char CONSUMO_ENERGETICO, double PESO) {
        this.PRECIOBASE = PRECIOBASE;
        this.COLOR = COLOR;
        this.CONSUMO_ENERGETICO = CONSUMO_ENERGETICO;
        this.PESO = PESO;
    }

    private boolean comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        switch (letra) {
            case 'A', 'B', 'C', 'D', 'E', 'F' -> {
                return true;
            }
            default -> {
                this.CONSUMO_ENERGETICO = 'F';
                return false;
            }
        }
    }

    private boolean comprobarColor(String color) {
        switch (color.toLowerCase()) {
            case "blanco", "negro", "rojo", "azul", "gris" -> {
                return true;
            }
            default -> {
                this.COLOR = "BLANCO";
                return false;
            }
        }
    }

    public double precioFinal() {
        Map<Character, Double> precio = new HashMap<Character, Double>();
        precio.put('A', 100.0);
        precio.put('B', 80.0);
        precio.put('C', 60.0);
        precio.put('D', 50.0);
        precio.put('E', 30.0);
        precio.put('F', 10.0);

        PRECIOBASE += precio.get(CONSUMO_ENERGETICO);

        if (PESO >= 0 && PESO <= 19) {
            PRECIOBASE += 10;
        } else if (PESO >= 20 && PESO <= 49) {
            PRECIOBASE += 50;
        } else if (PESO >= 50 && PESO <= 79) {
            PRECIOBASE += 80;
        } else if (PESO >= 80) {
            PRECIOBASE += 100;
        }
        return PRECIOBASE;
    }

    public double getPRECIOBASE() {
        return PRECIOBASE;
    }

    public String getCOLOR() {
        return COLOR;
    }

    public char getCONSUMO_ENERGETICO() {
        return CONSUMO_ENERGETICO;
    }

    public double getPESO() {
        return PESO;
    }
}
