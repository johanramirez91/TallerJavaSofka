package fechayhoraactual;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Realizar un algoritmo que permita consulta la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)
 *
 * @author Johan Ramirez Martinez
 */

public class FechaHoraActual {
    public static void main(String[] args) {
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("Fecha y hora actual: ");
        System.out.println("(AAAA/MM/DD) (HH:MM:SS) -> "+ formatoFecha.format(LocalDateTime.now()));
    }
}
