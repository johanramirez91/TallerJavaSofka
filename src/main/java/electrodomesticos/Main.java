package electrodomesticos;

public class Main {
    public static void main(String[] args) {

        float precioTelevisor = 0;
        float precioLavadora = 0;
        float precioElectrodomestico = 0;

        Electrodomestico[] electrodomesticos = new Electrodomestico[10];
        electrodomesticos[0] = new Television(250, "negro", 'C', 10, 55, true);
        electrodomesticos[1] = new Lavadora(100, 30);
        electrodomesticos[3] = new Lavadora(180, 60);
        electrodomesticos[2] = new Television(260, 5);
        electrodomesticos[4] = new Television(500, "azul", 'B', 8, 65, true);
        electrodomesticos[5] = new Electrodomestico(390, "rojo", 'E', 95);
        electrodomesticos[6] = new Lavadora(350, 80);
        electrodomesticos[7] = new Television(290, 12);
        electrodomesticos[8] = new Electrodomestico(190, "rojo", 'E', 105);
        electrodomesticos[9] = new Television(190, "gris", 'D', 7, 32, false);

        for (Electrodomestico electrodomestico : electrodomesticos) {
            System.out.println("El precio final del prodcuto es: " + electrodomestico.precioFinal());
        }

        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico instanceof Television) {
                precioTelevisor += electrodomestico.precioFinal();
            } else if (electrodomestico instanceof Lavadora) {
                precioLavadora += electrodomestico.precioFinal();
            } else {
                precioElectrodomestico += electrodomestico.precioFinal();
            }
        }
        System.out.println("---------------------------------------");
        System.out.println("Detalle cobros:\n" +
                "€ " + precioTelevisor + " por televisores\n" +
                "€ " + precioLavadora + " por lavadoras\n" +
                "€ " + precioElectrodomestico + " por los electrodomesticos restantes\n" +
                "Total compras $" + (precioTelevisor + precioLavadora + precioElectrodomestico));
    }
}

