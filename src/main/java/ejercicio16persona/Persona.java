package ejercicio16persona;


public class Persona {
    private String nombre = "";
    private short edad = 0;
    private String SEXO = "H";
    private float peso = 0;
    private float altura = 0;
    private String dni;

    public Persona (){
        this.dni = this.generarDNI();
    }

    public Persona(String nombre, short edad, String SEXO) {
        this.dni = this.generarDNI();
        this.nombre = nombre;
        this.edad = edad;
        this.SEXO = SEXO;
    }

    public Persona(String nombre, short edad, String SEXO, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.SEXO = SEXO;
        this.peso = peso;
        this.altura = altura;
        this.dni = this.generarDNI();
    }

    public float calcularIMC() {
        float imc = peso / (altura * altura);
        final byte BAJO = -1;
        final byte IDEAL = 0;
        final byte SOBREPESO = 1;

        if (imc < 20) {
            System.out.println("Está por debajo de su peso ideal");
            return BAJO;
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("Está en su peso ideal");
            return IDEAL;
        } else {
            System.out.println("Está en sobrepeso");
            return SOBREPESO;
        }
    }

    public boolean esMayorDeEdad() {
        final short MAYOREDAD = 18;
        return (edad >= MAYOREDAD);
    }

    private boolean comprobarSexo(char sexo) {
        if (sexo == 'M' || sexo == 'H') {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Persona{"   +
                "nombre='"  + nombre + '\'' +
                ", edad="   + edad +
                ", SEXO="   + SEXO +
                ", peso="   + peso +
                ", altura=" + altura +
                ", dni="    + dni +
                '}';
    }

    private String generarDNI(){
        String dni = "";
        for (int valor = 0; valor < 8; valor++) {
            dni += String.valueOf(Math.round(Math.random() * 10));
        }
        int verificador = Integer.valueOf(dni) % 23;
        String[] Letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        dni = dni.concat(Letras[verificador]);
        this.dni = dni;
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public void setSEXO(String SEXO) {
        this.SEXO = SEXO;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
